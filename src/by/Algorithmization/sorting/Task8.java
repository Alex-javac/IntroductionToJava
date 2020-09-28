package by.Algorithmization.sorting;

/*
Даны дроби(p1/q1),(p2/q2),...(pn/qn) (pi , qi - натуральные).
Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */

import java.util.Arrays;

public class Task8 {
    public static void task8() {
        Fraction[] fractions = new Fraction[]{new Fraction(5, 6), new Fraction(4, 9),
                new Fraction(4, 12), new Fraction(2, 6),
                new Fraction(7, 2), new Fraction(4, 18),
                new Fraction(8, 3), new Fraction(3, 6)};

        Fraction[] fractionsResult=new Fraction[fractions.length];

        System.out.println(Arrays.toString(fractions));

        int nok =fractions[0].getDenominator();
        for (Fraction element : fractions){
            nok=lcm(nok, element.getDenominator());
        }
        for (int i = 0; i < fractions.length; i++) {
            Fraction fraction = fractions[i];
           int chesl = fraction.getNumerator() * (nok / fraction.getDenominator());
           int znam = fraction.getDenominator() * (nok / fraction.getDenominator());
            System.out.println(fraction.getNumerator()+ "/"+ fraction.getDenominator()+" = "+chesl + "/" + znam);
            fractionsResult[i]=new Fraction(chesl,znam);
        }


        System.out.println("НОk элементов массива : " + nok);
        sort(fractionsResult);
        System.out.println(Arrays.toString(fractionsResult));

    }

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
    public static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }
    private static void sort(Fraction[] array) {
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].getNumerator() > array[j + 1].getNumerator()) {
                    Fraction temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    final static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("denominator is zero");
            }
            if (denominator < 0) {
                numerator *= -1;
                denominator *= -1;
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        public int getNumerator() {
            return this.numerator;
        }

        public int getDenominator() {
            return this.denominator;
        }

        @Override
        public String toString() {
            return "Fraction{" + numerator +
                    "/" + denominator +
                    '}';
        }


    }
}
