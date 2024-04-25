package oopbasic;

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }
    public void plus(int numberPlus) {
        result += numberPlus;
    }
    public void minus(int numberMinus) {
        result -= numberMinus;
    }
    public void multiply(int numberMultiply) {
        result *= numberMultiply;
    }
    public void divide(int numberDivide) {
        result /= numberDivide;
    }
    public int getResult() {
        return result;
    }

    public static void main(String[] args) {

    }
}

