import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier {

    //paneau qui contient les boutons
    private JPanel pan = new JPanel();
    private Bouton[] toutLesBoutons = new Bouton[2];
    private Ecran screen;

    private KeyListener keys = new KeyListener() {

        KeyEvent e;

        public KeyEvent getE(){

            return e;
        }

        @Override
        public void keyTyped(KeyEvent e) { }

        @Override
        public void keyPressed(KeyEvent e) { }

        @Override
        public void keyReleased(KeyEvent e) {

            this.e = e;
            System.out.println(e.getKeyChar());
        }
    };

    Thread t = new Thread(() -> {
        while (true){

            System.out.println("running thread");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    //constructeur qui initalise le clavier
    public Clavier(Ecran screen){
        pan.setBackground(Color.darkGray);
        pan.setLayout(new GridLayout(0,4));

        this.screen = screen;

        //ajout des composants
        addComponent(screen);
    }

    // ajout de chaques composants
    private void addComponent(Ecran screen) {

        toutLesBoutons[0] = new Bouton("1",Bouton.UN,screen);
        toutLesBoutons[1] = new Bouton("2",Bouton.DEUX, screen);
        /*pan.add(new Bouton("3",Bouton.TROIS).getBouton());
        pan.add(new Bouton("+",Bouton.PLUS).getBouton());
        pan.add(new Bouton("4",Bouton.QUATRE).getBouton());
        pan.add(new Bouton("5",Bouton.CINQ).getBouton());
        pan.add(new Bouton("6",Bouton.SIX).getBouton());
        pan.add(new Bouton("-",Bouton.MOINS).getBouton());
        pan.add(new Bouton("7",Bouton.SEPT).getBouton());
        pan.add(new Bouton("8",Bouton.HUIT).getBouton());
        pan.add(new Bouton("9",Bouton.NEUF).getBouton());
        pan.add(new Bouton("×",Bouton.TIMES).getBouton());
        pan.add(new Bouton("0",Bouton.ZERO).getBouton());*/
        pan.add(new Bouton("=",Bouton.EQUAL,screen).getBouton());
        pan.add(new Bouton("C",Bouton.CLEAR,screen).getBouton());
        pan.add(new Bouton("÷",Bouton.DIV,screen).getBouton());

        for (Bouton i: toutLesBoutons){
            pan.add(i.getBouton());
        }

        System.out.println("adding listener");
        pan.addKeyListener(keys);
        t.start();
    }

    //retour du panneau ayant les boutons
    public JPanel getClavier() {

        return pan;
    }
}
