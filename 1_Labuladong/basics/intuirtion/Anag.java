import java.util.*;

public class Anag {
    public static boolean isAnagram(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        if (l1 != l2) {
            return false;
        }

        // Collect characters into sets
        Set<Character> h1 = new HashSet<>();
        Set<Character> h2 = new HashSet<>();

        for (int i = 0; i < l1; i++) {
            h1.add(s.charAt(i));
        }
        for (int i = 0; i < l2; i++) {
            h2.add(t.charAt(i));
        }

        // Convert h2 to list for indexed access
        List<Character> h21 = new ArrayList<>(h2);

        if (h1.size() == h2.size()) {
            for (int i = 0; i < h1.size(); i++) {
                if (h1.contains(h21.get(i))) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        // Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        boolean result =isAnagram(s, t);
        System.out.println("Are they anagrams? " + result);

        sc.close();
    }
}
