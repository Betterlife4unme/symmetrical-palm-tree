/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mass.index;

/**
 *
 * @author BETTERLIFE
 */
import java.util.Scanner;

public class massindex{

    /**
     * Utility functions
     * @param string
     */
    public static void println(String string) {
        
        System.out.println(string);
    }

    static void print(String string){
        
        System.out.print(string);
    }


    /**
     * Print the final result
     * @param bmi : calculated BMI result
     */
    private static void printBMIResult(float bmi) {
        
        String result ;

        if (bmi < 18.5) {
            result = "underweight";
        } else if (bmi < 25) {
            result = "normal";
        } else if (bmi < 30) {
            result = "overweight";
        } else {
            result = "obese";
        }

        println("Your BMI is " + bmi + " and that means " + result);


    }

    /**
     * calculate BMI if weight/height in pounds/inches
     */
    private static void calculateBMImethodOne() {
        Scanner scanner = new Scanner(System.in);
        println("Enter weight in Pounds : ");
        float weight = scanner.nextFloat();

        println("Enter Height in inches : ");
        float height = scanner.nextFloat();

        float bmi = (weight * 703) / (height * height);

        //print the result
        printBMIResult(bmi);

    }

    /**
     * calculate BMI if weight/height in kilogram ./meters
     */
    private static void calculateBMImethodTwo() {
        Scanner scanner = new Scanner(System.in);
        println("Enter weight in Kilogram : ");
        float weight = scanner.nextFloat();

        println("Enter Height in Meters : ");
        float height = scanner.nextFloat();

        float bmi = (weight) / (height * height);

        //print the result
        printBMIResult(bmi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //weight and height variables
        float weight;
        float height;

        println("You can calculate BMI by entering weight in pounds and height in inches or Weight in Kilograms and Height in Meter.");

        OUTER:
        while (true) {
            println("");
            println("Enter 1 for entering weight/height in pounds/inches OR 2 for kilogram/meters : ");
            int userInput;
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    calculateBMImethodOne();
                    break OUTER;
                case 2:
                    calculateBMImethodTwo();
                    break OUTER;
                default:
                    println("Invalid Input !!!");
                    break;
            }
        }
    }
}
