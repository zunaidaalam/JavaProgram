package JavaProgram.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find3rdLargest {

    //[1,6,9,-4,0.4,3,23,45,67,-89] FIND THE 3RD LARGEST NUMBER IN THE ARRAY.

    public static Double findThirdLargest(double [] arr){
        Set<Double> uniquenumber = new HashSet<>();
        for(double num:arr){
            uniquenumber.add(num);
        }
        if(uniquenumber.size()<3){
            return null;
        }
        Double [] uniqueArray = uniquenumber.toArray(new Double[0]);
        Arrays.sort(uniqueArray, (a,b) -> Double.compare(b,a));
        return uniqueArray[2];
    }
    public static void main(String[] args){
        double[] array = {1,6,9,-4,0.4,3,23,45,67,-89};
        Double thirdLargest = findThirdLargest(array);
        if(thirdLargest != null){
            System.out.println("Third Largest Number "+thirdLargest);
        }
        else{
            System.out.println("Not a unique number");
        }
    }
}
