package lesson13;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(170);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
