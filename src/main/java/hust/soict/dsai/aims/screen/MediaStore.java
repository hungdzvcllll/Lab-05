package hust.soict.dsai.aims.screen;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class MediaStore extends JPanel {
    private Media media;
    private ActionListener ac = new MediaListener(this);

    public Media getMedia() {
        return media;
    }

    public ActionListener getAc() {
        return ac;
    }

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getPrice() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add to cart");
        container.add(addButton);
        JButton play = new JButton("Play");
        if (media instanceof PlayAble) {
            container.add(play);
        }
        addButton.addActionListener(ac);
        play.addActionListener(ac);

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}