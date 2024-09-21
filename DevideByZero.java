package JavaProgram;

import java.util.Scanner;

public class DevideByZero {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which is devided by Zero : ");
        int n = sc.nextInt();

        try
        {
            System.out.println("Expression is : "+n/0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
