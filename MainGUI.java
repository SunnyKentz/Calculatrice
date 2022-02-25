import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUI implements KeyListener {

    public static class WindowCal implements Runnable {

        @Override
        public void run() {

            //Setup du window
            JFrame window = new JFrame("Calculatrice");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setPreferredSize(new Dimension(400,600));
            window.setLocationByPlatform( true );
            window.pack();
            window.setContentPane(new PaneauPrincipale());
            window.setVisible(true);
        }

    }
    /**
     * la fenêtre de la calculatrice
     */
    public static void main(String[] args){

        SwingUtilities.invokeLater( new WindowCal() );
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }
}
