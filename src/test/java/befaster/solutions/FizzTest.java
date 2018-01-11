package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {

	public static void main(String[] args) {
		//System.out.println(FizzBuzz.fizzBuzz(2));
		assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
	}

}
