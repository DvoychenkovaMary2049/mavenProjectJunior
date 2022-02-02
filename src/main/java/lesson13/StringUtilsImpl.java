package lesson13;

import java.util.Arrays;
import java.util.LinkedList;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2==null");
        }

        double num1;
        double num2;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число");
        }
        if (num2 == 0.0){
            throw new ArithmeticException("number2 - 0. На 0 делить нельзя.");
        }


        return num1/num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null ){
            throw new NullPointerException("text == null || word == null");
        }




        return new int [0];


    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
