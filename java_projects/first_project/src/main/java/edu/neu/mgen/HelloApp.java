package edu.neu.mgen;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HelloApp 
{
    public static void main( String[] args )
    {
        System.out.println( "It is my first Java program" ); //It is my first Java program
        int intVar1 = 10;
        int intVar2 = 20;

        long longVar1 = 100L;
        long longVar2 = 200L;

        double doubleVar1 = 1.5;
        double doubleVar2 = 2.5;

        boolean boolVar1 = true;
        boolean boolVar2 = false;

        char charVar1 = 'A';
        char charVar2 = 'B';
        long convertedLong = intVar1;
        int convertedInt = (int) longVar1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for intVar1: ");
        intVar1 = scanner.nextInt();
        System.out.print("Enter a boolean (true/false) for boolVar1: ");
        boolVar1 = scanner.nextBoolean();
        int sum = intVar1 + intVar2;
        double div = doubleVar1 / doubleVar2;
        int mod = intVar1 % 3;
        System.out.println("Arithmetic: " + intVar1 + " + " + intVar2 + " = " + sum);
        System.out.println("Arithmetic: " + doubleVar1 + " / " + doubleVar2 + " = " + div);
        System.out.println("Arithmetic: " + intVar1 + " % 3 = " + mod);
        boolean andRes = boolVar1 && boolVar2;
        boolean orRes = boolVar1 || boolVar2;
        boolean notRes = !boolVar1;

        System.out.println("Logical AND: " + andRes);
        System.out.println("Logical OR: " + orRes);
        System.out.println("Logical NOT: " + notRes);

        scanner.close();
    }
}
