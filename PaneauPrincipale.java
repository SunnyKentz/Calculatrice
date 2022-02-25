import javax.swing.*;
import java.awt.*;

public class PaneauPrincipale extends JPanel{

    //l'écran
    private Ecran ecran = new Ecran();

    //le clavier
    private Clavier paneauBouton = new Clavier(ecran);

    //constructeur, quand le panneau principal est instancier
    public PaneauPrincipale(){
        setBackground(Color.white);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        //ajout des composants
        addComposant();
    }

    /**
     * ajout de l'écran et du clavier
     */
    private void addComposant(){
       add(ecran.getEcran());
       add(paneauBouton.getClavier());
    }
}
