import java.util.Random;

public class Stochastic {

     public static void main(String [] args) {
        
         Random rand = new Random();
         int flip;
         int heads = 0;
         int tails = 0;

         for(int i = 0; i < 100; i++) {
              flip = rand.nextInt(2);

             // System.out.println((flip == 0) ? "H" : "T");   

              if(flip == 0) {
                 System.out.println("H"); 
                 heads++;
              }
              else {
                 System.out.println("T"); 
                 tails++;
              }
            
         }

         System.out.printf("Heads: %d\nTails: %d", heads, tails);
     }
}