package hust.soict.dsai.aims.screen;

public class Disc extends Media {
    protected int length;

    protected String director;

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Disc [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost +
                ", length=" + length + " minutes, director=" + director + "]";
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }

    // Setter for director
    public void setDirector(String director) {
        this.director = director;
    }

}