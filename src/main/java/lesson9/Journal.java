package lesson9;

import java.util.Objects;

public class Journal extends PrintPubl{
    private int number;

    public Journal() {
    }

    public Journal(int number) {
        this.number = number;
    }

    public Journal(String name, int year, String publisher, int number, int pages) {
        super(name, year, publisher);
        this.number = number;
        this.setPages(pages);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void printPubl() {
        System.out.printf("Журнал: название - %s, год выхода - %s,издательство %s, %s номер, кол - во страниц - %s.\n", getName(), getYear(),getPublisher(),number, getPages() );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal = (Journal) o;
        return number == journal.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "number=" + number +
                '}';
    }
}
