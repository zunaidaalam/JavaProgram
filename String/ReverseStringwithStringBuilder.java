package JavaProgram.String;

public class ReverseStringwithStringBuilder {

    public static String inputstring(String input){
        return new StringBuilder(input).reverse().toString();
    }
    public static void main(String [] args){
        String inputStr = "Zunaid Aalam";
        String outputString = inputstring(inputStr);
        System.out.println(outputString);
    }
}
