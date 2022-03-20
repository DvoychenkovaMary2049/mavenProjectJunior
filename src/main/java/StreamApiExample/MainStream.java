package StreamApiExample;

import PatProject.Person;
import PatProject.PersonService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) throws IOException, InterruptedException {
        PersonService personService = new PersonService();

        ArrayList<Person> arrayList = personService.sendRequestToRandomUsersApi(10);
        System.out.println(arrayList);
        for (Person person : arrayList) {
            person.getCountry();
        }
        arrayList
                .stream()
                .map(person -> person.getCountry())
                .filter(country -> country.equals("United Kingdom")).forEach(System.out::println);

        List<String> collect = arrayList
                .stream()
                .filter(person -> person.getBod().getYear() < 1980)
                .map(person -> person.getFirstName().toUpperCase(Locale.ROOT))
                .peek(System.out::println).collect(Collectors.toList());

        System.out.println(collect);

//        arrayList.stream()

//        Optional<Integer> optional = Stream.of(1, 3, 5, 6, 7, 8, 9).reduce((acc, n) -> acc + n);
//        optional.ifPresent();
        Stream.of(1, 3, 5, 6, 7, 8, 9).reduce((acc, n) -> acc + n).ifPresent(System.out::println);
//        Integer reduce = Stream.of(1, 3, 5, 6, 7, 8, 9).reduce(0, (acc, n) -> acc + n);

        arrayList
                .stream()
                .map(person -> person.getBod().getYear())
                .reduce((acc, year) -> acc + (LocalDate.now().getYear() - year)).ifPresent(System.out::println);

        arrayList
                .stream()
                .sorted((p,p1) ->{
                    if (p.getFirstName().compareTo(p1.getFirstName()) !=0) {
                        return p.getFirstName().compareTo(p1.getFirstName());
                    } else if (p.getLastName().compareTo(p1.getLastName())!=0) {
                        return p.getLastName().compareTo(p1.getLastName());
                    }else {
                        return p.getBod().compareTo(p1.getBod());
                    }
                }).forEach(System.out::println);
        Stream.of(111,111,221,32,43).distinct().forEach(System.out::println);
        HashSet<Person> people = new HashSet<>(arrayList);

    }
}
