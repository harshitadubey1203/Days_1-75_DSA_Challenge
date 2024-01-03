

import java.util.Scanner;

public class good_pairs_1512 {
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                if(nums[i]==nums[j] && (i<j || i>j)){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for(int i = 0 ;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int res = numIdenticalPairs(nums);
        System.out.println(res);
}
}
