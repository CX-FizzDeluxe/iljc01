package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	boolean threeDiv = false, fiveDiv = false;
    	int numCopy = number;
    	
    	while(numCopy/3 == (int) numCopy/3) {
    		if(numCopy == 1) { 
    			return "fizz";
    		} else if(numCopy == 0) {
    			return Integer.toString(number);
    		}
    	}
    	
    	numCopy = number;
    	while(numCopy/5 == (int) numCopy/5) {
    		if(numCopy == 1) {
    			return "buzz";
    		} else if(numCopy == 0) {
    			return Integer.toString(number);
    		}
    	}
    	
    	numCopy = number;
    	while(numCopy != 0) {
    		if(numCopy % 3 == 0) {
    			threeDiv = true;
    			numCopy /= 3;
    		}
    		
    		if(numCopy % 5 == 0) {
    			fiveDiv = true;
    			numCopy /= 5;
    		}
    		
    		if(numCopy == 1 && threeDiv == true && fiveDiv == true) return "fizz buzz";
    	}
    	
    	return Integer.toString(number);
    }

}
