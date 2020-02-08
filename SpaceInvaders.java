/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author longhitano.stefano
 */
public class SpaceInvaders extends JFrame {

    private Space space = new Space();

    public SpaceInvaders() throws InterruptedException {
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        // impacchetto il tutto e rendi visibile
        this.pack();
        this.setVisible(true);
        // avvia l'introduzione
        intro.run();
    }

    public static void main(String[] args) throws InterruptedException {
        new SpaceInvaders();
    }

}
