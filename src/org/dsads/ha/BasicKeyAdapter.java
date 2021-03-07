package org.dsads.ha;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasicKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();

        switch (key) {
            case 1: System.out.println("ha");
                break;
            default: System.out.println(e.getKeyCode());
        }
    }
}
