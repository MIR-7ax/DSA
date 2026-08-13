// package leetcde;

// package leetcde;
//try tc less than O(n^2);
import java.util.Scanner;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int arr[] = new int[2];
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l; j++) {   // start from i+1 to avoid i==j
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; // return immediately once found
                }
            }
        }
        return arr; // default [0,0] if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Input array
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        sc.close();

        // Call twoSum
        int[] result = twoSum(nums, target);

        // Output
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
