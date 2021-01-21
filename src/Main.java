//import java.awt.*;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Arrays;
//public class Main {
//    public static void main (String[]args) {
//        int a = 2, b = -3, c=-4;
//        ArrayList<Double> zeroes = zero(2, -3, -4);
//        p("function: y = " + a + "x^2 + " + b + "x + " + c );
//        p("zeroes: " + zeroes.get(1) +"     "+ zeroes.get(4));
//    }
//    public static void p(Object o) {
//        System.out.println(o);
//    }
//    public static void ai(int[]a) {
//        System.out.println(Arrays.toString(a));
//    }
//
//    /**
//     *
//     * @return Intersections, the ArrayList of x-values where the functions intersect.
//     */
//    private static ArrayList<Double> intersect(){
//        ArrayList<Double>Intersections = new ArrayList<>();
//        ArrayList<Double>Coefficients = new ArrayList<>();
//        ArrayList<ArrayList<Double>>ListOfCoefficients = new ArrayList<>();
//        ArrayList<Double>Values = new ArrayList<>();
//        ArrayList<Integer>funcSizes = new ArrayList<>();
//        int numFuncs=0;
//        int highestPower=0;
//        Scanner s = new Scanner(System.in);
//        p("Enter how many functions are to be intersected:");
//        numFuncs = Integer.parseInt(s.next());
//        for (int i = 0; i < numFuncs; i++) {
//            Scanner scanner = new Scanner(System.in);
//            p(" Enter the highest power of x for function #" + i + ".\n" +
//                            "For example, '4' represents the highest power in a quartic function.");
//            highestPower = Integer.parseInt(scanner.next());
//            funcSizes.add(highestPower);
//            for (int power = highestPower; power >=0; power--) {
//                p("Enter the coefficient for _x^" + power+":");
//                Scanner scan = new Scanner(System.in);
//                double coefficient = Double.parseDouble(scan.next());
//                Coefficients.add(coefficient);
//            }
//            ListOfCoefficients.add(Coefficients);
//        }
//        int exponent = 3; // 1<=exponent<=5
//        /*
//        exponent of 6 means the loop will try:
//        x values from -10^6 to 10^6, of intervals of 1/10^6
//         therefore, it will try (10^6)*(10^6)+(10^6)*(10^6) x values,
//         or 2*(10^12),
//         or 2 TRILLION X VALUES!
//
//         Therefore, to optimize speed, keep exponent <=5
//         */
//        if (exponent > 5){
//            exponent = 5;
//        }
//        if (exponent < 1){
//            exponent = 1;
//        }
//        /*
//        Exponent of 0 means it will try x values between -1 and 1, at intervals of 1.
//        Therefore, it tries -1,0,1. This is unlikely to find the intersection.
//
//        In contrast,
//
//        Exponent of 1 means it will try x values between -10 and 10, at intervals of 1/10.
//        Therefore, it tries 200 values. This is more likely to find the intersection.
//
//        In order to give a reasonable chance of finding the intersection, keep 1 <=exponent.
//         */
//
//        double num = (Math.pow(10,exponent));
//        for (double x = -num; x < num; x+= 1/num) {
//            ArrayList<Double>XY1 = new ArrayList<>();
//            ArrayList<Double>Y = new ArrayList<>();
//            ArrayList<ArrayList<Double>>XY = new ArrayList<>();
//            for (int funcNum = 0; funcNum < numFuncs; funcNum++) {
//                Integer funcSize = funcSizes.get(funcNum);
//                ArrayList<Double>coefficients = ListOfCoefficients.get(funcNum);
//                double sum = 0;
//                for (int pwr = funcSize; pwr >= 0; pwr--) {
//                    double coefficient = coefficients.get(pwr);
//                    double val = coefficient*(Math.pow(x,pwr));
//                    sum+=val;
//                }
//               Y.add(sum);
//            }
//            int places = 4;
//            double Yapprox0 = round(Y.get(0), places);
//            double Yapprox1 = round(Y.get(1), places);
//            if (Yapprox0 == Yapprox1){
//                Intersections.add(x);
//            }
//        }
//        return Intersections;
//    }
//
////    /**
////     * Finds zeroes of a quadratic function.
////     * ax^+bx+c
////     * @param a the coefficient for ax^2
////     * @param b the coefficient for bx^1
////     * @param c the coefficient for cx^0
////     * @return zeroes the zero(es) of the given quadratic.
////     */
////    private static ArrayList<Double> zero(int a, int b, int c){
////        double exponent = 4;
////        ArrayList<Double> zeroes = new ArrayList<>();
////        double num = Math.pow(10, exponent);
////        for (double x = -1*num; x < num; x+=(1/num)) {
////            double eqn = (a * (Math.pow(x, 2)) + (b * x) + c);
////            double acceptableError = 10/num;
////            if (eqn >=-acceptableError && eqn <=acceptableError) {
////                zeroes.add(x);
////                double squared = Math.pow(x, 2);
////                if (squared == (int)squared) {
////                    p("x = " + x +" could also be represented as √" + (int)squared);
////                }
////            }
////        }
////        return zeroes;
////    }
////
////    /**
////     * @param value the value to be rounded
////     * @param places the number of decimal places to be rounded to
////     * @return the rounded value
////     */
////    private static double round(double value, int places) {
////        if (places < 0) throw new IllegalArgumentException();
////
////        BigDecimal bd = new BigDecimal(Double.toString(value));
////        bd = bd.setScale(places, RoundingMode.HALF_UP);
////        return bd.doubleValue();
////    }
//    private static ArrayList pluralRemove(ArrayList arrayList, String comma_separated_indices, String type){
//        ArrayList arrayList1 = null;
//        if (type.equalsIgnoreCase("Double")){
//             arrayList1 = dubl.removeMany(arrayList, comma_separated_indices);
//        }
//        else if (type.equalsIgnoreCase("Integer")){
//            arrayList1 = integer.removeMany(arrayList, comma_separated_indices);
//        }
//        else if (type.equalsIgnoreCase("String")) {
//            arrayList1 = string.removeMany(arrayList, comma_separated_indices);
//        }
//        else if (type.equalsIgnoreCase("Character")){
//           arrayList1 = character.removeMany(arrayList, comma_separated_indices);
//        }
//        return arrayList1;
//    }
//}