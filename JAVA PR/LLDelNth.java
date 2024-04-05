 public class LLDelNth {
     Node head ;
    
     class Node {
         String data;
         Node next;

         Node(String data){
             this.data = data ;
             this.next = null;
         }
     }
     public Node removeNthFromEnd(Node head, int n){
         if(head.next == null){
             return null;
         }
        
         int size = 0;
         Node curr = head;
         while(curr != null ){
             curr = curr.next;
             size++;
         }
         if(n == size){
             return head.next;
         }

         int indexToSearch = size - n;
         Node prev = head;
         int i =1;
         while(i != indexToSearch) {
             prev = prev.next;
             i++;
         }
         prev.next = prev.next.next;
         return head;



     }
     public static void main(String[] args) {
        
     }
 }
