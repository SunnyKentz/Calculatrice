import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Bouton{

    public static final int ZERO = 0;
    public static final String UN = "1";
    public static final String DEUX = "2";
    public static final int TROIS = 3;
    public static final int QUATRE = 4;
    public static final int CINQ = 5;
    public static final int SIX = 6;
    public static final int SEPT = 7;
    public static final int HUIT = 8;
    public static final int NEUF = 9;
    public static final String EQUAL = "=";
    public static final String CLEAR = "C";
    public static final int MOINS = 12;
    public static final int PLUS = 13;
    public static final int TIMES = 12;
    public static final String DIV = "/";

    //bouton
    private JButton bouton;
    private String valeur;
    private LigneDeText equation;
    private Ecran screen;

    //initialisation du bouton
    public Bouton(String nom, String val, Ecran screen) {

        this.screen = screen;

        this.setTitre(nom);
        valeur = val;
        //this.bouton.setBackground(Color.LIGHT_GRAY);
        this.bouton.setFont(new Font("Serif",Font.BOLD,30));
        this.bouton.setSelected(false);

        bouton.addActionListener(e -> {
            enter();
        });
    }

    //ajouter un titre
    private void setTitre(String nom) {
        bouton = new JButton(nom);
    }

    //avoir le bouton
    public JButton getBouton(){

        return bouton;
    }

    public void addValeur(){

        screen.addElement(valeur);
    }

    public void enter(){
        screen.finish();
    }
}
