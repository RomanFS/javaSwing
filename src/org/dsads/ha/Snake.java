package org.dsads.ha;

import java.awt.*;

class Snake {
    private int xPos;
    private int yPos;
    private int width = 15;
    private int height = 15;
    private Direction direction;

    Snake(int xPos, int yPos) {
        // place snake to the center
        this.xPos = xPos - width / 2;
        this.yPos = yPos - height / 2;
        direction = new Direction();
    }

    public Direction getDirection() {
        return direction;
    }

    static class Direction {
        private int x, y;

        Direction() { // default direction is up
            x = 0;
            y = -1;
        }

        public Direction up() {
            // change x and y here
            return this;
        }

        public Direction down() {
            // change x and y here
            return this;
        }

        public Direction left() {
            // change x and y here
            return this;
        }

        public Direction right() {
            // change x and y here
            return this;
        }
    }

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void draw(Graphics g) {
        setX(xPos + (width * direction.x));
        setY(yPos + (height * direction.y));

        g.setColor(Color.RED);
        g.fillRect(xPos, yPos, width, height);
    }
}
