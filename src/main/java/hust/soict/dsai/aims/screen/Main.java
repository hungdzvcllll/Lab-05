package hust.soict.dsai.aims.screen;

import java.util.ArrayList;

import javax.naming.LimitExceededException;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.exception.PlayerException;

public class Main {
    public static void main(String args[]) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Inception", "Sci-Fi", 15.99f, 148, "Christopher Nolan");

        // Create the second object using the same constructor
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Avatar", "Action", 19.99f, 162, "James Cameron");
        ArrayList<String> authors1 = new ArrayList<>();
        authors1.add("J.K. Rowling");
        authors1.add("John Tiffany");
        authors1.add("Jack Thorne");
        Book book1 = new Book(1, "Harry Potter and the Cursed Child", "Fantasy", 20.99f, authors1);
        // Create another Book object with authors
        ArrayList<String> authors2 = new ArrayList<>();
        authors2.add("George Orwell");
        Book book2 = new Book(2, "1984", "Dystopian", 15.49f, authors2);
        Cart c = new Cart();
        try {
            c.addMedia(dvd1);
            c.addMedia(dvd2);
            c.addMedia(book1);
            c.addMedia(book2);
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }
        try {
            new CartScreen(c);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}