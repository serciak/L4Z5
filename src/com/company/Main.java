package com.company;

public class Main {

    public static void main(String[] args) throws EmptyStackException, FullStackException {
	    RPNcalculator calc = new RPNcalculator();

        System.out.println(calc.calculate("12 2 3 4 * 10 5 / + * +"));
    }
}
