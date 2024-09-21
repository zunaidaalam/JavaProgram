package JavaProgram.String;

import java.util.ArrayList;
import java.util.List;

//write all the combinations for ABCDE.
public class AllCombinationABCDE {

    public static void generatePermutation(String prefix,String str,List<String> permutation){
        int m = str.length();
        if(m == 0){
            permutation.add(prefix);
        }
        else{
            for(int i=0;i<m;i++){
                generatePermutation(prefix + str.charAt(i),str.substring(0, i)+str.substring(i+1,m),permutation);
            }
        }
    }
    public static void main(String [] args){
        String str = "ABCDE";
        List<String> permutation = new ArrayList<>();
        generatePermutation("", str,permutation);

        for(String perm: permutation){
            System.out.println(perm);
        }
    }
}
