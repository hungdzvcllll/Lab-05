package hust.soict.dsai.aims.screen;

public class Track implements PlayAble {
    protected int length;

    protected String title;
    
    public Track( String title,int length) {
        this.length = length;
        this.title = title;
    }


    @Override
    public String toString() {
        return title + " (" + length + " min)";
    }

    public Track() {
    }

    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for director
    public String getTitle() {
        return title;
    }

    // Setter for director
    public void setTitle(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing Track" + this.getTitle());
        System.out.println("Track length:" + this.getLength());
    }

    public boolean equals(Object o) {
        if (o instanceof Track) {
            String s = ((Track) o).getTitle();
            int i = ((Track) o).getLength();
            return s.equals(title) && i == length;
        }
        return false;
    }

}