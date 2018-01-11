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

}
