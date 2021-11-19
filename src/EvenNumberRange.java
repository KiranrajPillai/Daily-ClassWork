import java.util.Scanner;

public class EvenNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number of the range");
        int number1 = sc.nextInt();
        System.out.println("Enter the ending number of the range");
        int number2 = sc.nextInt();
        int i;
        if(number1 % 2 == 0)
        {
            number1++;
        }
        for(i = number1; i <= number2; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
