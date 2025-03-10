package bookstore;


import library.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    private String name;
    private ArrayList<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu knih. A ty prida do pole knih.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    public void addBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadej pocet knih k pridani: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<count; i++){
            System.out.println("Zadej udaje pro knihu:" + (i+1) + " : ");

            System.out.print("Nazev: ");
            String nazev = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Zanr: ");
            String genre = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Rok vydani: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Pocet stran: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(name, genre, year, pages));
        }
    }

    /**
     * Tato metoda vypise informace o knihach. Na prvnim rádku bude text "-----INFO O KNIHKUPECTVI----- ", na druhem bude název KNIHKUPECTVI a tecka.
     * Na tretim radku bude text "na sklade mame tyto knihy:" a následne budou vypsany vsichny knihy oddelene od sebe stredniken a to ve formátu "nazev : zanr : rok vydani" (Vyuzijte metodu printInfo() tridy Book.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");
        System.out.println("Name: " + name);
        System.out.println("Na sklade mame tuto knihu:");
        for (Book book : books) {
            System.out.println(book.printInfo());
        }
        System.out.println("-----");
    }
}

