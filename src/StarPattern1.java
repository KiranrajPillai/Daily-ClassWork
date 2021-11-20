import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total rows to be printed :");
        int row = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int m = 1; m <= row; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//*
//**
//***
//****
//*****
