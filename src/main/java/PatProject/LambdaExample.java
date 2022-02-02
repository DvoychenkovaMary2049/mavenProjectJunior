package PatProject;

import java.util.ArrayList;

public class LambdaExample {
    public static void filtering(ArrayList<Person> personList, Predicito<Person> predicito){

        for (Person person: personList){
            if (predicito.test(person)) System.out.println(person);
        }
    }

    public static void main(String[] args) {
        PersonService personService = new PersonService();
//      ArrayList<Person>
        //Самый длинный вариант
//        filtering(arrayList, (Person person)-> {
//        return LocalDate.now().getYear() - person.GetBod().getYear() <40;
//        });
//        filtering(arrayList, person -> LocalDate.now().getYear() - person.GetBod().getYear() <40 );
    }
}
interface Predicito<T>{

    boolean test(T t);

}

