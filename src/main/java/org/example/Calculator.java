package org.example;

import org.example.calculations.ExecCalcs;
import org.example.input.Input;
import org.example.output.Output;

public class Calculator {
    public static void start(){
        ExecCalcs ec = new ExecCalcs();

        Output.printResult(ec.calculate(Input.getInput()));
    }
}
