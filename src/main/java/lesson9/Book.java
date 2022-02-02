package lesson9;

import java.util.Objects;

public class Book extends PrintPubl{
    private String avtor;

    public Book(){
    }
    public Book (String avtor, int pages, String name, int yearPubl,String publisher ){
        super(name, yearPubl, publisher);
        this.avtor = avtor;
        this.setPages(pages);
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }


    @Override
    public void printPubl() {
        System.out.printf("Книга: автор - %s, кол-во страниц - %s, название книги - %s, год выхода - %s, издательство %s.\n", avtor, getPages(), getName(), getYear(), getPublisher());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(avtor, book.avtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), avtor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + avtor + '\'' +
                '}';
    }
}