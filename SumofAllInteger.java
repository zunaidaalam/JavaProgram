package JavaProgram;

//Get the sum of all elements in a integer Array
public class SumofAllInteger {

   public static int getSum(int [] array){
       int sum = 0;
       for(int number:array){
           sum = sum+number;
       }
       return sum;
   }
   public static void main(String [] args){
       int [] numbers = {1,2,3,4,5};
       int sum = getSum(numbers);
       System.out.println("Sum of All Integers: "+sum);
   }
}
