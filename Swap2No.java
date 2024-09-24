package JavaProgram;

public class Swap2No {
    public static void main(String [] args){
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The Value of A: " +a);
        System.out.println("The Value of B: " +b);
    }
}
