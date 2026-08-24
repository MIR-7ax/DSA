import java.util.*;

//===== Declare Imports here if required =====


public class create {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    //===== Declare Global Variables / Functions here if required =====


    static void solve(int N, Scanner sc) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            //===== Declare Local Variables / Functions here if required =====
        // boolean f = true;
        // if(sc.hasNext()){
        // // int a = sc.nextInt();
        // }
        // else{
        //     break;
        // }
            //===== Write Your Logic Here =====
        Node newNode = new Node(x);
        if(head == null){
        head = newNode;
       tail = newNode;
        tail.next=null;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        // if(!f){
        //     System.out.print(" ");
        // }
        // System.out.print()

        }

        //===== Write Your Logic Here =====
    boolean f = true;
    // Node ptr = new Node;
    // ptr = head;
    Node curr = head;
    while(curr!=null){
        if(!f) System.out.print(" ");
        System.out.print(curr.data);
        f = false;
        curr = curr.next;
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solve(N, sc);
        // solve(N, sc);;
    }
}