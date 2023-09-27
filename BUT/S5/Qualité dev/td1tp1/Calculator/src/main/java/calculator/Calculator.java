package calculator;

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
}
