package JavaProgram;

public class SumDigit {

    public static int SumValues(int num){
        int sum = 0;

        while (num != 0){
            int rem = num % 10;
            sum = sum+rem;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String [] args){
        System.out.println("Value of sum are : " +SumValues(371));
    }


}
