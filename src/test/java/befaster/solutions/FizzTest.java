package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		assertThat(FizzBuzz.fizzBuzz(7), equalTo("7"));
		assertThat(FizzBuzz.fizzBuzz(25), equalTo("buzz"));
		assertThat(FizzBuzz.fizzBuzz(9), equalTo("fizz"));
		assertThat(FizzBuzz.fizzBuzz(225), equalTo("fizz buzz"));
	}

}
