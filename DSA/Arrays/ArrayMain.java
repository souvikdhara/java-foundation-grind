package DSA.Arrays;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] ans1 = TwoSum.twoSum(new int[]{2,7,11,15}, 22);
        System.out.println(Arrays.toString(ans1));
        assert ans1[0] == 0 && ans1[1] == 1;
        assert MaximumProfit.maximumProfit(new int[]{7,1,5,3,6,4}) == 5;
        System.out.println("Maximum profit "+MaximumProfit.maximumProfit(new int[]{7,1,5,3,8,4}));
    }
}
