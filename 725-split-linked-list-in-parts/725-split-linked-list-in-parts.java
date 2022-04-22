/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int length(ListNode head){
            ListNode temp=head;
            int c=0;
            while(temp!=null){
                    temp=temp.next;
                    c++;
            }
            return c;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
            
            // if(head == null){
            //         return new ListNode[]{};
            // }
            ListNode[] ans=new ListNode[k];
            if(k==1){
                    ans[0]=head;
                    return ans;
            }
            int len=length(head);
            for(int i=0;i<k;i++){
            int next_head=(len/k)+(i<(len%k)?1:0);
            ans[i]=head;
                    ListNode prev=null;
                    while(head!=null&&next_head>1){
                            head=head.next;
                            next_head--;
                    }
                    if(head!=null){
                    ListNode next=head.next;
                    head.next=null;
                    head=next;
                    }
                    
           }
            return ans;

    }
}