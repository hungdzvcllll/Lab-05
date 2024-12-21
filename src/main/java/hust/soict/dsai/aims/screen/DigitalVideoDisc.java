package hust.soict.dsai.aims.screen;

import java.time.LocalDate;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements PlayAble {
    private static int nbDigitalVideoDisc;

    public DigitalVideoDisc(int id, String title, String category, float cost,
            int length, String director) {
        // Calling the superclass (Disc) constructor
        nbDigitalVideoDisc++;
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.length = length;
        this.director = director;

        // Increment the static field for the number of DigitalVideoDisc instances
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost +
                ", length=" + length + " minutes, director=" + director + ", nbDigitalVideoDisc=" + nbDigitalVideoDisc
                + "]";
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public void play() throws PlayerException {  
    if (this.length > 0) {  
        System.out.println("Playing DVD:" + this.getTitle());
        System.out.println("DVD length:" + this.getLength());
    } else {  
        throw new PlayerException();  
    }  
}

    // Constructor for all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float price) {
        DigitalVideoDisc.setNbDigitalVideoDisc(nbDigitalVideoDisc + 1);
        this.id = DigitalVideoDisc.getNbDigitalVideoDisc();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    // Setter method for nbDigitalVideoDisc
    public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {

        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc; // Use the class name to set the static variable
    }

}