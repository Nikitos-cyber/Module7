package Anonim;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame {
    public MyFrame(){
        setSize(600,800);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth()/2, e.getYOnScreen() - getHeight()/2);
            }
        });
    }
}
