package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public int add(int opG, int opD){
        return opG + opD;
    }

    public int divide(int opG, int opD)
    {
        if (opD == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
            // Ou, si vous préférez, vous pouvez retourner une valeur par défaut ou effectuer une autre action appropriée.
        }
        return opG / opD;
    }

    public Set<Integer> ensembleChiffres(int pNombre){
        if(pNombre < 0)
        {
            pNombre = pNombre * -1;
        }
        String nbrChaine = Integer.toString(pNombre);
        Set<Integer>listChiffre = new HashSet<>();

        for (int i = 0; i< nbrChaine.length(); i++)
        {
            char position = nbrChaine.charAt(i);
            int chiffre = Character.getNumericValue(position);
            if (listChiffre.contains(chiffre) == false)
                {
                    listChiffre.add(chiffre);
                }
        }

        return listChiffre;
    }
}
