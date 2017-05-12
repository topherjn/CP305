import java.util.Scanner;

public class Loops {

     final static int SENTINEL = -1;

     public static void main(String [] args) {
 
          int product = 1;

          for(int i = 1; i < 5; i++) {
              product *= i;
          } 

          System.out.println(product);
     }

    
}