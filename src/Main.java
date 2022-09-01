public class Main {
    public static void main(String[] args) {

        Author chehov = new Author("Антон ", "Чехов ");
        Author rowling = new Author("Джоан ", "Роулинг ");
        Author remark = new Author("Эрих Мария ", "Ремарк ");

        Book stories = new Book("Рассказы ", chehov, 1985);
        Book potter = new Book("Гарри Поттер ", rowling, 2005);
        Book three_comrades = new Book("Три товарища ", remark, 2015);

        potter.setYear(2022);

        System.out.println(potter.getName() + " " + rowling.getAuthorName() + " " + rowling.getAuthorSurname() + " " + potter.getYear());

        Book [] books = new Book[3];
        books[0] = stories;
        books[1] = potter;
        books[2] = three_comrades;
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i].getName() + ": " + books[i].getName2() + ": " + books[i].getYear());
        }

        System.out.println(three_comrades);
    }
}