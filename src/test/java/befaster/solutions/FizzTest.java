package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		assertThat(FizzBuzz.fizzBuzz(5555), equalTo("buzz fake deluxe"));
		assertThat(FizzBuzz.fizzBuzz(63), equalTo("fizz fake deluxe"));
		assertThat(FizzBuzz.fizzBuzz(35235), equalTo("fizz buzz deluxe"));
		assertThat(FizzBuzz.fizzBuzz(225), equalTo("fizz buzz"));
	}

}
