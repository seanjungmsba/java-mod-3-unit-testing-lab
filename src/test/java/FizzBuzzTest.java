// Sean Jung
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzzTester;

    @BeforeEach
    void setUp() {
        fizzBuzzTester = new FizzBuzz();
    }

    @Test
    void startsWithFShouldReturnFizz() {
        assertEquals("Fizz",fizzBuzzTester.fizzBuzzString("friday"));
    }

    @Test
    void endsWithBShouldReturnBuzz() {
        assertEquals("Buzz",fizzBuzzTester.fizzBuzzString("bob"));
    }

    @Test
    void startsWithFAndEndsWithBShouldReturnFizzBuzz() {
        assertEquals("FizzBuzz",fizzBuzzTester.fizzBuzzString("fob"));
    }

    @Test
    void emptyStringShouldReturnNull() {
        assertNull(fizzBuzzTester.fizzBuzzString(""));
    }

}