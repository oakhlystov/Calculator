package org.example.calculations;

public class Actions {
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        checkIfZero(b);
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    void checkIfZero(double a) {
        if (a == 0.0) {
            throw new IllegalArgumentException("Cannot divide by 0.");
        }
    }
}
