public class LLReverseLL {
    Node head ;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data ;
            this.next = null;
           
        }
    }

    //reverse by iterative approch
public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            //update
            preNode = currNode;
            currNode = nextNode;
        }
        //1->2->3 esme 1->2 remove ke liye
        head.next = null;
        head = preNode;
     }



     //reverse by recersive approch
     public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
     }


     public static void main(String []args){
         

     }

 }
