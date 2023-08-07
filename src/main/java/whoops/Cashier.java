/*Write a cashier program that will scan a number of items and tally the cost*/

//count-controlled: runs a specified number of times
//pre-test: condition is tested before entering the loop
//execution:use when you know how many times the loop should be executed


package whoops;
import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner=new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total=0;

        for(int i=0; i<quantity; i++){

            System.out.println("ENTER THE COST OF ITEM: ");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is: " + total);
    }

}
