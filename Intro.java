/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author longhitano.stefano
 */
public class Intro extends Space {

    private int i = 0;

    void run() throws InterruptedException {
        setBackground(Color.BLACK);
        setSize(800, 600);

        for (i = 100; i >= 10; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(20);
        }
    }

    @Override
    public void paint(Graphics g) {
        // scrivi nel canvas la scritta in Rosso 
        g.setColor(Color.red);
        // Seleziona i Font della scritta (Bold) e la dimensione dei caratteri (40)
        g.setFont(new Font("Bold", Font.PLAIN, 40+i));
        // Scrivi partendo dalla posizione x=100 e y=100
        g.drawString("Space Invaders", 100+i, 100+i);
        g.setFont(new Font("Bold", Font.PLAIN, 10+i)); 
        g.drawString("          by Francesco Falsetti", 110+i+i, 110+i+i);
    }

}
