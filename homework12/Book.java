package homework12;

public class Book {
    private String bookName;
    private Author author;
    private int age;

    public Book(String bookName, Author author, int age) {
        this.bookName = bookName;
        this.author = author;
        this.age = age;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getAge() {
        return this.age;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
