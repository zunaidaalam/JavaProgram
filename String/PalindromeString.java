package JavaProgram.String;

public class PalindromeString {
    public static boolean isPalindrome(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public static void main(String [] args){
        String str = "Zunaid";
        System.out.println(str + " is the Palindrome String : "+isPalindrome(str));
    }
}
