package JavaProgram.String;

public class VowelsCount {

    public static int vowelscount(String input){
        int count = 0;
        for(char c:input.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        String str = "Zunaid is the Great Person";
        System.out.println("Vowels in this String are: "+vowelscount(str));
    }
}
