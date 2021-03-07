package org.dsads.ha;

import java.awt.*;

class Snake {
    private int xPos;
    private int yPos;
    private int width = 15;
    private int height = 15;

    Snake(int xPos, int yPos) {
        this.xPos = xPos - width / 2;
        this.yPos = yPos - height / 2;
    }

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, width, height);
        setX(xPos + width);
    }
}
