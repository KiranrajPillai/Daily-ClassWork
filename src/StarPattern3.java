import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to be entered");
        int row = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int m = 1; m <= row; m++)
        {
            for (int n=row; n>m; n--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(m * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//       *
//      ***
//     *****
//    *******
//   *********