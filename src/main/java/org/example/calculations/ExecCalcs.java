package org.example.calculations;

public class ExecCalcs {
    public double calculate(String input) {
        Actions ac = new Actions();
        ArrayPrettifyer ap = new ArrayPrettifyer();
        String[] numbers = input.split("[+-/*]");
        String[] actions = new String[input.length() - 1];
        char[] actionsChars = input.toCharArray();
        double res = Double.parseDouble(numbers[0]);

        int m = 0;
        int actionsCounter = 0;
        for (char a : actionsChars) {
            if (String.valueOf(a).equals(" ")) {
                throw new IllegalArgumentException("No spaces are allowed.");
            }
            if (String.valueOf(a).equals("+") ||
                String.valueOf(a).equals("-") ||
                String.valueOf(a).equals("/") ||
                String.valueOf(a).equals("*")) {
                actions[m] = String.valueOf(a);
                if (actions[m] != null) {
                    actionsCounter++;
                }
                m++;
            }
        }
        String[] actionsTemp = ap.deleteNullsFromArray(actions, actionsCounter);

        for (int i = 0; i < actionsTemp.length; i++) {
            if (numbers[i + 1] == null || actionsTemp[i] == null) {
                break;
            }
            res = switch (actionsTemp[i]) {
                case "+" -> ac.plus(res, Double.parseDouble(numbers[i + 1]));
                case "-" -> ac.minus(res, Double.parseDouble(numbers[i + 1]));
                case "*" -> ac.multiply(res, Double.parseDouble(numbers[i + 1]));
                case "/" -> ac.division(res, Double.parseDouble(numbers[i + 1]));
                default -> res;
            };
        }
        return res;
    }
}
