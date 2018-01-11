package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		
		assertThat(FizzBuzz.fizzBuzz(35532), equalTo("fizz deluxe"));
		assertThat(FizzBuzz.fizzBuzz(225), equalTo("buzz fake deluxe"));
	}

}
