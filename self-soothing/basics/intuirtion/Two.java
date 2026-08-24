import java.util.Scanner;
import java.util.Arrays;
public class Two {

    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        Arrays.sort(nums);
        int arr[] = new int[2];
        // for (int i = 0; i < l; i++) {
        //     for (int j = 1; j < l; j++) {   // start from i+1 to avoid i==j
        //         if ((nums[i] + nums[j]) == target) {
        //             arr[0] = i;
        //             arr[1] = j;
        //             return arr; // return immediately once found
        //         }
        //     }
        // }
        int left = 0, right=l-1;
        while ((left<right) && (left<=l-1)&& (right>=0)) {
            if((nums[left]+nums[right])==target){
                arr[0]=left;
                arr[1]=right;
                return arr;
            }
            else if(nums[left] + nums[right] < target){
                left++;
            }
            else
            {
                right--;
            }
        }
        System.out.println(nums[right]);
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
