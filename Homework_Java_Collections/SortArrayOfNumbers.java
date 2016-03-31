import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfSimbols = scan.nextInt();
        scan.nextLine();
        int[] num = new int[numberOfSimbols];
        for (int i = 0; i < numberOfSimbols; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int current = num[i];
                int next = num[j];
                int temp = num[i];
                if (current > next) {
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

