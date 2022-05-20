package com.company;

public class Main {

    public static void main(String[] args) throws EmptyStackException, FullStackException {
	    RPNcalculator calc = new RPNcalculator();

        String phrase = "2 2 +";

        System.out.println(phrase);
        System.out.println(calc.calculate(phrase));
    }
}
