/*Create a lottery Quick pick application that will generate a
lottery ticket with 6 random numbers between 1-69 */


package arrrere;
import java.util.Arrays;
import java.util.Random;


public class LotteryLagli {

    //declared constant that cannot be changed
    private static final int LENGTH= 6;
    private static final int MAX_TICKET_NUMBER= 69;

    public static void main(String[] args) {
        int[] ticket =generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int [] ticket= new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            do{
               randomNumber= random.nextInt(MAX_TICKET_NUMBER);

            } while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static boolean search(int [] array, int numberToSearchFor){
        for(int value: array){
            if(value == numberToSearchFor)return true;
        }
        return false;
    }
    public static void printTicket(int[] array){
        Arrays.sort(array);
        for(int number : array){
            System.out.print(number +  "  ");
        }

    }

}
