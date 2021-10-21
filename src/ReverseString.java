public class ReverseString {
    public static void main(String[] args) {
        String string = "Kiran";
        String reverseString = "";
        for(int i = string.length()-1; i >= 0; i--){
            reverseString = reverseString + string.charAt(i);
        }
        System.out.println("Original string: " + string);
        System.out.println("Reverse of given string: " + reverseString);
    }
}
