// import java.util.List;

// import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}
public class Main1{
   static ListNode head;
    ListNode createNode(int v){
        if(head == null){
           ListNode n = new ListNode(v,null); 
           head = n;
           return head;
        }
        else{
            ListNode n = new ListNode(v,null);
            ListNode curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next= n ;
        }
        return head;
    }
    static void print(){
        if(head==null){
            return;
        }
        else{
            ListNode curr =head;
            while(curr!=null) {
                System.out.println(curr.val);
                curr = curr.next;
            }

        }
    }
    public static void main(String[] args) {
        // ListNodel = new ListNode(0, null);
        Main1 l =new Main1();
        l.createNode(1);
        l.createNode(1);
        l.createNode(1);
        print();
    }
}
// public class Main1{
//     static class LinkedList{
//         ListNode head;
//         void insert(int val){
//             ListNode newNode = new ListNode(val,null);
//             if(head == null){
//                 head=newNode;
//                 return;
//             }
//             ListNode curr = head;
//             while(curr.next!=null)
//             {
//                 curr= curr.next;
//             }
//             curr.next = newNode;
//         }
//         void delete(int val){
//             if(head == null){
//                 return;
//             }
//             if(head.val == val){
//                 head = head.next;
//                 return;
//             }
//             ListNode curr = head;
//             while(curr.next!=null && curr.next.val!=val){
//                 curr = curr.next;
//             }
//             curr.next = curr.next.next;
//         }
//         void update(int oldVal, int newVal){
//             if(head == null){
//                 return;
//             }
//             if(head.val == oldVal){
//                 head.val=newVal;
//             }
//             ListNode curr = head;
//             while(curr.next!=null && curr.val!=oldVal){
//                 curr = curr.next;
//             if(curr.val == oldVal){
//                 curr.val = newVal;
//                 return;
//             }
//             else{
//                 System.out.println("Value not found");
//                 return;
//                 }
//             }
//         }
//         void print(){
//             if(head == null){
//                 System.out.println("List is empty");
//                 return;
//             }
//             ListNode curr = head;
//             while(curr!=null){
//                 System.out.print(curr.val+"-->");
//                 curr = curr.next;
//             }
//             System.out.print("null \n");
//         }
//     }
//     public static void main(String[] args) {
//         LinkedList l = new LinkedList();
//         l.insert(1);
//         l.insert(2);
//         l.insert(3);
//         l.print();
//         l.update(2, 22);
//         l.print();
//         l.delete(3);
//         l.print();
//     }
// }

