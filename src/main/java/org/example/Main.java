package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            // roll some dice
            System.out.println("You rolled!");
        } else {
            System.out.println("# of Dice must be greater than 0");
        }
    }
}