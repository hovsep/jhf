package chapter12.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object b = actionEvent.getSource();

        if (b instanceof JButton) {
            ((JButton) b).setText("clicked");
        }
    }
}
