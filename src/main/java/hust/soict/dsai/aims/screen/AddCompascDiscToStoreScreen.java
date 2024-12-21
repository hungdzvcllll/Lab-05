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

public class AddCompascDiscToStoreScreen extends JFrame {
    private Store s;
    public Store getStore(){
        return s;
}
    private JTextField jt1 = new JTextField(50);
    private JTextField jt2 = new JTextField(50);
    private JTextField jt3 = new JTextField(50);
    private JTextField jt4 = new JTextField(50);
    private JTextField jt5 = new JTextField(50);
    private JTextField jt6 = new JTextField(50);
    private JTextField jt7 = new JTextField(50);
    private JTextField jt8 = new JTextField(50);
    private JTextField jt9 = new JTextField(50);

    public AddCompascDiscToStoreScreen(Store s) {
        this.s = s;
        GridLayout gl=new GridLayout(11,1);
        this.setLayout(gl);
        JButton b = new JButton("Add Book");
        ActionListener ac = new CDListener(this);
        b.addActionListener(ac);
        this.add(new JLabel("From up to down:id,title,category,cost,length,director,artist,list of Track's name and list of Track's length"));
        this.add(jt1);
        this.add(jt2);
        this.add(jt3);
        this.add(jt4);
        this.add(jt5);
        this.add(jt6);
        this.add(jt7);
        this.add(jt8);
        this.add(jt9);        
        this.add(b);
        this.setVisible(true);
    }

    public void addCD() {
        int id = Integer.parseInt(jt1.getText());
        String title = jt2.getText();
        String category = jt3.getText();
        float cost = Float.parseFloat(jt4.getText());
        int length = Integer.parseInt(jt5.getText());
        String director = jt6.getText();
        String artist=jt7.getText();
        String[]str=jt8.getText().split(",");
        String[]str1=jt9.getText().split(",");
        ArrayList<Track> list=new ArrayList<Track>();
        for(int i=0;i<str.length;i++){
           Track t=new Track(str[i],Integer.parseInt(str1[i]));
           list.add(t);
         }
        CompactDisc cd=new CompactDisc(id,title,category,cost,length,director,artist,list);
        
        s.addMedia(cd);
    }

}