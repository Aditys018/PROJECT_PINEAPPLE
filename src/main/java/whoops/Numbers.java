/*Write a program that allows a user to enter two numbers and then
* sums up the two numbers.The user should be able to repeat until they indicate they are done*/

//condition controlled:continues running while the specified condition remains true
//post-test:condition is tested after completing the loop
//execution: use when loop should run at least once,and possibly more

package whoops;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        boolean again;

        do{
            System.out.println("ENTER THE FIRST NUMBER: ");
            double num1= scanner.nextDouble();
            System.out.println("ENTER THE SECOND NUMBER: ");
            double num2= scanner.nextDouble();
            System.out.println("SUM: " + (num1 + num2 ));

            System.out.println("WOULD YOU LIKE TO ADD AGAIN Enter false for no and True for yes");
            again=scanner.nextBoolean();
        }while(again);
    }
}
