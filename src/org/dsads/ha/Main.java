package org.dsads.ha;

import javax.swing.*;
import java.awt.*;

public class Main extends Canvas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
