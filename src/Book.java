public class Book {
    private String name;
    Author name2;
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

    public void setYear(int year) {
        this.year = year;
    }
}
