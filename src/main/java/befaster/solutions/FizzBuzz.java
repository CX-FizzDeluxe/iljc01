package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
	
    public static String fizzBuzz(Integer number) {
    	boolean threeDiv = false, hasThree = false, fiveDiv = false, hasFive = false, three = false, five = false, deluxe = false, fake = false;
    	int numCopy = number, tmp;
    	
    	if(number % 3 == 0) {
    		threeDiv = true;
    	}
    	
    	while(numCopy > 0) {
    		if(numCopy % 10 == 3) {
    			hasThree = true;
    			break;
    		}
    		
    		numCopy /= 10;
    	}
    	
    	if(number % 5 == 0) {
    		fiveDiv = true;
    	}
    	
    	numCopy = number;
    	while(numCopy > 0) {
    		if(numCopy % 10 == 5) {
    			hasFive = true;
    			break;
    		}
    		
    		numCopy /= 10;
    	}
    	
    	if((threeDiv == true && hasThree == true) || (fiveDiv == true && hasFive == true)) {
    		deluxe = true;
    	}
    	
    	if(threeDiv == true && hasThree == true)
    		three = true;
    	
    	if(fiveDiv == true && hasFive == true)
    		five = true;
    	
    	if(deluxe == true && number % 2 != 0 && number > 10) {
    		deluxe = false;
    		fake = true;
    	}
    		
    	if(three == true && five == true && deluxe == true) {
    		return "fizz buzz deluxe";
    	} else if(three == true && five == true && fake == true) {
    		return "fizz buzz fake deluxe";
    	} else if((threeDiv == true || hasThree == true) && (fiveDiv == true || hasFive == true)) {
    		return "fizz buzz";
    	} else if(three == true && deluxe == true) {
    		return "fizz deluxe";
    	} else if(five == true && deluxe == true) {
    		return "buzz deluxe";
    	} else if(three == true && fake == true) {
    		return "fizz fake deluxe";
    	} else if(five == true && fake == true) {
    		return "buzz fake deluxe";
    	} else if(threeDiv == true || hasThree == true) {
    		return "fizz";
    	} else if(fiveDiv == true || hasFive == true) {
    		return "buzz";
    	}
    	
    	return Integer.toString(number);
    }

}
