package hust.soict.dsai.aims.screen;

import java.util.*;

import javax.naming.LimitExceededException;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ArrayList<Media> list = new ArrayList<Media>();
    private int maximum_order=20;
    public void setList(ArrayList<Media> list) {
        this.list = list;
    }

    public ObservableList<Media> getList() {
        return FXCollections.observableList(list);
    }

    /*
     * public void searchByID(int id) {
     * boolean is_found = false;
     * for (DigitalVideoDisc d : getList()) {
     * if (d.getID() == id) {
     * System.out.println(d.toString());
     * is_found = true;
     * }
     * }
     * if (!is_found)
     * System.out.println("Can't find DVD");
     * }
     */

    /*
     * public void searchByTitle(String title) {
     * boolean is_found = false;
     * for (DigitalVideoDisc d : getList()) {
     * if (d.getTitle().equals(title)) {
     * System.out.println(d.toString());
     * is_found = true;
     * 
     * }
     * }
     * if (!is_found)
     * System.out.println("Can't find DVD");
     * }
     */

    /*
     * public void printList() {
     * System.out.println("****************CART****************");
     * System.out.println("Ordered Items:");
     * for (DigitalVideoDisc d : getList()) {
     * System.out.println(d.toString());
     * }
     * System.out.println(totalCost());
     * System.out.println("*************************************");
     * }
     */

    public void addMedia(Media m)throws LimitExceededException {
        if(list.size()<=maximum_order)
            list.add(m);
        else
            throw new LimitExceededException("the list is full");

    }

   
    public void removeMedia(Media d) {
        list.remove(d);
    }

    public void filter(int id) {
        for (Media d : list) {
            if (d.getID() == id) {
                System.out.println(d.toString());
            }
        }
    }

    public void filter(String title) {
        for (Media d : list) {
            if (d.getTitle().equals(title)) {
                System.out.println(d.toString());
            }
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media d : list) {
            sum += d.getPrice();
        }
        return sum;
    }

}