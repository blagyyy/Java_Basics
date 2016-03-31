import java.util.Scanner;

public class sequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        scan.close();

        String last = "";
        String current = "";
        for (int input = 0; input < array.length; input++) {
            if (input == 0) {
                System.out.print(array[input] + " ");
                continue;
            }
            last = array[input - 1];
            current = array[input];
            if (current.contains(last)) {
                System.out.print(current + " ");
            } else {
                System.out.println();
                System.out.print(current + " ");
            }
        }
    }
}

