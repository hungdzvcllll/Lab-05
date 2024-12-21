package hust.soict.dsai.aims.screen;

import java.util.*;

public class Store {
    private ArrayList<Media> list = new ArrayList<Media>();

    public void setList(ArrayList<Media> list) {
        this.list = list;
    }

    public ArrayList<Media> getList() {
        return list;
    }

    public void addMedia(Media d) {
        list.add(d);
    }

    public void removeMedia(Media d) {
        list.remove(d);
    }

    public Media findByTitle(String s) {
        for (Media m : list) {
            if (m.getTitle().equals(s)) {
                return m;
            }
        }
        return null;
    }
}
