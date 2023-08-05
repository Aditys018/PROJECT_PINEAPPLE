/* have a user enter their letter grade and using a switch expression print
* out a message letting them know how they did */

package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {



     System.out.println("Enter your letter grade ");
    Scanner scanner=new Scanner(System.in);
    String grade = scanner.next();
        scanner.close();

    String message = switch (grade) {

        case "A" , "B" -> "Brilliant work";

        //for multiple lines

        case "z" -> {

            String s = "Uh ooh !";
            yield "Need to work more hard";
        }


//        case "B" -> "Good job";

        case "C" -> "Almost there";


        case "D" -> "You need to work a bit harder";


        //default case in switch statements can be used  when none of the above conditions are applicable
        default -> "Invalid grade";

    };
        System.out.println(message);
}
}


