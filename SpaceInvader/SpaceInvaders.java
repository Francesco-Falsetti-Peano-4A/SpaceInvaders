/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.WindowConstants;

/**
 *
 * @author falsetti.francesco
 */
public class SpaceInvaders {

    /**
     * @param args the command line arguments
     */
    public SpaceInvaders() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro);
        // impacchetto il tutto e rendi visibile
        this.pack();
        this.setVisible(true);
        // avvia l'introduzione
        intro.run();
    }
    public static void main(String[] args) {
        
    
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(Intro intro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
