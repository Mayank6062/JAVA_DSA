 public class LLP{
     Node head ;
     private int size;
    
     LLP(){
         this.size =0;
     }
     class Node {
         String data;
         Node next;

         Node(String data){
             this.data = data ;
             this.next = null;
             size++;
         }
     }

     // first 
     public void addFirst(String data) {
         Node newNode = new Node(data);
         if(head == null){
             head = newNode ;
             return ;
         }
         newNode.next  = head ;
         head = newNode;
     }

     // last 
     public void addLast(String data){
          Node newNode = new Node(data);
         if(head == null){
             head = newNode ;
             return ;
         }
         Node currNode = head ;
         while(currNode.next != null){
             currNode = currNode.next;
         }
         currNode.next = newNode;
    }

    ///print 
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
          while(currNode != null){
            System.out.print(currNode.data +" ->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        
    }

   // delete First
     public void deleteFirt() {
         if(head == null){
             System.out.println("list is empty");
             return ;
         }
         size--;
      head = head.next;
     }

     //delete last 
     public void deleteLast(){
         if(head == null){
             System.out.println("list is empty");
             return ;
         }
         size--; 
         if(head.next == null){
             head = null;
             return ;
         }
        // size yha de to head delete but size not--hence upper likha h 
         Node secondLast = head;
         Node lastNode = head.next;
         while(lastNode.next != null){
             lastNode = lastNode.next;
             secondLast = secondLast.next;
         }

         secondLast.next = null;
     }

     public int getSize(){
         return size;
     }

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
         LLP list  = new LLP();
         list.addFirst("a");
         list.addFirst("is");
         list.addLast("list");
         list.addFirst("this");
         list.deleteFirt();
         list.deleteLast();
        list.printList();

 System.out.println(list.getSize());
  list.addFirst("this");
    list.printList();
 System.out.println(list.getSize());

     }

 }
