package org.dsads.ha;

import javax.swing.*;
import java.awt.*;

public class Main extends Canvas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        //System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        BasicKeyAdapter keyAdapter = new BasicKeyAdapter();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(keyAdapter);
        f.setFocusable(true);
        f.add(new MyPanel());
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
