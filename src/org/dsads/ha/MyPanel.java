package org.dsads.ha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel extends JPanel {
    RedSquare redSquare = new RedSquare();

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                moveSquare(e.getX(), e.getY());
            }
        });
    }

    private void moveSquare(int x, int y) {
        // Current square state, stored as final variables
        // to avoid repeat invocations of the same methods.
        final int CURR_X = redSquare.getX();
        final int CURR_Y = redSquare.getY();
        final int CURR_W = redSquare.getWidth();
        final int CURR_H = redSquare.getHeight();
        final int OFFSET = 1;

        if ((CURR_X != x) || (CURR_Y != y)) {

            // The square is moving, repaint background
            // over the old square location.
            repaint(CURR_X, CURR_Y, CURR_W + OFFSET, CURR_H + OFFSET);

            // Update coordinates.
            redSquare.setX(x);
            redSquare.setY(y);

            // Repaint the square at the new location.
            repaint(redSquare.getX(), redSquare.getY(),
                    redSquare.getWidth() + OFFSET,
                    redSquare.getHeight() + OFFSET);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is my custom Panel!", 10, 20);

        redSquare.paintSquare(g);
    }
}