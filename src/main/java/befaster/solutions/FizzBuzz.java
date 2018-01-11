package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	boolean threeMultiple = false, fiveMultiple = false;
    	
    	if(number % 3 == 0) {
    		threeMultiple = true;
    	}
    	
    	if(number % 5 == 0) {
    		fiveMultiple = true;
    	}
    	
    	if(threeMultiple == true && fiveMultiple == true) {
    		return "fizz buzz";
    	} else if(threeMultiple == true) {
    		return "fizz";
    	} else if(fiveMultiple == true) {
    		return "buzz";
    	}
    	
    	return Integer.toString(number);
    }

    
    public static String fizz_buzz(Integer number) {
    	boolean three = false, five = false;
    	int numCopy = number;
    	
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
    	
    	
    	if(three == true && five == true) {
    		return "fizz buzz";
    	} else if(three == true) {
    		return "fizz";
    	} else if(five == true) {
    		return "buzz";
    	}
    	
    	return Integer.toString(number);
    }

}
