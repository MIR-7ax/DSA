import java.util.*;

public class Insort {
    public static void Swap(int a[], int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Read array elements
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    Swap(a,i,j);
                }
            }
        }
        // Placeholder for insertion sort logic
        // (You can implement the sorting here later)

        // Print array after sorting
        System.out.println("Array after insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
