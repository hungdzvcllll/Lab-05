package hust.soict.dsai.aims.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BookListener implements ActionListener{
    private AddBookToStoreScreen addBook;
    public BookListener(AddBookToStoreScreen addBook){
         this.addBook=addBook;
    }
    public void actionPerformed(ActionEvent ae){
          addBook.addBook();
    }
}