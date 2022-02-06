package PatProject;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;

public class PersonService {
    public ArrayList<Person> sendRequestToRandomUsersApi(int numbersPerson) throws IOException, InterruptedException {
        ArrayList<Person> personList = new ArrayList<>();
        for (int i = 0; i < numbersPerson; i++) {

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://randomuser.me/api"))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            Person person = parseJsonResponseToPerson(response.body());
            personList.add(person);
        }
        return personList;
    }

    public Person parseJsonResponseToPerson(String data) {

        JSONObject fullJsonObject = new JSONObject(data)
                .getJSONArray("results")
                .getJSONObject(0);
        Person person = new Person();

        JSONObject dob = fullJsonObject.getJSONObject("dob");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dob.getString("date"));
        JSONObject name = fullJsonObject.getJSONObject("name");
        JSONObject location = fullJsonObject.getJSONObject("location");

        person.setFirstName(name.getString("first"));
        person.setLastName(name.getString("last"));
        person.setGender(fullJsonObject.getString("gender"));
        person.setBod(zonedDateTime.toLocalDate());
        person.setCountry(location.getString("country"));
        person.setEmail(fullJsonObject.getString("email"));

        String firstName = name.getString("first");
        String lastName = name.getString("last");
        String gender = fullJsonObject.getString("gender");
        String country = location.getString("country");
        String email = fullJsonObject.getString("email");
        LocalDate bod = zonedDateTime.toLocalDate();

        Supplier <Person> supplier = () -> new Person(firstName,lastName,gender, email,bod,country);
        return person;


    }
}
