public class PalindromeNumber {
    public static void main(String [] args){
       int r,temp,sum=0;
        int n=54451;
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
    if (temp==sum){
        System.out.println("The given number is palindrome");
    }
    else {
        System.out.println("The given Number is not a Palindrome");
    }
    }
}
