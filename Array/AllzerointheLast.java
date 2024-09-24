package JavaProgram.Array;

import java.util.Arrays;

//{2,0,9,0,4,0,6,0}
public class AllzerointheLast {

    public static void movezeros(int [] array){
        int count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]!=0){
                array[count++] = array[i];
            }
        }
        while(count<array.length){
            array[count++] = 0;
        }
    }

     public static void main(String [] args) {

         int [] array = {2,0,9,0,4,0,6,0,-1};
         movezeros(array);
         System.out.println(Arrays.toString(array));


    }
}