import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows to be printed");
        int row = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int m = 1; m <= row; m++)
        {
            for (int n = row; n > m; n--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*****
//****
//***
//**
//*