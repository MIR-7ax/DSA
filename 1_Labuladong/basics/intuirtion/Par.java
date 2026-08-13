// import java.io.*;
import java.util.*;

public class Par {
    static void solve(String s, int N, int o, int c)
    {
        if(s.length()==2*N)
        {
            System.out.println(s);
            return;
        }
        if(o<(N))//n2=N
        {
            solve(s+'{',N,o+1,c);
        }
        if(c<o)
        {
            solve(s+'}',N,o,c+1);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=0;
        while(t-- >0)
        {
            int n = sc.nextInt();
            String s ="";
            System.out.println("Test Case #"+(i+1));
            solve(s,n,0,0);
            i++;
        }
        sc.close();
    }
}