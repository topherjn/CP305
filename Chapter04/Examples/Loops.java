import java.util.Scanner;

public class Loops {

     public static void main(String [] args) {

          int i;
          final int SENTINEL = -1;
          Scanner input = new Scanner(System.in);

          do {
             System.out.printf("Enter a whole number: ");
             i = input.nextInt();
	  } while(i == SENTINEL);

          System.out.println("Loop done");
         
     }
}