package hust.soict.dsai.aims.screen;

import java.util.*;

public class MyComparatorByTitleCost implements Comparator<Media> {
    public int compare(Media m1, Media m2) {
        if ((m1.getTitle()).compareTo(m2.getTitle()) != 0) {
            return (m1.getTitle()).compareTo(m2.getTitle());
        }
        if (m1.getPrice() < m2.getPrice())
            return 1;
        else if (m1.getPrice() > m2.getPrice())
            return -1;
        else
            return 0;
    }
}