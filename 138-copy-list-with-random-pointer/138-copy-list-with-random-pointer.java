/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
            
          //Step1: Create a Clone Linked List
            
            Node clonehead=null;
            Node clonetail=null;
            Node temp=head;
            
            while(temp != null){
                    Node newnode=new Node(temp.val);
                    if(clonehead == null){
                            clonehead=newnode;
                            clonetail=newnode;
                    }
                    else{
                            clonetail.next=newnode;
                            clonetail=newnode;
                    }
                    temp=temp.next;
            }
            
          //Step2: Add clone likedlist in between original list
            
           Node original=head;
           Node clone=clonehead;
            
            while(original != null && clone != null){
                    Node next=original.next;
                    original.next=clone;
                    original=next;
                    
                    next=clone.next;
                    clone.next=original;
                    clone=next;
            }
            
          //Step3: Add the random pointers to the clonedlist
            temp=head;
            while(temp != null){
                    if(temp.next!=null){
                            temp.next.random= temp.random!=null?temp.random.next:temp.random;
                    }
                    temp=temp.next.next;
            }
            
          //Step4: revert changes made in step2
           original=head;
           clone=clonehead;
            while(original != null && clone != null){
                    original.next=clone.next;
                    original=original.next;
                    if(clone.next != null){
                    clone.next=clone.next.next;
                    }
                    clone=clone.next;
            }
           
          // Return clonehead;
            return clonehead;
            
        
    }
}