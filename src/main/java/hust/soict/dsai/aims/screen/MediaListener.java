package hust.soict.dsai.aims.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MediaListener implements ActionListener {
    private MediaStore ms;

    public MediaListener(MediaStore ms) {
        this.ms = ms;
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("Play")) {
            JDialog dialog = new JDialog();
            dialog.setSize(200, 150);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            // Add a simple label
            JLabel label = new JLabel("Playing " + ms.getMedia().getTitle(), SwingConstants.CENTER);
            dialog.add(label);

            // Display the dialog
            dialog.setVisible(true);
        }
    }
}
