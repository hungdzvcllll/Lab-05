package hust.soict.dsai.aims.screen;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends JFrame {
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

    public AddDigitalVideoDiscToStoreScreen(Store s) {
        this.s = s;
        BoxLayout bl = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(bl);
        JButton b = new JButton("Add DVD");
        ActionListener ac = new DVDListener(this);
        b.addActionListener(ac);
        this.add(new JLabel("From up to down:id,title,category,cost,length,director:"));
        this.add(jt1);
        this.add(jt2);
        this.add(jt3);
        this.add(jt4);
        this.add(jt5);
        this.add(jt6);
        this.add(b);
        this.setVisible(true);
    }

    public void addDVD() {
        int id = Integer.parseInt(jt1.getText());
        String title = jt2.getText();
        String category = jt3.getText();
        float cost = Float.parseFloat(jt4.getText());
        int length = Integer.parseInt(jt5.getText());
        String director = jt6.getText();
        DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, cost, length, director);
        s.addMedia(dvd);
    }

}