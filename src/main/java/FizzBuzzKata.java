import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args){
        List<String> listToPrint = getListOfNumbersAndStrings();
        listToPrint.forEach(System.out::println);
    }

    public static List<String> getListOfNumbersAndStrings() {
        List<String> numbers = new ArrayList<>();
        for(int numToAdd= 1; numToAdd<=30; numToAdd++){
            if(isThreeOrFiveMultiple(numToAdd))
               numbers.add("FizzBuzz");
            else if(isThreeMultiple(numToAdd))
                numbers.add("Fizz");
            else if(isFiveMultiple(numToAdd))
                numbers.add("Buzz");
            else
                numbers.add(String.valueOf(numToAdd));
        }

        return numbers;
    }

    public static boolean isThreeOrFiveMultiple(int numToAdd){
        if(numToAdd%3==0 && numToAdd%5==0)
            return true;
        else
            return false;
    }

    public static boolean isThreeMultiple(int numToAdd){
        if(numToAdd%3==0)
            return true;
        else
            return false;
    }

    private static boolean isFiveMultiple(int numToAdd){
        if(numToAdd%5==0)
            return true;
        else
            return false;
    }
}
