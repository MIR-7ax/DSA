// import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class St {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int a[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            stack.push(a);
            System.out.print(stack.peek()+" ");
        }   

    }
}
