package lesson9;

import java.util.Objects;

public class PrintPubl {
    private String name;
    private int yearPubl;
    private String publisher;
    private int pages;


    public PrintPubl() {
    }

    public PrintPubl(String name, int year, String publisher) {
        this.name = name;
        this.yearPubl = year;
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public int getYearPubl() {
        return yearPubl;
    }

    public void setYearPubl(int yearPubl) {
        this.yearPubl = yearPubl;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return yearPubl;
    }

    public void setYear(int year) {
        this.yearPubl = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintPubl printPubl = (PrintPubl) o;
        return yearPubl == printPubl.yearPubl && Objects.equals(name, printPubl.name) && Objects.equals(publisher, printPubl.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPubl, publisher);
    }

    @Override
    public String toString() {
        return "PrintPubl{" +
                "name='" + name + '\'' +
                ", year=" + yearPubl +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public void printPubl() {
        System.out.printf("Печатное издание : %s, год выхода - %s,издательство %s.\n", name, yearPubl, publisher);
    }

}
