package com.company;

public class RPNcalculator {

    private InfiniteStack<Double> stack;
    private double result;

    public RPNcalculator() {
        stack = new InfiniteStack<>();
        result = 0;
    }

    public double calculate(String phrase) throws FullStackException, EmptyStackException {
        String[] parts = phrase.split(" ");
        double num1;
        double num2;

        for(String p : parts) {
            if(!(p.equals("+") || p.equals("-") || p.equals("*") || p.equals("/"))) {
                stack.push(Double.parseDouble(p));
            } else {
                num1 = stack.pop();
                num2 = stack.pop();
                innerCalculate(num1, num2, p);
                stack.push(result);
            }
        }
        result = stack.pop();

        return result;
    }

    private void innerCalculate(double num1, double num2, String o) {
        switch (o) {
            case "+":
                result = (num1 + num2);
                break;
            case "-":
                result = (num2-num1);
                break;
            case "*":
                result = (num1 * num2);
                break;
            case "/":
                result = (num2/num1);
                break;
        }
    }
}
