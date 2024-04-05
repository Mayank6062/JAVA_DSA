/* 
public class PRECTICE {

    public static void printfactorial(int n) {
        if(n < 0) {
        System.out.print("put valid num");
        }
        int fact = 1;
        for(int i = n; i>0 ; i--) {
            fact = fact * i ;
        }
        System.out.print(fact);
    }
    public static void main(String[] args) {
        printfactorial(5);
    }
    
}
*/

/* 
import java.util.Scanner;
public class PRECTICE {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("size dalo");
        int size = sc.nextInt();
        int num[] = new int[size];

        System.out.println("array dalo");
        for(int i =0 ; i<size; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("x dalo");
        int x  = sc.nextInt();

        for(int i =0; i<size; i++){
            if(num[i] == x) {
                System.out.println(i);
            }
            else {
                System.out.println("nahi h");
            }
        }
        
        
    }
}
*/
/* 
import java.util.*;
public class PRECTICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" r & c dalo");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        System.out.println("arr");
        for(int i= 0 ; i<r ; i++) {
            for(int j =0; j<c ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("now");
        for(int i= 0 ; i<r ; i++) {
            for(int j =0; j<c ; j++) {
               System.out.print(arr[i][j]);
            }
        }
        System.out.println();
    }
}
*/

/* 
class PRECTICE  {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ran");
        for(int i=0 ; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length()-i-1;

        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);

        System.out.println(sb);
    }
        
    }
} */

/* 
class PRECTICE {
    public static void print(int arr[]){
         for(int i=0 ; i<arr.length ; i++) {
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i=0 ; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[i] > arr[i+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        System.out.print(arr);
    }
}
*/

/* 
class PRECTICE  {
     public static void print(int arr[]){
         for(int i=0 ; i<arr.length ; i++) {
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
     int arr[]= {7,6,5,8,4,3,3};
     for(int i=0; i<arr.length-1; i++){
        int smallest = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
     }
     print(arr);
}
}
*/

/* 
class PRECTICE {
     public static void print(int arr[]){
         for(int i=0 ; i<arr.length ; i++) {
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr [] ={6,4,7,9,6,5,8,};
        for(int i =1 ; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;

            while( j>=0 && curr < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        print(arr);   
}
}
*/
 
/* 
class PRECTICE {
    public static void printsum(int i, int n, int sum) {
        if(i == n){
            sum +=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printsum(1, 5, 0);
    }
}
*/


/* 
class PRECTICE {
    public static int factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
       System.out.println(factorial(5));
    }
}
*/

/* 
class PRECTICE {
    public static void fignochii(int a, int b, int n) {
        if(n ==0) {
            return;
        }
        int c= a+b;
        System.out.println(c);
        fignochii(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        fignochii(a, b,n-2);
    }
}
*/

/* 
class PRECTICE {
    public static int  XpowN(int x, int n) {
        if( x==0){
            return 0;
        }
        if( n ==0 ){
            return 1;
        }
        int xpown= x * XpowN(x, n-1);
        return xpown;
    }
    public static void main(String[] args) {
        System.out.println(XpowN(2,5));
    }

}
*/

/* 
class PRECTICE {
    public static int XpowN(int x, int n) {
          if(x==0){
            return 0;
        }
        if(n ==0 ){
            return 1;
        }

        if(n%2 ==0) {
            return XpowN(x,n/2) * XpowN(x,n/2);

        }
        else {
             return XpowN(x,n/2) * XpowN(x,n/2) * x;
        }
       
    }
}*/

/* 
class PRECTICE {
    public static void Tower( String s, String h, String d, int n) {
        if( n==1 ){
            System.out.println("disk go from source to destination");
            return ;
        }

        Tower(s, d, h, n-1);
        System.out.print("1 tower skv");
        Tower(h,s, d, n-1);
    }
    public static void main(String[] args) {
         Tower("s","h","d",3);
    }
}
*/

/* 
class PRECTICE {
    public static void printRev(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "lode";
        printRev(str, str.length()-1);
    }
}
*/

/* 
class PRECTICE {
    public static int first =-1;
    public static int last =-1;
    public static void FLoccurence(String str, int idx, char ele) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == ele) {
            if(first == -1) {
                first = idx; 
            }
            else {
                last = idx;
            }
        }
        FLoccurence(str, idx+1, ele);
    }
    public static void main(String[] args) {
        String str = "abaacdae";
        FLoccurence(str, 0, 'a');
    }
}
*/

