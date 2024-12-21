package hust.soict.dsai.aims.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreListener implements ActionListener{
    private StoreScreen ss;
    public StoreListener(StoreScreen ss){ 
        this.ss=ss;
    }
    public void actionPerformed(ActionEvent ae){
       String st=ae.getActionCommand();
        if(st.equals("Add DVD")){
            
            new AddDigitalVideoDiscToStoreScreen(ss.getStore());
        }
        if(st.equals("Add Book")){
            
            new AddBookToStoreScreen(ss.getStore());
        }
         if(st.equals("Add CD")){
            
            new AddCompascDiscToStoreScreen(ss.getStore());
       }
       
    }
}