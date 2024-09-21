package JavaProgram.String;

public class Swap2Name {
    public static void main(String [] args){
        String FirstName = "Zunaid";
        String LastName = "Aalam";
        String Temp;

       /* Using third Variable
        Temp = FirstName;
        FirstName = LastName;
        LastName = Temp;*/

        //without Using 3rd Variable
        FirstName = FirstName+LastName;
        LastName = FirstName.substring(0,FirstName.length()-LastName.length());
        FirstName = FirstName.substring(LastName.length());

        System.out.println(FirstName);
        System.out.println(LastName);
    }
}
