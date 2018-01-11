package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {
	
    public static String fizzBuzz(Integer number) {
    	boolean three = false, five = false, deluxe = false;
    	int numCopy = number, tmp;
    	
    	if(number % 3 == 0) {
    		three = true;
    	}
    	
    	while(numCopy > 0) {
    		if(numCopy % 10 == 3) {
    			three = true;
    			break;
    		}
    		
    		numCopy /= 10;
    	}
    	
    	if(number % 5 == 0) {
    		five = true;
    	}
    	
    	numCopy = number;
    	while(numCopy > 0) {
    		if(numCopy % 10 == 5) {
    			five = true;
    			break;
    		}
    		
    		numCopy /= 10;
    	}
    	
    	numCopy = number;
    	tmp = numCopy % 10;
    	
    	while(numCopy > 0) {
    		if(numCopy % 10 != tmp) {
    			break;
    		}
    		
    		numCopy /= 10;
    	}
    	
    	if(numCopy == 0 && number > 10) {
    		deluxe = true;
    	}
    		
    	if(three == true && five == true && deluxe == true) {
    		return "fizz buzz deluxe";
    	} else if(three == true && five == true) {
    		return "fizz buzz";
    	} else if(deluxe == true) {
    		return "deluxe";
    	} else if(three == true) {
    		return "fizz";
    	} else if(five == true) {
    		return "buzz";
    	}
    	
    	return Integer.toString(number);
    }

}
