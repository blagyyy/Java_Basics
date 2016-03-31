import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        String chekingText = input.nextLine();
        String pattern = "[a-zA-z]+";
        Pattern r = Pattern.compile(pattern);
        Matcher math = r.matcher(chekingText);
        List<String> elements = new ArrayList<String>();
        String target = input.nextLine();

        while (math.find()) {
            elements.add(math.group());
        }
        for (String word : elements) {
            if (target.equals(word) && (target.length() == word.length())) {
                result++;
            }
        }
        System.out.println(result);
        input.close();
    }
}
