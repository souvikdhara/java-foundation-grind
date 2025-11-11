package DSA.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TwoSum {
    public static int[] twoSum(int arr[],int sum){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int lookup = sum-arr[i];
            if(map.containsKey(lookup)){
                return new int[]{map.get(lookup),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
