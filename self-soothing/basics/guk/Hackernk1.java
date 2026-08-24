import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
import java.util.stream.*;



public class Hackernk1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            int  n =0;
            try {
                n = Integer.parseInt(bufferedReader.readLine().trim());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            int sum = 0;
            for(int i=1;i<n;i++)
            {
                if(i%3==0 || i%5==0)
                {
                    sum = sum+i;
                }
            }
            System.out.print(sum+"\n");
        });

        bufferedReader.close();
    }
}
