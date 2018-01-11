package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		//assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
		assertThat(FizzBuzz.fizzBuzz(5), equalTo("buzz"));
		assertThat(FizzBuzz.fizzBuzz(9), equalTo("fizz"));
		assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
	}

}
