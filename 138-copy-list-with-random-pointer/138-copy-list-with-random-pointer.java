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
            // Step1 : Create normal clone using next pointer 
             Node temp=head;
             Node clonehead=null;
             Node clonetail=null;
            
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
            
            //Step 2: Create a mapping to store random pointers
            HashMap<Node,Node> mp=new HashMap<>();
            
            temp=head;
            Node clone=clonehead;
            
            while(temp != null && clone != null){
                    mp.put(temp,clone);
                    temp=temp.next;
                    clone=clone.next;
            }
            
            // Step3: Make random pointer allocation
            
            clone=clonehead;
            Node originalhead=head;
            while(clone != null){
                    clone.random=mp.get(originalhead.random);
                    clone=clone.next;
                    originalhead=originalhead.next;
            }
            return clonehead;      
    }
}