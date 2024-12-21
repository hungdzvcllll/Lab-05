package hust.soict.dsai.aims.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CDListener implements ActionListener{
    private AddCompascDiscToStoreScreen addCD;
    public CDListener(AddCompascDiscToStoreScreen addCD){
         this.addCD=addCD;
    }
    public void actionPerformed(ActionEvent ae){
          addCD.addCD();
    }
}