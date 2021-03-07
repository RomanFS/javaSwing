package org.dsads.ha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel implements ActionListener {
    private final Timer timer = new Timer(1000, this);
    Snake snake = new Snake(getPreferredSize().width / 2, getPreferredSize().height / 2);

    public MyPanel() {
        timer.start();
    }

    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
}