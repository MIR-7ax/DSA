// package output_input;
import java.io.*;
// import java.nio.Buffer;
import java.util.Scanner;
public class Main3 {
    // Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        output o = new output();
        o.print();
        input i = new input();
        i.inp();
        // sc.close();
    }    
}
class output{
    public void print(){
        System.out.println("System.out.println() pritns output to new line");
        System.out.print("print pritns output on same line, no new line \n");
        System.out.printf("Int: %d \n"+1);
    }
}
class input{
    public void inp(){
        // reding input by scnner and Integer/wrapper class with scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int: ");
        int a = sc.nextInt();
        sc.nextLine();  
        System.out.println(a);
        System.out.print("Enter int(string to int): ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print(x);
        sc.close();
    }
}

