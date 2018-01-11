package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	boolean threeMultiple = false, fiveMultiple = false;
    	int numCopy = number;
    	
    	if(number % 5 == 0)
    		fiveMultiple = true;
    	
    	while(numCopy > 0) {
    		numCopy /= 3;
    		
    		if(numCopy == 1 && number != 1) {
    			threeMultiple = true;
    		}
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

}
