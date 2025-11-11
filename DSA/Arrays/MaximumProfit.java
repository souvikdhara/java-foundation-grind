package DSA.Arrays;

public class MaximumProfit {
    public static int maximumProfit(int[] arr){
        int min = Integer.MAX_VALUE;
        int best = 0;
        for(int p : arr){
            if(p<min) min =p;
            else best = Math.max(best, p-min);
        }
        return best;

    }
}
