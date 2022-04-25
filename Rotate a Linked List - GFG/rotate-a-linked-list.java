// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    private int getlength(Node head){
        Node temp=head;
        int c=0;
        while(temp != null){
            temp=temp.next;
            c++;
        }
        return c;
    }
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null){
            return head;
            
        }
        int l=getlength(head);
        if(k==l){
            return head;
        }
        k=k%l;
        if(k==0){
            return head;
        }
        Node temp1=head;
        Node temp=head;
        int i=0;
        while(i != k-1){
            temp=temp.next;
            i++;
        }
        Node newhead=temp.next;
        temp.next=null;
        Node start=newhead;
        while(start.next != null){
            start=start.next;
        }
        start.next=temp1;
        return newhead;
        
        
    }
}
