import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineListOfLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        String secindLine = input.nextLine();
        input.close();

        String outputString = "";
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < firstLine.length(); i++) {
            char current = firstLine.charAt(i);
            list.add(current);
        }
        outputString += firstLine;
        for (int i = 0; i < secindLine.length(); i++) {
            char current = secindLine.charAt(i);
            if (list.contains(current)) {
                continue;
            } else {
                outputString += " " + current;
            }
        }
        System.out.println(outputString);
    }
}
