public class Main {
    public static void main(String[] args) {

        Author chehov = new Author("Антон", "Чехов");
        Author rowling = new Author("Джоан", "Роулинг");
        Author remark = new Author("Эрих Мария", "Ремарк");

        Book stories = new Book("Рассказы", chehov, 1985);
        Book potter = new Book("Гарри Поттер", rowling, 2005);
        Book three_comrades = new Book("Три товарища", remark, 2015);

        potter.setYear(2022);

        System.out.println(potter.getName() + " " + rowling.getAuthorName() + " " + rowling.getAuthorSurname() + " " + potter.getYear());
    }
}