// import java.io.*;
import java.util.*;

public class Tr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            long n = sc.nextLong();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            long te=n;
            long d=1;
            int c=0;
            // if(te==1){
            //     System.out.println(1);
            // }
            while(te>=d)
            {
                c++;
                d = d * 2;
            }
            // te = n;
            long p = 1L <<(c-1);
            while(p>0)
            {
                if(te>=p)
                {
                    System.out.print(1);
                    te=te-p;
                }
                else
                {
                    System.out.print(0);
                    // te = te -p;
                }
                p = p/2;
            }
            System.out.println();
        }
        sc.close();
    }
}