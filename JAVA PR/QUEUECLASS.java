/*//implement queue by the array 
//NORMAL QUEUE
public class QUEUECLASS {
    static class Queue{
        static int arr[];
        static int size ;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }


        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
        return false;
        }


        //enqueue -O(1)
        public static void add(int data){
            if(rear == size-1)//rear last index per h queue is full
            {
                System.out.println("queue is full");
                return ;
            }
            rear++;
            arr[rear] = data;
        } 
        //dequeue -O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i =0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //Peek O(n)
        public static int peek() {
            if(isEmpty()){
                System.out.println("empty qeue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String []args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
*/


/* 
//implement queue by the array 
//CIRCULE  QUEUE
public class QUEUECLASS {
    static class Queue{
        static int arr[];
        static int size ;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }


        public static boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }
        return false;
        }

        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        //enqueue -O(1)
        public static void add(int data){
            if(isFull())
            {
                System.out.println("queue is full");
                return ;
            }
            //1st ele add
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size; //-1 to 0 rear
            arr[rear] = data;
        } 

        //dequeue -O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

          int result = arr[front];
          if(rear == front ){ //yadi ek hi ele tha tab dono 0 per the
            rear = front = -1;
          }else{
            front = (front + 1) % size;
          }
            return result;
        }

        //Peek O(n)
        public static int peek() {
            if(isEmpty()){
                System.out.println("empty qeue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String []args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
    
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
} 

*/


/* 
//Queue using linked list---->
//implement queue by the array 
//NORMAL QUEUE
public class QUEUECLASS {
   static class Node {
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
       static Node head = null;
       static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
     
        //enqueue -O(1)
        public static void add(int data){
         Node newNode = new Node(data);
         if(tail == null){
            tail = head = newNode;
            return;
         }
         tail.next = newNode;
         tail = newNode;
        } 

        //dequeue -O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        //Peek O(n)
        public static int peek() {
            if(isEmpty()){
                System.out.println("empty qeue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String []args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}       

*/

// import java.util.*;

// public class QUEUECLASS {
//     public static void main(String[] args) {
//        // Queue<Integer> q = new LinkedList<Integer>();
//         Queue<Integer> q = new  ArrayDeque<Integer>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         // 
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

