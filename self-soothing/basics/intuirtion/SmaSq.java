// import java.util.Arrays;
import java.util.Scanner;
public class SmaSq {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
    // Arrays.sort(a);
        int ar[] = new int[m*n];   
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]= sc.nextInt();
                }
            } 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[(i+j)+2*i] = a[i][j];
            }
        }
        for(int i=0;i<m*n;i++)
        {
            if(i%m==0) System.out.println();
           System.out.print(ar[i]+" ");
        //    if(i%)
        }
        sc.close();
    }
}
