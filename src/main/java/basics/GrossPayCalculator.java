package basics;
import java.util.Scanner;

public class GrossPayCalculator {
    //get input from the user
    //you can write all code within a main method

    public static void main(String[] args){

        System.out.println("How many hours did you work");
        // to receive user input and parse them into primitive
        // data types such as int, double or default String

        Scanner sc=new Scanner (System.in);
        //next read whatever was the last thing on the console
        //it is going to read from command line
       int hours =  sc.nextInt();

        System.out.println("What is your hourly pay rate");
        double rate = sc.nextDouble();
        sc.close();

        double payRate = hours*rate;
        //payRate value appended here as a variable payRate
        System.out.println("Gross Pay: " + payRate);

    }
}
