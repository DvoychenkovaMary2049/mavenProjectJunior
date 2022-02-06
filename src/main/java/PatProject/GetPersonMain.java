package PatProject;

import java.io.IOException;
import java.util.ArrayList;

public class GetPersonMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        try {
            ArrayList<Person> arrayList1 = personService.sendRequestToRandomUsersApi(5);
            System.out.println(arrayList1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
