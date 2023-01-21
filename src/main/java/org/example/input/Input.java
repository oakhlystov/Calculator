package org.example.input;

import java.util.Scanner;

public class Input {
    public static String getInput() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your expression (no spaces): ");
        return scn.nextLine();
    }
}
