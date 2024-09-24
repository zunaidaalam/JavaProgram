package JavaProgram;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n < 0)
        {
            System.out.println("Value of N Can't be Negative !! ");
            return;
        }

        if (n == 0){
            System.out.println("Value of A is : "+a);
        } else if (n == 1) {
            System.out.println("Value of B is : "+b);
        }
        else {
            int c=0;
            for(int i = 2; i <= n; i++){
                c=a+b;
                a = b;
                b = c;
            }
            System.out.println("Value of C is : "+c);
        }
    }
}
