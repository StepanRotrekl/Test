package bookstore;

public class Book {
    private String name;
    private String genre;
    private int year;
    private int pages;


    public Book(String name, String genre, int year, int pages) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String printInfo() {
        return name + " : " + genre + " : " + year;
    }

}
