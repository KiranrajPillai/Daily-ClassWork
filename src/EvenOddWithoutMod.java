import java.util.Scanner;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scan.nextInt();

        if ((a/2) *2== a) {
            System.out.println("Its an Even Number");
        }
        else {
            System.out.println("Its an Odd Number");
        }
    }
}