/* 
class PRECTICE {
    public static boolean increaseArray(int arr[], int n, int idx) {
       if(idx == n) {
        return true;
       }

       if(arr[idx] < arr[idx+1]) {
        return increaseArray(arr, n, idx+1);
       }
       else{
        return false;
       }
     }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9};
        int n = arr.length;
        increaseArray(arr, n, 0);
    }
}
*/

/* 
class PRECTICE {
    public static void moveAllx(String str, int idx, int count, String newString) {
        if(idx == str.length()){
            for(int i=0; i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return ;
        }
       char curr = str.charAt(idx);
       if(curr == 'x') {
        count++;
        moveAllx(str, idx+1, count, newString);
       }
       else {
        newString += curr;
        moveAllx(str, idx+1, count, newString);
       }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllx(str, 0, 0," ");
    }
}
*/
/* 
class PRECTICE {
    public static boolean  map[] = new boolean[26];
    public static void removeduplicate(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
        }
        char curr = str.charAt(idx);
        if(map[curr - 'a'] == true) {
            removeduplicate(str, idx+1, newString);
        }
        else {
            newString += curr ;
            map[curr -'a'] = true ;
            removeduplicate(str, idx+1, newString);
        }
    }
}
*/

/* 
class PRECTICE {
    public static void subseq(String str, int idx , String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
        }
        char curr = str.charAt(idx);
        subseq(str, idx+1, newString+curr);
        subseq(str, idx+1, newString);
    }
}
 */

 /* 
import java.util.HashSet;

class PRECTICE {
    public static void uniquesubseq(String str, int idx, String newString, HashSet<String>set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return ;
            }
         }

    }
 }*/

 /* 
 class PRECTICE {
    public static String[] keypad = {".","abc","def","ghi","jkl","mnop","qrs","tu","vwx","yz"};
    public static void printcomb(String str, int idx, String com) {
        char curr = str.charAt(idx);
        String mapping = keypad[curr -'0'];
        for(int i=0; i<mapping.length(); i++) {
            printcomb(str, idx+1, com+mapping.charAt(i));
        }
    }

 }
 */

 /* 
 class PRECTICE {
    public static void permutation(String str, String per) {
        if(str.length() == 0) {
            System.out.println(per);
            return;
        }
        for(int i=0 ; i<str.length(); i++) {
            char curr = str.charAt(i);
            String newstring = str.substring(0,i) + str.substring(i+1);
            permutation(newstring, per+curr);
        }
    }
 }
*/

/* 
class PRECTICE {
    public static int countpath(int i, int j, int n, int m) {
        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 || j ==m-1) {
            return 1;
        }
        return countpath(i+1, j, n, m) + countpath(i, j+1, n, m);
    }
}
*/

/* 
class PRECTICE {
    public static int placeTiles (int n, int m ) {
        if(n == m){
            return 2;
        }
        if(n < m) {
            return 1;
        }
        return placeTiles(n-m, m) + placeTiles(n-1, m);
    }
}*/

/* 
class PRECTICE {
    public static int callGuests(int n) {
        if(n==1 || n==2) {
            return n;
        }
        return callGuests(n-1) + ((n-1) * callGuests(n-2));
    }
}  */


/* 
import java.util.ArrayList;
class PRECTICE {
    public static void printsub(ArrayList<Integer>subset) {
        for(int i=0; i<subset.size(); i++){
            System.out.println(subset.get(i));
        }
        public static void findsubset(int n , ArrayList<Integer>subset){
            if( n == 0) {
                printsub(subset);
                return;
            }
            subset.add(n);
            findsubset(n-1, subset);

            subset.remove(subset.size()-1);
              findsubset(n-1, subset);
        
        }
    }
}
*/

