package StreamApiExample;

import PatProject.Person;
import PatProject.PersonService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        PersonService personService= new PersonService();

        ArrayList<Person> arrayList = personService.sendRequestToRandomUsersApi(20);

//        Map<Boolean, List<Person>> hashmap = arrayList
//                .stream()
//                .collect(Collectors.partitioningBy(s -> s.getBod().getYear() < 1990));
////    hashmap.get(true).stream()
//    hashmap.get(false).stream()
        ArrayList<Country> countries = new ArrayList<>();
         arrayList
                .stream()
                .collect(Collectors.groupingBy(Person::getCountry))
                 .forEach((k,v) ->countries.add(new Country(k,v)));

         countries.forEach(System.out::println);
        System.out.println("********************************************************");

        countries.stream().flatMap(c -> c.persons.stream())
                .forEach(System.out::println);
    }
}

class Country{
    String name;
    List<Person> persons;

    public Country(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(persons, country.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, persons);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
