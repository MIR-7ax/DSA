// package labuladang;
import java.util.Scanner;
public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        // int h = key.hashCode(); this wont work quite well 
        // as int is primitive datatype and no primitive data type has 
        // methods like hashCode(),etc..
        // so use wrapper class to wrap primitive int
        //i.e use wrapper class as per the required dtype
        //aslo called autoboxing
        // Integer key = k;
        int h = s.hashCode();
        h = h & 0x7fffffff;
        System.out.println(h);
        sc.close();
    }
}
