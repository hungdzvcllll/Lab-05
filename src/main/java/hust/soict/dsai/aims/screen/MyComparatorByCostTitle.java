package hust.soict.dsai.aims.screen;

import java.util.*;

public class MyComparatorByCostTitle implements Comparator<Media> {
    public int compare(Media m1, Media m2) {
        if (m1.getPrice() < m2.getPrice())
            return 1;
        else if (m1.getPrice() > m2.getPrice())
            return -1;
        else
            return (m1.getTitle()).compareTo(m2.getTitle());
    }

}