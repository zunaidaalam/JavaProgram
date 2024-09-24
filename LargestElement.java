package JavaProgram;

public class LargestElement {

    public static int largestnumber(int [] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] number = {23, 25, 24, 89};
        System.out.println("Largest Number is : "+largestnumber(number));
    }
}