/* 
import java.util.*;
class PRECTICE {
    public static boolean issafe(int row, int col, char [][]board) {
        //horizontally
        for(int j =0 ; j<board.length; j++){
            if(board[row][j] == 'Q') {
                return false;
            }
        }
        //vertically 
        for(int i=0 ; i<board.length;i++){
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //upper left 
        int r =row;
        for(int c = col; c>=0 && r>=0 ; c--,r--) {
             if(board[r][c] == 'Q') {
                return false;
            }
        }
        //

    }
    public static void helper(List<List<String>> allBoards, char[][]board, int col) {
        if(col == board.length) {
            saveboard(allBoards , board);
            return ;
        }
         for( int row =0; row<board.length; row++ ) {
            if(issafe(row, col, board)) {
                board[row][col] ='Q';
                helper(allBoards, board, col+1);
                board[row][col] = '.';
            }
         }
    }
    public List<List<String>>SolveNQueen(int n)  {
        List<List<String>>allBoards = new ArrayList<>();

        char [][] board = new char[n][n];
        helper(allBoards, board, 0);
        return allBoards;
    }
}
*/

/* 
class PRECTICE {
    public boolean issafe (char [][]board, int row, int col, int num) {
        for(int i =0; i<board.length; i++) {
            if(board[i][col] == (char)(num-'0')) {
                return false;
            }
        }
        for(int j =0; j<board.length; j++) {
            if(board[row][j] == (char)(num-'0')) {
                return false;
            }
        }
        int sr = (row * 3) /3;
        int sc = (col *3 ) /3;

        for(int i = sr ; i<sr +3; i++) {
            for(int j = sc ; j<sc+3 ; j++)  {
                if(board[i][j] == (char)(num - '0')) {
                    return false;
                }
            }
        }
        return true;

    }
    public boolean helper(char [][]board, int row , int col) {
        if(row == board.length) {
            return true;
        }
        int ncol = 0; int nrow = 0;
        if(col != board.length-1) {
            nrow = row;
            ncol =col + 1;
        }
        else {
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            }
        }
        else {
            for(int i=1; i<9 ; i++) {
                if(issafe(board, row, col ,i)) {
                    board[row][col] =(char)(i-'0');
                   if(helper(board, nrow, ncol) ) {
                    return true;
                   }
                   else {
                    board[row][col] ='.';
                    return false;
                   }
                }
            }
        }
    }
    public static void solvesoduku(char [][]board) {
        helper(board, 0 , 0);

    }
}
*/

/* 
class PRECTICE {
    public static void conquer(int arr[], int st, int en, int mid) {
        int idx1 = st ;
        int idx2 = mid + 1;
        int x =0;
        int merged[] = new int[en - st + 1];

        while(idx1 <= mid&& idx2 <= en) {
            if(arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 < mid) {
            merged[x++] = arr[idx1++];

        }  
        while(idx2 < en) {
            merged[x++] = arr[idx2++];
            
        }

    }
    public static void divide(int arr[], int st, int en) {
        if(st >= en) {
            return;
        }
        int mid = st + (en - st) / 2;

        divide(arr, st, mid);
        divide(arr , mid + 1, en);
        conquer(arr, st, en , mid);
        

    }
}
*/

/* 
class PRECTICE {
    public static int  partition(int arr[], int low, int high) {
        int i = low -1;
        int pivot = arr[high];

        for(int j=0 ; j<high; j++) { 
            if(arr[j] < high) {
                i++;
            }
            int temp = arr[i];
            arr[i] = pivot;
            pivot = temp;
        }
        return i;
    }
    public static void quicksort(int arr[], int low, int high){
        if(low < high) {
            int pidx = partition(arr,low,high);
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);

        }
    } 
}
*/

/* 
class PRECTICE {
    Node head ;
    private int size ;
    PRECTICE () {
        this.size = 0;
    }
     class Node {
        String data;
        Node next ;
         Node (String data) {
            this.data = data;
            this.next = null;
            size++;
         }
     }
     //addfirst
     public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     
     //addlast
     public void addLast(String data) {
        Node newNode = new Node(data);
         if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
     }
     //print 
     public void print() {
        if(head == null) {
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
     }

     //delete first
     public void deleteFirst() {
        if(head == null) {
            return;
        }
        size--;
        head = head.next;
     }

     //delete last
     public void deleteLast(){
        if(head == null){
            System.out.println("mahima namak randii abhi gaurav se chud rhi h");
            return ;
        } 
        size --;
        if(head.next != null) {
            head = null;
            return ;
        }
        Node secondLast = head;
        Node firstLast = head.next;

        while(firstLast.next != null) {
            firstLast = firstLast.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
     }

     public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr.next != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr =  next;
        }
        head.next = null;
        head = prev;
     }

     public Node reverseRecusively(Node head) {
          if(head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecusively(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
     }
}
*/

