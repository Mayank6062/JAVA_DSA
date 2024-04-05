 public class LLpalindrome {
     Node head ;
     class Node {
         String data;
         Node next;

         Node(String data){
             this.data = data ;
             this.next = null;
           
         }
     }
     public Node reverse(Node head){
         Node prev = head;
         Node curr = head.next;
         while(curr != null){
             Node next = curr.next;
             curr.next = prev;

             prev = curr ;
             curr = next;
         }
         return prev;
     }
     public Node findMiddle(Node head){
         //approch-1 ->size/2;
        // app->2-> tirttle & hear ---->
         Node hare = head;
         Node turtle = head;
         while(hare.next != null && hare.next.next != null){
             hare = hare.next.next;
             turtle = turtle.next;     
         }
         return turtle;
     }

     public boolean isPalindrome(Node head){
         if(head == null || head.next == null){
             return true;
         }

         Node middle = findMiddle(head); //first half ha end
         Node secondHalfStart = reverse(middle.next);

         Node firstHalfStart = head;
         while(secondHalfStart != null){
             if(firstHalfStart.data != secondHalfStart.data){
                 return false;
             }
             firstHalfStart = firstHalfStart.next;
             secondHalfStart = secondHalfStart.next;
         }
         return true;
     }
     public static void main(String[] args) {
        
     }
 }


