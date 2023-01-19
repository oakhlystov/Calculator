package org.example;

import org.example.calculations.ExecCalcs;
import org.example.input.Input;
import org.example.output.Output;

public class Calculator {
    public void start(){
        Input in = new Input();
        ExecCalcs ec = new ExecCalcs();
        Output ou = new Output();

        ou.printResult(ec.calculate(in.getInput()));
    }
}