/* 
class PRECTICE {
    Node head;

    class Node {
        String data;
        Node next;
         
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

   public Node deleteN (Node head, int n) {
    if(head.next == null) {
        return null;
    }

    int size = 0;
    Node curr = head;
    while(curr != null) {
        curr = curr.next;
        size++;
    }
    if( n == size) {
        return head.next;
    }
    int indexToSearch = size - n;
    Node prev = head;
    int i = 1;
    while( i != indexToSearch) {
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return head;
    }
    
}
*/

/* 
class PRECTICE {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data ;
            this.next = null;
        }
    }
    public Node findMiddle(Node head) {
        Node hear = head;
        Node turttle = head ;
        while(hear.next != null && hear.next.next != null) {
            hear = hear.next.next;
            turttle = turttle.next;
        }
        return turttle;
    }
    public Node reverse(Node head) {
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }
        Node middle = findMiddle(head);
        Node secoundhalfstart = reverse(middle.next);   
        
        Node firsthalfStart = head ;
        while(secoundhalfstart != null) {
            if(firsthalfStart.data != secoundhalfstart.data) {
                return false;
            }
            firsthalfStart = firsthalfStart.next;
            secoundhalfstart = secoundhalfstart.next;
        }
        return true;

    }
}
*/

/* 
class PRECTICE {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean hasCycle(Node head) {
        if(head == null) {
            return false;
        }
        Node hear = head;
        Node tur = head;

        while(head.next != null && head.next.next != null) {
            hear = hear.next.next;
            tur = tur.next;
        }
        if(hear == tur) {
            return true;
        }
        return false;
    }

}
*/

/* 
class PRECTICE {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head;

        public static boolean isEmpty() {
            if(head == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("empty");
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
}
*/

/* 
import java.util.ArrayList;

class PRECTICE {
    static class stack {
        static ArrayList<Integer>list = new ArrayList<>();

        public static boolean isEmpty(){
            if(list.size() == 0) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }

        public static int peek(){
            if(isEmpty()) {
                return -1;
            }
             int top = list.get(list.size()-1);
             return top; 
        }
    }
} */

/* 
import java.util.*;
public class PRECTICE {
    public static void pushAtBottom(int data, Stack<Integer>s){
        if(s.isEmpty()) {
            s.push(data);
            return ;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);
    }
}
*/

/* 
class PRECTICE {
    static class  Queue {
        static int arr[];
        static int size;
        static int rear = -1;
         
        Queue(int n) {
            this .size = n;
            arr = new int[n];
        }
    
    public static boolean isEmpty() {
        if(rear == -1) {
            return true;
        }
        return false;
    }

    public static void enqueue(int data) {
        if(rear == size-1) {
            System.out.print("size is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public static int dequeue() {
        if(isEmpty()) {
            System.out.println("kali");
            return -1;
        }
        int front = arr[0];
       for(int i=0; i<rear;i++) {
        arr[i] = arr[i+1];
       }
       rear--;
       return front;
    }
    public static int peek() {
         if(isEmpty()) {
            System.out.println("kali");
            return -1;
        }
        return arr[0];
    }

}
}
*/

/* 
class PRECTICE {
    static class circularqueue {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        circularqueue(int n) {
            this.size = n;
            arr = new int[n];
        }

        public static boolean isEmpty() {
            if(front == -1 && rear == -1) {
                return true;
            }
            else {
                return false;
            }
        }

        public static boolean isFull(){
            return (rear+ 1) %size == front;
        }

        public static void enqueue(int data) {
            if(isFull()) {
                System.out.println("fill");
                return;
            }
            if(front == -1) {
                front = 0;
            }

            rear= (rear+1)% size;
            arr[rear] = data;
        }

        public static int dequeue(){
            if(isEmpty()) {
                System.out.println("mahiam gurav se chud rhi h");
                return -1;
            }
            
            int result  = arr[front];
            if(front == rear) {
                front = rear =-1;
            }
            else{
                front = (front+1) %size;
            } 
            return result;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }
}
*/

