import java.util.Scanner;

public class StarPattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of rows: ");
        int NumberofRows = scanner.nextInt();
        for (int i = 1; i <= NumberofRows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
