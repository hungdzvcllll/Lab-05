package hust.soict.dsai.aims.screen;

import java.util.*;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    public String toString() {
        // Create a string to hold the list of authors
        StringBuilder authorList = new StringBuilder();
        if (authors.size() > 0) {
            for (String author : authors) {
                authorList.append(author).append(", ");
            }
            // Remove the last comma and space
            authorList.setLength(authorList.length() - 2);
        } else {
            authorList.append("No authors available");
        }

        // Build and return the string for the Book
        return "Book [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost +
                ", authors=[" + authorList.toString() + "]]";
    }

    public Book() {
    }

    public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
        // Calling the superclass (Media) constructor
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;

        // Initializing the authors list
        this.authors = authors;
    }

    public void addAuthors(String s) {
        if (authors.contains(s) == false) {
            authors.add(s);
        }
    }

    public void removeAuthors(String s) {
        if (authors.contains(s)) {
            authors.remove(s);
        }
    }
}