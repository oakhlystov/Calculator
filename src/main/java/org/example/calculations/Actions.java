package org.example.calculations;

public class Actions {
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide by 0.");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
