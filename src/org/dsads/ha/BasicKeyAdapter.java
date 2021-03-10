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
            case 65:
            case 37:
                snake.setDirection(direction.left());
                break;
            case 87:
            case 38:
                snake.setDirection(direction.up());
                break;
            case 68:
            case 39:
                snake.setDirection(direction.right());
                break;
            case 83:
            case 40:
                snake.setDirection(direction.down());
                break;
            default:
                System.out.println(e.getKeyCode());
        }
    }
}
