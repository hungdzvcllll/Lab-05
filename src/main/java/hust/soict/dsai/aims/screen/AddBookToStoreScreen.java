package hust.soict.dsai.aims.screen;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class AddBookToStoreScreen extends JFrame {
    private Store s;
    public Store getStore(){
        return s;
}
    private JTextField jt1 = new JTextField(50);
    private JTextField jt2 = new JTextField(50);
    private JTextField jt3 = new JTextField(50);
    private JTextField jt4 = new JTextField(50);
    private JTextField jt5 = new JTextField(50);

    public AddBookToStoreScreen(Store s) {
        this.s = s;
        GridLayout gl=new GridLayout(7,1);
        this.setLayout(gl);
        JButton b = new JButton("Add Book");
        ActionListener ac = new BookListener(this);
        b.addActionListener(ac);
        this.add(new JLabel("From up to down:id,title,category,cost,list of authors separate by commas"));
        this.add(jt1);
        this.add(jt2);
        this.add(jt3);
        this.add(jt4);
        this.add(jt5);
        this.add(b);
        this.setVisible(true);
    }

    public void addBook() {
        int id = Integer.parseInt(jt1.getText());
        String title = jt2.getText();
        String category = jt3.getText();
        float cost = Float.parseFloat(jt4.getText());
        String[]str=jt5.getText().split(",");
        ArrayList<String> listAuthors=new ArrayList<>(Arrays.asList(str));
        System.out.println(listAuthors.size());
        Book b = new Book(id, title, category, cost,listAuthors );
        s.addMedia(b);
    }

}