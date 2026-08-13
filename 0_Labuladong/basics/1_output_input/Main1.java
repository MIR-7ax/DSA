import java.io.*;
//.io.* use for br bw pw and for st use util.stringtokenizer
// import java.util.StringTokenizer;
//can use .io.IOExecpetion or just throws Exception is enough too

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        // Taking input
        System.out.println("Enter string:");
        String s = br.readLine();
        System.out.println(s);

        System.out.println("Enter integer:");
        int e = Integer.parseInt(br.readLine());
        System.out.println(e);

        // BufferedWriter demo
        bw.write("hello");
        bw.newLine();
        bw.flush();

        // PrintWriter demo
        pw.println("Much more convenient printing");
        pw.println(100);
        pw.printf("integer: %d\n", 9); 
         //for sys.out.printf("s %d"+9); is fine but for pw , should be used
        pw.flush();
    }
}
