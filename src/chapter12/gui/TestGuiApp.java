package chapter12.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGuiApp {

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JButton btn = new JButton("hit me");


        //Anonymous class is cool
        ActionListener al= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object b = actionEvent.getSource();

                if (b instanceof JButton) {
                    ((JButton) b).setText("clickaaa");
                }
            }
        };


        btn.addActionListener(al);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(btn);
        f.setSize(400,400);
        f.setVisible(true);








    }

}
