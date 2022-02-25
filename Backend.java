import java.util.ArrayList;

public class Backend {


    public static void main(String[] args){

        System.out.println(getReponseEquation("12-03"));
        System.out.print(12-3);

    }

    public static String getReponseEquation(String equation){

        String reponse ="";
        int reponseChiffre =0;

        reponseChiffre = decortiquer(equation);

        return reponse + reponseChiffre;
    }

    private static int decortiquer(String equation){

        int partie1;
        int partie2;
        int reponse = 0;
        int operateur =1; // 0 = +, 1 = -, 2 = *, 3 = / 4 = ^, 5 = root(), 6 = log(),
        ArrayList<Character> operateurPosition = new ArrayList<Character>();

        for (char i:equation.toCharArray()) {

            if (i == '+') {

                operateur = 0;
                operateurPosition.add(i);
            }else if (i == '-'){

                operateur = 1;
                operateurPosition.add(i);

            }else if (i== '*'){

                operateur = 2;
                operateurPosition.add(i);

            }else if (i== '/'){

                operateur = 3;
                operateurPosition.add(i);
            }

        }

        partie1 = Integer.parseInt(equation.substring(0,2)); //problème : de 0 jusqua un Char
        partie2= Integer.parseInt(equation.substring(3));

        switch (operateur) {
            case 0 -> reponse = partie1 + partie2;
            case 1 -> reponse = partie1 - partie2;
            case 2 -> reponse = partie1 * partie2;
            case 3 -> reponse = partie1 / partie2;
        }

        return reponse;
    }
}
