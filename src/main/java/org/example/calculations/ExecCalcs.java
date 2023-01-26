package org.example.calculations;

public class ExecCalcs {
    private final String symbolPlus = "+";
    private final String symbolMinus = "-";
    private final String symbolDivide = "/";
    private final String symbolMultiply = "*";
    public double calculate(String input) {
        Actions ac = new Actions();
        ArrayPrettifyer ap = new ArrayPrettifyer();
        String[] numbers = input.split("[+-/*]");
        String[] actions = new String[input.length() - 1];
        double res = Double.parseDouble(numbers[0]);

        String[] actionsTemp = ap.deleteNullsFromArray(actions, actionsCounter(input, actions));

        for (int i = 0; i < actionsTemp.length; i++) {
            if (numbers[i + 1] == null || actionsTemp[i] == null) {
                break;
            }
            res = switch (actionsTemp[i]) {
                case symbolPlus -> ac.plus(res, Double.parseDouble(numbers[i + 1]));
                case symbolMinus -> ac.minus(res, Double.parseDouble(numbers[i + 1]));
                case symbolMultiply -> ac.multiply(res, Double.parseDouble(numbers[i + 1]));
                case symbolDivide -> ac.division(res, Double.parseDouble(numbers[i + 1]));
                default -> res;
            };
        }
        return res;
    }

    public int actionsCounter(String input, String[] actions) {
        char[] actionsChars = input.toCharArray();
        for (char a : actionsChars) {
            checkIfSpace(a);
        }
        int m = 0;
        int actionsCounter = 0;
        for (char a : actionsChars) {
            switch (String.valueOf(a)) {
                case "+", "-", "/", "*" -> {
                    actions[m] = String.valueOf(a);
                    if (actions[m] != null) {
                        actionsCounter++;
                    }
                    m++;
                }
            }
        }
        return actionsCounter;
    }

    private void checkIfSpace(char a) {
        if (String.valueOf(a).equals(" ")) {
            throw new IllegalArgumentException("No spaces are allowed.");
        }
    }
}
