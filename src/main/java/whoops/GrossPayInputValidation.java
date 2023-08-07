/*Each store employee makes $15 an hour.Write a program that allows
* an employee to enter the number of hours worked for the week
* do not allow overtime*/

package whoops;
import java.util.Scanner;
public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate =15;
        double maxHours = 40;

        System.out.println("HOW MANY HOURS DID YOU WORKED? ");
        Scanner scanner=new Scanner (System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){

            System.out.println("INVALID ENTRY,YOUR HOURS MUST BE BETWEEN 1 TO 40,Try Again ");
            hoursWorked = scanner.nextDouble();

        }
        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("GROSS PAY: " + grossPay);

    }
}
