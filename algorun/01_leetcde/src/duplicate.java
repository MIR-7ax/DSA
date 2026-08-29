import java.util.*;
public class duplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> h = new HashSet<>();
        boolean result = false;

        for (int num : nums) {
            if (!h.add(num)) {
                result = true;
                break;
            }
        }

        System.out.println(result);
    }
}

