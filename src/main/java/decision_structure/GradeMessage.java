/*Have a user enter their letter grade and using a switch statement,
print out a message letting them know how they did */


package decision_structure;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade ");
        Scanner scanner=new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;


        switch (grade){

            case"A":
                message = "Brilliant work";
                break;

            case "B" :
                message = "Good job";
                break;

            case "C" :
                message = "Almost there";
                break;

            case "D" :
                message = "You need to work a bit harder";
                break;

            //default case in switch statements can be used  when none of the above conditions are applicable
            default:

                message = "Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
