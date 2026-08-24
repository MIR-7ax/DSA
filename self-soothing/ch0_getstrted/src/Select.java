// import java.io.*;
import java.util.*;

public class Select {
//one way of doing selection sort is to compare
//  max and other
//is by comparing min value
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> a1 = new ArrayList<>();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=n-1;i>0;i--)//i=0;i<n-1
            {
                int max=0;//min=i
                for(int j=1;j<=i;j++)//j=i+1for min 
                {
                    if(a[j]>a[max])
                    {
                        max= j;
                    }
                }
                a1.add(max);
                int temp= a[max];
                a[max] = a[i];
                a[i] =temp;
            }
            boolean p=true;
            for(int i:a1)
            {
                if(!p) System.out.print(" ");
                System.out.print(i);
                p=false;
            }
            System.out.println();
            sc.close();
        }
    }
}