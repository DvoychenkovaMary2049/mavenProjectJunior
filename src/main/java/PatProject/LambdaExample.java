package PatProject;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample {
    public static Integer getLenhgt(Function<String, Integer> function, String s){
        Integer apply = function.apply(s);
        return apply;
    }
    public static void filtering(ArrayList<Person> personList,
                                 Predicate<Person> predicito,
                                 Consumer <Person> cosumerito) {

        for (Person person : personList) {
            if (predicito.test(person)) cosumerito.accept(person);
        }
    }

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        try {
            ArrayList<Person> arrayList = personService.sendRequestToRandomUsersApi(10);
            System.out.println(arrayList);
//            filtering(arrayList, new Predicito<Person>() {
//                @Override
//                public boolean test(Person person) {
//                    return LocalDate.now().getYear() - person.getBod().getYear() <40;
//                }
//            });
//              - Самый длинный вариант
//            filtering(arrayList, (Person person) -> {
//                return LocalDate.now().getYear() - person.getBod().getYear() < 40;
//            });

//            filtering(arrayList, person -> {
//                System.out.println(person);
//                return LocalDate.now().getYear() - person.getBod().getYear() < 40;
//            });





            Predicate <Person> consumer = person -> LocalDate.now().getYear() - person.getBod().getYear() < 40;
            Predicate <Person> consumer2 = person -> person.getCountry().equals("Germany");
//                    and(&&)  or||  negate(!)
            filtering(arrayList, consumer.and(consumer2),
                    person -> person.setFirstName(person.getFirstName().toUpperCase(Locale.ROOT)));

            TreeSet<Person> people = new TreeSet<Person>((o, o1) -> {
                if (o.getBod().getYear() - o1.getBod().getYear() == 0) {
                    return 0;
                }
                if (o.getFirstName().equals(o1.getFirstName())) {
                    return 1;
                }
                return -1;
            });


//            filtering(arrayList, person -> LocalDate.now().getYear() - person.getBod().getYear() < 40);

            arrayList.removeIf(person -> person.getCountry().equals("Iran"));
            System.out.println(arrayList);


            Thread thread = new Thread(()-> System.out.println("sfdf"));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Integer lambda = getLenhgt(s -> s.length(), "lambda");
    }
}

interface Predicito<T> {

    boolean test(T t);

}

interface Cosumerito <T>{
    void accepr (T t);

}
