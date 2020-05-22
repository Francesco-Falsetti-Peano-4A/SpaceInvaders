/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Franci
 */
public class KeyInputHandler extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        System.out.println("RIGHT");
        Space.rightPressed = true;
        }
    }

    public void keyTyped(KeyEvent e) {
    }
}
