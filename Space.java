/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Franci
 */
public class Space extends Canvas {

    public BufferedImage alien, ship;
    public int H = 0;
    public int Sx = 0;
    public static boolean leftPressed = false;
    public static boolean rightPressed = false;

    Space() {
        System.out.println("Setting canvas background and dimentions ");
        setBackground(Color.BLACK);
        setSize(800, 600);
        addKeyListener(new KeyInputHandler());
        requestFocus();
    }

    public void Images() throws IOException {
        alien = ImageIO.read(new File("/root/NetBeansProjects/spaceInvaders/alien.png"));
        ship = ImageIO.read(new File("/root/NetBeansProjects/spaceInvaders/ship.png"));
    }
}
