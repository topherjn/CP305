import java.util.Scanner;

public class RomanNumerals {

    public static void main(String [] args) {

        // declare stuff
        Scanner input = new Scanner(System.in);
        int numeral;
        String roman = "0";


    	// prompt user for a Hindu-Arabic numeral
        System.out.printf("Enter a number from 1 to 10: ");

    	// get numeral from keyboard (user)
        numeral = input.nextInt();
    	
    	if(numeral > 0 && numeral < 11) {
	    	// convert to Roman numeral
	    	if(numeral == 1) roman = "I";
	    	else if(numeral == 2) roman = "II";
	    	else if(numeral == 3) roman = "III";
	    	else if(numeral == 4) roman = "IV";
	    	else if(numeral == 5) roman = "V";
	    	else if(numeral == 6) roman = "VI";
	    	else if(numeral == 7) roman = "VII";
	    	else if(numeral == 8) roman = "VIII";
	    	else if(numeral == 9) roman = "IX";
	    	else roman = "X";

	    	// display Roman numeral
	    	System.out.printf("%d is %s in Roman numerals.\n", numeral, roman);
	    }
	    else {
	    	// yell at user
	    	System.out.printf("%d is not between 1 and 10\n", numeral);
	    }
    }

}