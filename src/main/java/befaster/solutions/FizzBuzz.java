package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	boolean threeDiv = false, fiveDiv = false;
    	int numCopy = number;
    	
    	while(numCopy != 0) {
    		if(numCopy % 3 == 0) {
    			numCopy /= 3;
    			threeDiv = true;
    		} else if(numCopy % 5 == 0) {
    			numCopy /= 5;
    			fiveDiv = true;
    		}
    		
    		if(numCopy == 1 && threeDiv == true && fiveDiv == true) {
    			return "fizz buzz";
    		} else if(numCopy == 1 && threeDiv == true) {
    			return "fizz";
    		} else if(numCopy == 1 && fiveDiv == true) {
    			return "buzz";
    		} else {
    			break;
    		}
    	}
    	
    	return Integer.toString(number);
    }

}
