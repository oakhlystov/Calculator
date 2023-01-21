package org.example.calculations;

public class Actions extends Calculations {
    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        checkIfZero(b);
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public void checkIfZero(double a) {
        if (a == 0.0) {
            throw new IllegalArgumentException("Cannot divide by 0.");
        }
    }
}
