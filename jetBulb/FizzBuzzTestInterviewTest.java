package jetBulb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTestInterviewTest {
    FizzBuzzTestInterview fizzBuzzTestInterview = new FizzBuzzTestInterview();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(fizzBuzzTestInterview.fizzbuzztest(3), "Fizz".getBytes());
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(fizzBuzzTestInterview.fizzbuzztest(5), "Buzz".getBytes());
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(fizzBuzzTestInterview.fizzbuzztest(15), "FizzBuzz".getBytes());
    }

    @Test
    public void test4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzzTestInterview.fizzbuzztest(1));
    }
}