/* 
class PRECTICE {
     class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class queue{
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return (head==null && tail == null);
    }

    public static void enqueue(int data){
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int dequeu() {
        if(isEmpty()){
            return -1;
        }
        if(head == tail) {
            head = tail = null;
        }
        int front  = head.data;
        head = head.next;
         return front;
    }
    public static int peek() {
        if(isEmpty()){
            return -1;
        }
        raturn head.data;

    }

    }
}*/

/* 
import java.util.Stack;
class PRECTICE {
    static class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            if(s1.size() == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        public static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }
}
*/

/* 
import java.util.*;
public class PRECTICE {
    static class Node {
        int data; 
        Node left ;
        Node right ; 

        Node(int data) {
            this.data = data;
            this.left = null ;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void levelOrder(Node root) {
        if(root == null) {
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else{
                System.out.println(curr.data+" ");
                if(curr.left !=null){
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }   
     }


     public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        return countOfNodes(root.left) + countOfNodes(root.right) +1 ;
     }


     public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data ;
     }


     public static int Height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int totally = Math.max(leftHeight , rightHeight) + 1;
        return totally;
     }

     public static int Deameter(Node root) {
        if(root == null) {
            return 0;
        }
        int diam1 = Deameter(root.left);
        int diam2 = Deameter(root.right);
        int diam3 = Height(root.left) + Height(root.right) + 1;

        return Math.max(diam3,Math.max(diam1, diam2));
     }

     class TreeInfo {
        int ht;
        int diam ;

        TreeInfo (int ht , int diam) {
            this.ht = ht;
            this.diam = diam;
        }
     }
     public static TreeInfo diameter2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht) +1; 

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
     }
     

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public boolean isIdentical(TreeNode root, TreeNode subroot) {
            if(root == null && subroot == null) {
                return true;
            }
            if(root == null || subroot == null) {
                return false;
            }
            if(root.val == subroot.val) {
                return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
            }
            return false ; 
        }

        public boolean isSubtree(TreeNode root, TreeNode subroot){
            if(subroot == null) {
                return true;
            }
            if(root == null) {
                return false;
            }
            if(root.val == subroot.val) {
                if(isIdentical(root , subroot)){
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
     }




    public static void main(String[] args) {
        int nodes[] = {4,4,6,4,6,7,4,6,8,6};
        BinaryTree  tree = new BinaryTree();
          Node root = tree.buildTree(nodes);
          System.out.println(root);
          preorder(root);
          levelOrder(root);
    }
}
*/

/* 
import java.util.ArrayList;
class PRECTICE {
    static class Node {
        int data;
        Node left ;
        Node right ;

        Node (int data) {
            this.data = data;
        } 
    }
    public static Node insert(Node root , int val) {
        if( root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert (root.left , val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root , int key) {
        if(root == null) {
            return false;
        }
        if(root.data > key ) {
            return search(root.left, key);
        }
        else if(root.data == key){
            return true ;
        }
        else  {
            return search(root.right, key); }
    }

    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else  if(root.data < val){
            root.right = delete(root.right, val);
        }
        else {
            //case 1
          if(root.left == null && root.right == null) {
            return null ; 
          }

          if(root.left == null) {
            return root.right;
          }
          else if(root.right == null) {
            return root.left;
          }
          //cse 3
          Node IS = inorderSuccessor(root.right) ;
          root.data = IS.data;
          root.right = delete(root.right, IS.data);
        }
        return root ;
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
        root = root.left; }
          return root;
    }

public static void printinorder(Node root, int x, int y) {
    if(root == null ) {
        return ;
    }
    if(root.data >= x && root.data <= y) {
        printinorder(root.left, x, y);
        System.out.print(root.data+" ");
        printinorder(root.right, x, y);
    }
    if(root.data >= y) {
        printinorder(root.left, x, y);
    }
    else {
        printinorder(root.right, x, y);
    }
}
public static void printRoot2Leaf(Node root, ArrayList<Integer>path) {
    if(root == null) {
        return ;
    }
    path.add(root.data);
    if(root.left != null && root.right != null) {
        printPath(path);
    }
    else {
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
    }
    path.remove(path.size()-1);

}
}
*/
