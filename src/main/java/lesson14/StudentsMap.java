package lesson14;

import java.util.HashMap;
import java.util.Map;

public class StudentsMap {
    public static void main(String[] args) {
        Student student = new Student("Ivan","Ivanov",24);
        Student student1 = new Student("Vasya", "Pupkin",34);
        Student student2 = new Student("Gamer", "Simpson", 54);
        Student student5 = new Student("Ivan","Ivanov",24);

        Map <Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student,4);
        studentMap.put(student1,5);
        studentMap.put(student2,3);
        studentMap.putIfAbsent(student5,3);
        studentMap.remove(student1);

        System.out.println(studentMap.keySet());

        System.out.println(studentMap);

//        System.out.println(studentMap.get(student));
    }
}
