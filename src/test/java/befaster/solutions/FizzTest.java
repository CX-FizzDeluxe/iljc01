package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		
		assertThat(FizzBuzz.fizzBuzz(3), equalTo("fizz fake deluxe"));
		assertThat(FizzBuzz.fizzBuzz(510), equalTo("fizz buzz deluxe"));
	}

}
