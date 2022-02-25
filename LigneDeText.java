import javax.swing.*;
import java.awt.*;

public class LigneDeText {

    public static final int MESSAGE = 1;
    public static final int QUESTION = 2;
    public static final int REPONSE = 3;


    //ligne de texte
    final private JPanel ligne = new JPanel();
    final private JTextArea textA = new JTextArea();
    private int type = 1; // fasle : question, true : reponse

    //constructeur qui initalise la ligne de texte
    public LigneDeText(String text, int typeLigne){
        this.type = typeLigne;
        textA.setText(text);
        textA.setFont(new Font("Courier New", Font.ITALIC, 20));
        initialiser();
    }

    //initialisation
    private void initialiser() {
        textA.setVisible(true);
    }

    private void determinerLigne(){

        switch (type) {
            case MESSAGE: //message
                this.textA.setEditable(false);
                ligne.setLayout(new FlowLayout(FlowLayout.CENTER));
                break;

            case QUESTION://question
                this.textA.setEditable(true);
                ligne.setLayout(new BorderLayout());
                break;
            case REPONSE://reponse
                this.textA.setEditable(false);
                ligne.setLayout(new FlowLayout(FlowLayout.RIGHT));
                break;
        }
        ligne.add(textA);
    }

    public  void lock(){
        this.textA.setEditable(false);
    }

    //avoir le text
    public JPanel getLigne() {

        determinerLigne();
        return ligne;
    }

    public void setText(String txt){

        textA.setText(textA.getText()+txt);
    }
}
