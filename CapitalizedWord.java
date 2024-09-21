package JavaProgram;

public class CapitalizedWord {
    public static int CapitalWord(String inputString){

        System.out.println("Capitalized Word");
        int counter = 0;
        for(int i = 0; i<inputString.length();i++){
            if(inputString.charAt(i)>= 'A' && inputString.charAt(i)<='Z'){
                counter++;
            }

        }
        return counter;
    }
    public static void main(String [] args){
        System.out.println(CapitalWord("ZunaidAalamis the best"));
    }

}
