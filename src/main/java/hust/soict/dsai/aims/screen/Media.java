package hust.soict.dsai.aims.screen;

import java.util.*;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static final Comparator<Media> compare_1 = new MyComparatorByCostTitle();
    public static final Comparator<Media> compare_2 = new MyComparatorByTitleCost();

    public int getID() {
        return id;
    }

    // Setter for id
    public void setID(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for category
    public String getCategory() {
        return category;
    }

    // Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for cost
    public float getPrice() {
        return cost;
    }

    // Setter for cost
    public void setPrice(float cost) {
        this.cost = cost;
    }

    public boolean equals(Object o) {
        if (o instanceof Media) {
            String s = ((Media) o).getTitle();
            return s.equals(title);
        }
        return false;
    }

}