package hust.soict.dsai.aims.screen;

import java.util.*;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements PlayAble {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(int id, String title, String category, float cost,
            int length, String director,String artist,ArrayList<Track> tracks) {
        // Calling the superclass (Disc) constructor
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.length = length;
        this.director = director;
        this.artist=artist;
        this.tracks=tracks;
        // Increment the static field for the number of DigitalVideoDisc instances
    }

    public String toString() {
        // Create a string to hold the list of tracks (if any)
        StringBuilder trackList = new StringBuilder();
        if (tracks.size() > 0) {
            for (Track track : tracks) {
                trackList.append(track.toString()).append(", ");
            }
            // Remove the last comma and space
            trackList.setLength(trackList.length() - 2);
        } else {
            trackList.append("No tracks available");
        }

        // Build and return the string for the CompactDisc
        return "CompactDisc [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost +
                ", length=" + length + " minutes, director=" + director + ", artist=" + artist +
                ", tracks=[" + trackList.toString() + "]]";
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void play() throws PlayerException {  
    // TODO Play all tracks in the CD as you have implemented  
    if (this.length > 0) {  
        Iterator iter = tracks.iterator();  
        while (iter.hasNext()) {  
            try {  
               Track nextTrack = (Track)iter.next();  
            } catch (Exception e) {  
                e.printStackTrace();
            }  
        }  
    } else {  
        throw new PlayerException();  
    }  
}

    public void addTrack(Track t) {
        if (tracks.contains(t) == false) {
            tracks.add(t);
            System.out.println("added");
        } else {
            System.out.println("Track exist");
        }
    }

    public void removeTrack(Track t) {
        if (tracks.contains(t) == true) {
            tracks.add(t);
            System.out.println("removed");
        } else {
            System.out.println("Track not exist");
        }
    }

    public int getLength() {
        int result = 0;
        for (Track t : tracks) {
            result += t.getLength();
        }
        return result;
    }
}
