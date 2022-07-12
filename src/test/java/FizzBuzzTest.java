import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void startsWithFShouldReturnFizz() {
        FizzBuzz fizzBuzzTester = new FizzBuzz();
        assertEquals("Fizz",fizzBuzzTester.fizzBuzzString("friday"));
    }

    @Test
    void endsWithBShouldReturnBuzz() {
        FizzBuzz fizzBuzzTester = new FizzBuzz();
        assertEquals("Buzz",fizzBuzzTester.fizzBuzzString("bob"));
    }

    @Test
    void startsWithFAndEndsWithBShouldReturnFizzBuzz() { // AssertionFailedError: expected: <FizzBuzz> but was: <Buzz>
        FizzBuzz fizzBuzzTester = new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzzTester.fizzBuzzString("fob"));
    }

    @Test
    void emptyStringShouldReturnNull() { // AssertionFailedError: expected: <FizzBuzz> but was: <Buzz>
        FizzBuzz fizzBuzzTester = new FizzBuzz();
        assertNull(fizzBuzzTester.fizzBuzzString(""));
    }

}