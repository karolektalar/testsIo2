
import java.lang.reflect.Executable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    }

    static int Add(String numbers) throws NegativeException {
        if (numbers.equals("")) {
            return 0;
        }
        int sum = 0;
        String[] dividedNumbers;
        if ("//".equals(Character.toString(numbers.charAt(0)) + Character.toString(numbers.charAt(1)))) {
            String[] tempSplit = numbers.split("\n");
            String[] delimiterSplit = tempSplit[0].split("\\[");
            delimiterSplit[0] = "0";
            String regex = "";
            for (String s : delimiterSplit) {
                regex += s.substring(0, s.length() - 1) + "|";
            }
            dividedNumbers = tempSplit[1].split(regex.substring(1, regex.length() - 1));
        } else {
            dividedNumbers = numbers.split(",|\n");
        }

        for (String s : dividedNumbers) {
            if ("-".equals(Character.toString(s.charAt(0)))) {
                throw new NegativeException("no negatives are allowed");
            } else {
                if (Integer.parseInt(s) < 1001)
                    sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}
