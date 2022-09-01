import java.util.Objects;

public class Book {
    private String name;
    private Author name2;
    private int year;

    public Book(String name, Author name2, int year) {
        this.name = name;
        this.year = year;
        this.name2 = name2;
    }

    public String getName() {

        return this.name;
    }

    public int getYear() {

        return this.year;
    }

    public Author getName2() {

        return this.name2;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название " + this.name + "Автор " + this.name2 + "Год издания " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && Objects.equals(name2, book.name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, name2, year);
    }
}
