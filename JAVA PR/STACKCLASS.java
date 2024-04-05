/* 
 public class STACKCLASS {
     static class Node{
         int data;
         Node next;

         Node(int data){
             this.data = data;
             this.next = null;
         }
     }
     static class Stack{
         public static Node head;

         public static boolean isEmpty(){
             if(head == null){
                 return true;
             }
             return false;
         }
        // push
         public static void push(int data){
             Node newNode = new Node(data);
             if(isEmpty()){
                 head = newNode;
                 return;
             }
             newNode.next = head ;
             head = newNode;
         }
         //pop
         public static int pop(){
             if(isEmpty()){
                 return -1;
             }
             int top = head.data;
             head = head.next;
             return top;
         }
         //peek
         public static int peek(){
             if(isEmpty()){
                 return -1;
             }
             return head.data;
         }
     }
     public static void main(String[] args) {
         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);

         while(!s.isEmpty()){
             System.out.println(s.peek());
             s.pop();
         }
     }
 }

 */


 /* 
//STACK BY ARRAYLIST
 import java.util.*;

 public class STACKCLASS{
    static class Stack {
         static ArrayList<Integer>list = new ArrayList<>();

         public static boolean isEmpty(){
             if(list.size() ==0){
                 return true;
             }
             return false;
         }
         //push
         public static void push(int data){
             list.add(data);
         }
       //  pop
         public static int pop(){
             if(isEmpty()){
                 return -1;
             }
             int top = list.get(list.size()-1);// list ke last index lka data 
             list.remove(top);
             return top;
         }
        // peek 
         public static int peek(){
             if(isEmpty()){
                 return -1;
             }
             return list.get(list.size()-1);
         }
     }

       public static void main(String[] args) {
          Stack s = new Stack();
          s.push(1);
          s.push(2);
          s.push(3);
          s.push(4);

          while(!s.isEmpty()){
              System.out.println(s.peek());
             s.pop();
          }
      }
 }
*/

 /* 

STACK IMPLEMENT BY JAVA COLPECTION FRAMEWORK--->
 import java.util.*;

 public class STACKCLASS{
     public static void main(String[] args) {
         Stack<Integer>s = new Stack<>();
          s.push(1);
          s.push(2);
          s.push(3);
          s.push(4);

          while(!s.isEmpty()){
              System.out.println(s.peek());
             s.pop();
          }
     }
 }

 */