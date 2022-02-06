package PatProject;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate bod;
    private String country;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, String email, LocalDate bod, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.bod = bod;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBod() {
        return bod;
    }

    public void setBod(LocalDate bod) {
        this.bod = bod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(email, person.email) && Objects.equals(bod, person.bod) && Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, email, bod, country);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", bod=" + bod +
                ", country='" + country + '\'' +
                '}';
    }
}
