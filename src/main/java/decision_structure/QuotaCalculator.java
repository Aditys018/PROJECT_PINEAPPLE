/*All sales People are expected to make at least 10 sales each week.
* for those who do,they receive a congratulations message.
* For those who don't they are informed of how many sales they were short.*/
package decision_structure;
import java.util.Scanner;
public class QuotaCalculator {
    public static void main(String[] args) {

        int quota=10;

        System.out.println("Enter the number of sales you made");
        Scanner scanner=new Scanner(System.in);
        //read, scan, or parse the next token of an input as int.
        int sales = scanner.nextInt();
        scanner.close();

        if(sales>= quota){
            System.out.println("CONGRATULATIONS YOU'VE MADE YOUR QUOTA");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not made your quota" + " You were " + salesShort + " Sales Short This Week" );
        }
        scanner.close();
;    }
}
