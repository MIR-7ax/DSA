import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Read elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Insertion sort
        for (int i = 1; i < n; i++) {
            int ele = a[i];   // store a[i]
            int j = i - 1;    // pointer before i

            while (j >= 0 && a[j] > ele)
            {
                a[j + 1] = a[j]; // shift right
                j--;
            }
            a[j + 1] = ele;   // insert element
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
