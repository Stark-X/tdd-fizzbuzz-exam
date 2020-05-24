package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestFizzBuzz {

    @Test
    void should_return_fizz_when_count_off_given_number_is_divisible_by_3() {
        List<Integer> numbers = Arrays.asList(3, 6, 9);

        for (Integer number : numbers) {
            FizzBuzz fizzBuzz = new FizzBuzz(number);
            String result = fizzBuzz.countOff();
            assertThat(result, equalTo("Fizz"));
        }
    }

    @Test
    void should_return_fizz_when_count_off_given_number_is_divisible_by_5() {
        List<Integer> numbers = Arrays.asList(5, 10);

        for (Integer number : numbers) {
            FizzBuzz fizzBuzz = new FizzBuzz(number);
            String result = fizzBuzz.countOff();
            assertThat(result, equalTo("Buzz"));
        }
    }

    @Test
    void should_return_fizz_when_count_off_given_number_is_divisible_by_7() {
        List<Integer> numbers = Arrays.asList(7, 14);

        for (Integer number : numbers) {
            FizzBuzz fizzBuzz = new FizzBuzz(number);
            String result = fizzBuzz.countOff();
            assertThat(result, equalTo("Whizz"));
        }
    }

    @Test
    void should_return_fizz_when_count_off_given_number_is_divisible_by_3_and_5() {
        List<Integer> numbers = Arrays.asList(15, 30);

        for (Integer number : numbers) {
            FizzBuzz fizzBuzz = new FizzBuzz(number);
            String result = fizzBuzz.countOff();
            assertThat(result, equalTo("FizzBuzz"));
        }
    }

}
