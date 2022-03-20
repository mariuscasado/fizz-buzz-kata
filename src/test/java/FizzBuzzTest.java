import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldReturnNumbersUpToThirtyWhereThreeAndFiveMultiplesAreChangedToCorrespondingStrings(){

        List<String> numbersAndStrings = FizzBuzzKata.getListOfNumbersAndStrings();

        List<String> result = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz");
        assertThat(numbersAndStrings).isEqualTo(result);
    }

}
