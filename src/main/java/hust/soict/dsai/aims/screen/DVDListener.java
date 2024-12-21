package hust.soict.dsai.aims.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DVDListener implements ActionListener{
    private AddDigitalVideoDiscToStoreScreen addDVD;
    public DVDListener(AddDigitalVideoDiscToStoreScreen addDVD){
         this.addDVD=addDVD;
    }
    public void actionPerformed(ActionEvent ae){
          addDVD.addDVD();
    }
}