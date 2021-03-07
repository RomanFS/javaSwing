package org.dsads.ha;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasicKeyAdapter extends KeyAdapter {
    private Snake snake;

    BasicKeyAdapter(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        Snake.Direction direction = snake.getDirection();

        switch (key) {
            case 65: snake.setDirection(direction.left()); // left
            case 37:
                break;
            case 87: // up
            case 38:
                break;
            case 68:  // right
            case 39:
                break;
            case 83:  // down
            case 40:
                break;
            default:
                System.out.println(e.getKeyCode());
        }
    }
}
