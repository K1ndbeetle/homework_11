public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих Мария", "Ремарк");
        Author author2 = new Author("Оскар", "Уайльд");

        Book book1 = new Book("Жизнь взаймы", author1, 1977);
        Book book2 = new Book("Портрет Дориана Грея", author2, 1890);

        book1.setPublicationYear(1978);

        System.out.println(book1.getTitle() + ", " + book1.getPublicationYear() + " год, " + author1.getFirstName() + " "  + author1.getLastName() + ".");
        System.out.println(book2.getTitle() + ", " + book2.getPublicationYear() + " год, " + author2.getFirstName() + " "  + author2.getLastName() + ".");
    }
}