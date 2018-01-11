package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzTest {
	
	@Test
	public void compute_fizz() {
		assertThat(FizzBuzz.fizz_buzz(43), equalTo("fizz"));
		assertThat(FizzBuzz.fizz_buzz(250), equalTo("buzz"));
		assertThat(FizzBuzz.fizz_buzz(36), equalTo("fizz"));
		assertThat(FizzBuzz.fizz_buzz(225), equalTo("fizz buzz"));
	}

}
