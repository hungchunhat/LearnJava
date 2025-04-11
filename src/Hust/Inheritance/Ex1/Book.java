package Hust.Inheritance.Ex1;

public class Book {
    private String name;
    private String author;
    private int numberOfPages;
    private static int numberOfBook = 0;
    public Book() {}
    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        numberOfBook++;
    }
    public static int getNumberOfBook() {
        return numberOfBook;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
