package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		assertThat(FizzBuzz.fizzBuzz(11), equalTo("11"));
		assertThat(FizzBuzz.fizzBuzz(250), equalTo("buzz"));
		assertThat(FizzBuzz.fizzBuzz(36), equalTo("fizz"));
		assertThat(FizzBuzz.fizzBuzz(225), equalTo("fizz buzz"));
	}

}
