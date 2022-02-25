

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Ecran {

    //arrière écran qui va contenir les lignes d'équations
    private JPanel ecran = new JPanel();

    //pour pouvoir voir les autres équations
    private JScrollPane ecranScroll;

    //ligne d'équation
    private LigneDeText ligneMessage = new LigneDeText("Écriver un équation Merci", LigneDeText.MESSAGE);
    private LigneDeText ligneReponse = new LigneDeText("=5",LigneDeText.REPONSE);
    private LigneDeText ligneQuestion = new LigneDeText(" ",LigneDeText.QUESTION);

    //constructeur
    public Ecran(){
        initialiser();
    }

    //initialisation de l'écran
    private void initialiser() {

        ecran.setLayout(new BoxLayout(ecran, BoxLayout.PAGE_AXIS));

        ecran.add(ligneMessage.getLigne());
        ecran.add(ligneReponse.getLigne());
        ecran.add(ligneQuestion.getLigne());

        //ajout de l'écran dans le scolable, le rendre descendan
        ecranScroll = new JScrollPane(ecran);

        //ecranScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    }

    //ajout du panneau
    public JScrollPane getEcran() {

        return ecranScroll;
    }

    public void addEquation(){

        ecran.add(new LigneDeText(null,LigneDeText.QUESTION).getLigne());
    }

    public void addElement(String val){

        ligneQuestion.setText(val);
    }

    public void finish() {
        ligneQuestion.lock();
        ligneReponse =new LigneDeText("= ",LigneDeText.REPONSE);
        ecran.add(ligneReponse.getLigne());
    }
}
