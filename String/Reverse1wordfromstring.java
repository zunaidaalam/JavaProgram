package JavaProgram.String;

public class Reverse1wordfromstring {
    public static void main (String [] args){

        String inputString = "My name is Zunaid Aalam";

        String [] reverseString = inputString.split(" ");

        for(int i=0;i<reverseString.length;i++){
            if(reverseString[i].equals("Zunaid")){
                reverseString[i] = new StringBuilder(reverseString[i]).reverse().toString();
            }
        }
        String modifiedString = String.join(" ", reverseString);
        System.out.println(modifiedString);
    }
}
