import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        String chekingPattern;

        while (true) {
            chekingPattern = input.nextLine();
            if (chekingPattern.isEmpty()) {
                break;
            }
            String pattern = "[a-zA-z]+";
            Pattern r = Pattern.compile(pattern);
            Matcher math = r.matcher(chekingPattern);
            while (math.find()) {
                result++;
            }
        }

        System.out.println(result);
        input.close();
    }
}
