import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        // long d = sc.nextLong();
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.print(a+1); parseInt, parseFloat all used to make inout string into data types
        System.out.println("int: "+a+"\nfloat: "+b+"\ndouble: "+c);
        int a1 = 24;// this is simple int variable
        //technically called primitive int variable
        Integer b1 = a1;
        // this is called Integer type object
        //  so this Integer b1 =a is called autoboxing and similarly
        // int c1=b1 is called unboxing that is converting
        // integer object to primitive
        // that is,   conversion of int to Integer,
        // long to Long, double to Double, etc.
        System.out.println("primitive int: "+a1+"\nInteger object b1 is:"+b1);
        String s = "123";
        int n = Integer.parseInt(s);
        System.out.println(n+1);
        System.out.println(s+1);
        sc.close();
    }
}
