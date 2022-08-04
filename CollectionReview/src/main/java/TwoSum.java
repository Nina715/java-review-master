import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] myArr = {2,7,9,11};
        System.out.println(Arrays.toString(returnIndicesSol1(myArr, 9)));

        System.out.println("optimum solution");
        System.out.println(Arrays.toString(returnIndices2(myArr, 9)));
    }
    public static int[] returnIndicesSol1 (int[] ints,Integer target){

        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i]+ints[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    //optimize: can we solve it in one pass?
    //use hashmap
    public static int[] returnIndices2 (int[] ints,int target){
        // create hashMap
        Map<Integer,Integer> indicesMap = new HashMap<>();
        //Interate over array. if a potential match exist, return indices, else, putting array value and index to map
        for (int i = 0; i < ints.length; i++) {
            int potentialMatch=target-ints[i];
            if (indicesMap.containsKey(potentialMatch)){
                return new int[] {i,indicesMap.get(potentialMatch)};
            }else{
                indicesMap.put(ints[i],i);
            }
        }
        return new int[]{};
    }
}
