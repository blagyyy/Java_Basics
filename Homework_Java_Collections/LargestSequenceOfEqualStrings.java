import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        scan.close();

        String last = "";
        String current = "";
        int maxLength = 0;
        int currentLength = 0;
        int endIndex = 0;
        for (int input = 0; input < array.length; input++) {
            if (input == 0) {
                currentLength++;
                continue;
            }
            last = array[input - 1];
            current = array[input];
            if (current.contains(last)) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = input;
                }
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    currentLength = 1;
                    endIndex = input;
                } else {
                    currentLength = 1;
                }
            }
        }
        if (maxLength == 1 || maxLength == 0) {
            System.out.print(array[0] + " ");
        } else {
            for (int i = 0; i < maxLength; i++) {
                System.out.print(array[endIndex--] + " ");
            }
        }

    }
}
