import java.util.ArrayList;
import java.util.List;

public class FizzBuzzKata {

    public static void main(String[] args){
        List<String> listToPrint = getListOfNumbersAndStrings();
        listToPrint.forEach(System.out::println);
    }

    public static List<String> getListOfNumbersAndStrings() {
        List<String> numbers = new ArrayList<>();
        for(int i= 1; i<=30; i++){
            if(isThreeMultiple(i)&&isFiveMultiple(i))
               numbers.add("FizzBuzz");
            else if(isThreeMultiple(i))
                numbers.add("Fizz");
            else if(isFiveMultiple(i))
                numbers.add("Buzz");
            else
                numbers.add(String.valueOf(i));
        }

        return numbers;
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
