package DSA.Arrays;

import java.util.Arrays;

public class ArrayMain {
   /* public static void main(String[] args) {
        int[] ans1 = TwoSum.twoSum(new int[]{2,7,11,15}, 22);
        System.out.println(Arrays.toString(ans1));
        assert(ans1[0] == 9 && ans1[1] == 1);
        assert MaximumProfit.maximumProfit(new int[]{7,1,5,3,6,4}) == 5;
        System.out.println("Maximum profit "+MaximumProfit.maximumProfit(new int[]{7,1,5,3,8,4}));
    }*/

//   /* public static void main(String[] args) {
//        int result = tailRecursionSum(5,0);
//        System.out.println("Recursion Sum "+result);
//    }
//
//    static void swap(int x, int y) {
//        int temp = x;
//        x = y;
//        y = temp;
//    }
//    static void recursionCount(int k){
//        if(k == 0){
//            System.out.println("Blast off!");
//            return;
//        }
//        System.out.println("Enter "+k);
//        recursionCount(k-1);
//        System.out.println("Exit "+k);
//    }
//
//    static int recursionSum(int k){
//        if(k == 0){
//            return 0;
//        }
//        return k + recursionSum(k-1);
//    }
//    static int tailRecursionSum(int k , int acc){
//        if(k == 0){
//            return acc;
//        }
//        return tailRecursionSum(k-1, acc+k);
//    }*/
public static void main(String[] args) {
    Hero h1 = new Hero("spiderman");
    Hero h2 = h1;
    h2.setName("Batman");
    System.out.println("Hero "+h1.toString());
}
}

class Hero{
    private final String name;
    private int level;
    Hero(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
