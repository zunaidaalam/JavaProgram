package JavaProgram.String;

public class ReverseString {
    public static void main(String [] args){

        String inputString = "Zunaid Aalam";

        String outputString = "";

        for(int i = inputString.length()-1;i >= 0; i--){
            outputString = outputString + inputString.charAt(i);
        }
        System.out.println("String has been Reversed: "+outputString);
    }
}
