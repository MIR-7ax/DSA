import java.util.*;

class Best_stock {
    static public int maxProfit(int[] prices) {
        int l = 0, r = 1, max = 0;
        while (r != prices.length) {
            if (prices[l] < prices[r]) {
                int prof = prices[r] - prices[l];
                max = Math.max(max, prof);
            } else {
                l = r;
            }
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First input: number of days
        System.out.println("enter size:");
        int n = sc.nextInt();
        int[] prices = new int[n];

        // Next n inputs: prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Solution sol = new Solution();
        int res = maxProfit(prices);
        System.out.println("\n"+res);

        sc.close();
    }
}
