import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Class {
    public static void main (String[]args) {
        int a=-2,b=3,c=7;
        ArrayList<Double> zeroes = zero(a,b,c);
        p("function: y = " + a + "x^2 + " + b + "x+ "+c);
        p("zeroes: " + zeroes.get(1) + "    "+zeroes.get(3));
    }


    /**
     * Finds zeroes of a quadratic function.
     * ax^2+bx+c
     * @param a the coefficient for ax^2
     * @param b the coefficient for bx
     * @param c the coefficient for cx^0
     * @return zeroes the zero(es) of the given quadratic
     */



private static ArrayList<Double>zero(int a, int b, int c){
    double exponent = 4;
    ArrayList<Double>zeroes = new ArrayList<>();
    double num = Math.pow(10, exponent);
    for (double x = -1*num; x <num;x+=(1/num)){
        double eqn = (a* (Math.pow(x,2))+(b*x)+c);
        double acceptableError = 10/num;//gets the closest to zero that you want
        if (eqn >= -acceptableError && eqn <= acceptableError){
            zeroes.add(x);
            double squared = Math.pow(x,2);
            if (squared == (int)squared){
                p("x = "+ x + " could also be represented as sqrt" + (int)squared);
            }
        }
    }
    return zeroes;
}

    /**
     * @param value the value to be rounded
     * @param places the number of decimal places for value to be rounded to
     * @return the rounded value
     */



private static double round(double value, int places){
    if (places<0)throw new IllegalArgumentException();
    BigDecimal bd = new BigDecimal(Double.toString(value));
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
}


    public static void p(Object o) {
        System.out.println(o);
    }

}