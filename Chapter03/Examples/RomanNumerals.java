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
	    	
	    	switch(numeral) {

	    		case 1:
	    		    roman = "I";
	    		    break;
	    		case 2:
	    		    roman = "II";
	    		    break;
	    		case 3:
	    		    roman = "III";
	    		    break;
    		    case 4:
				    roman = "IV";
				    break;
    		    case 5:
	    		    roman = "V";
	    		    break;
    		    case 6:
	    		    roman = "VI";
	    		    break;
    		    case 7:
	    		    roman = "VII";
	    		    break;
    		    case 8:
	    		    roman = "VIII";
	    		    break;
	    		case 9:
	    		    roman = "IX";
	    		    break;
    		    default:
	    		    roman = "X";
	    	}
	    	// display Roman numeral
	    	System.out.printf("%d is %s in Roman numerals.\n", numeral, roman);
	    }
	    else {
	    	// yell at user
	    	System.out.printf("%d is not between 1 and 10\n", numeral);
	    }
    }

}