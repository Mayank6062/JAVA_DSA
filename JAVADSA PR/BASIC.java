import java.util.*;
/* 
public  class Switch {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
        }
    }
}
*/


/* 
public  class BASIC{
    public static void main(String []args) {
        for(int i=0; i<5; i++) {
            if(i==3) {
                //break;
                continue;
            }
    System.out.println(i);
        }
    }
}
*/


/* 
import java.util.Scanner;
class BASIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2) {
            System.out.println("num is prime");
        }
        else {
            boolean isprime = true;
         //   for(int i=2 ; i<n ; i++) {
            for(int i=2 ; i<= Math.sqrt(n); i++) { //must use
                if(n % i == 0) {
                    isprime = false;
                }
            }
            if(isprime == true) {
                System.out.println("prime h");
            }
            else {
                System.err.println("not prime ");
            }
        }
    }
} 
*/


/* 
class BASIC {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n /10;
        }

    }
}
*/

/* 
import java.util.*;
class BASIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       do {
        System.out.print("enter num");
        int n = sc.nextInt();
        if(n % 10 == 0) {
            //break;//ydi num 10 ka multiple h
            continue;
        }
        System.out.println(n);
       } while(true);

    }
}*/

/* 
class BASIC {
    public static void main(String[] args) {
        int n = 7849;
        int rev = 0;
        while (n > 0 ) {
        rev = (rev * 10) + n % 10; 
        n= n/10;
        }
        System.out.print(rev); 
    }
}*/

/* 
class BASIC {
    public static void main(String[] args) {
       int sum =0;
        for(int i=0 ; i<=5 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
 }
}*/

/* 
class BASIC {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.print(b);
    }
}
*/

/* 
class BASIC {
    public static void swap(int a, int b) {
        int temp = a;
        a= b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        swap(8, 5);
    }
}*/

/* 
class BASIC { //always arg copy pass to peram not actual val
    public static void swap(int a, int b) {// ye perameter niche ke arg 
        int temp = a;//ki copy banate h that is call by val 
        a = b;//hence jo ye fun me kam ho rha h bo keval fun ke ander hi rahega 
        b = temp;//all fun in java work in cal by val
    }
    public static void main(String[] args) {
        int a =8, b =5;
        swap(8, 5);
        System.out.println(a);
        System.out.println(b);
    }
}
*/

/* 
class BASIC {
    public static int factorial(int n) {
        int fact = 1;
        for(int i= 1; i<=n ; i++) {
               fact = fact * i;
        }
        return fact;
    }
    public static int binomialCoff(int n, int r) {
        int n_fact =  factorial(n);
        int r_fact = factorial(r);
        int n_minus_r = factorial(n-r);
        int BinomialCoff = n_fact / (r_fact * n_minus_r );
        return BinomialCoff;
 
    }
    public static void main(String[] args) {
        System.out.println(binomialCoff(5,2));
    }
}
*/

/* 
class BASIC {
    public static void prime(int n) {
        boolean isprime = true;
        if(n == 2) {
            isprime =  true;
        }
       for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isprime =  false;
                }
            }
           if(isprime == true) {
            System.out.println("prime h");
           }
           else {
            System.out.println("not prime");
           }
        }
    public static void main(String[] args) {
                    prime(57);
    }
} 
*/

/* 
class BASIC {
    public static boolean prime(int n) {
        if(n == 2) {
            return true;
        }
       for(int i=2; i<= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        } 
        public static void printprime(int n) {
            for(int i = 2; i<=n ; i++) {
                if(prime(i)) {
                    System.out.print(i +" ");
                }
            }
        }
    public static void main(String[] args) {
         printprime(7);
    }
}*/

/* 
// class BASIC {
//     public static void binToDec(int binNum) {
//         int mynum = binNum; //save num jisse ba me print karba sake
//         int pow = 0;
//         int decNum = 0;
//         while(binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println(mynum +"ka decimal -->"+ decNum);
//     }
//     public static void main(String[] args) {
//         binToDec(101);
//     }
// }      
*/

/* 
// class BASIC {
//     public static void binToDec(int DecNum) {
//         int myDec = DecNum;
//         int pow = 0;
//         int binNum = 0;
//         while(DecNum > 0) {
//             int lastDigit = DecNum % 2;
//             binNum = binNum + (lastDigit * (int)Math.pow(10, pow));
//             pow++;
//             DecNum = DecNum/2;
//         }
//         System.out.println(myDec +"ka binomial  -->" + binNum);
//     }
//     public static void main(String[] args) {
//         binToDec(7);
//     }
// }      
*/

/* 
//arr alwas pass call by ref hence jo changes user fun me hoga array me
//bo main fun me bhi ref hoga
class BASIC {
    public static void update(int marks[], int nonchangeble) {
        nonochangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int nonchangebale = 5; //this val pass as h call by val hence not change.
        int marks[] ={98,98,98};
        update(marks , nonchangable);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
    }
    System.out.println(nonchangable);
}
*/

/* 
class BASIC {
    public static void largrs(int arr[]) {
     int largest = Integer.MIN_VALUE;//rep -infinity
     int smallest = Integer.MAX_VALUE;
     for(int i=0; i<arr.length; i++) {
        if(largest < arr[i]) {
            largest = arr[i];
        }
        if(smallest > arr[i]) {
            smallest = arr[i];
        }
     }
     System.out.println(smallest);
     System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[]= {4,5,3,9,2};
         largrs(arr);
    }
*/

/* 
class BASIC {
    public static int binarySearch(int arr[], int key) {
            int low = 0;
            int hight = arr.length-1;
            while(low <= hight){
            int mid = low + hight /2;
            if(arr[mid] == key) {
                 return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                hight = mid-1;
            }
        }
      return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key = 2;
        System.out.println(binarySearch(arr, key));
    }
}
*/

/* 
class BASIC {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first ++;
            last --;
        } 
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/

/* 
class BASIC {
    public static void pairsInArray(int arr[]) {
        int count =0;
        for(int i=0; i<arr.length;i++) {
            int curr = arr[i];
            for(int j=i+1; j<arr.length;j++) {
                System.out.print( "("+ curr +","+ arr[j]+")" );
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        pairsInArray(arr);
    }
}
*/

/* 
class BASIC {
    public static void Subarray(int arr[]) {
        int count =0;
        for(int i=0; i<arr.length; i++) {
            int curr = i;
            for(int j = i ; j<arr.length;j++) {
               int last =  j;
               for(int k= curr;k<=last;k++) {  
                System.out.print(arr[k] +" ");
               }
               count++;
               System.out.println();
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Subarray(arr);
    }
}
*/

/* 
class BASIC {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int curr = i;
            for(int j =i ; j<arr.length;j++) {
               int last =  j;
              // currSum =0;//ek bar chalne ke bad val change ho jayegi hence declare here = 0
               for(int k = curr;k<=last;k++) {  
             //  currSum += arr[k];
               }
                System.out.print(currSum +" ");
               if(currSum > maxSum) {
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubarraySum(arr);
    }
}
*/

/* 
class BASIC {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
    
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length;i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j =i ; j<arr.length;j++) {
               int last =  j;
               currSum = start == 0 ? prefix[last] : prefix[last] - prefix[start - 1];
             System.out.println(currSum);
               if(currSum > maxSum) {
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubarraySum(arr);
    }
}
*/

/* 
//kadans algo find max sub arr sum
class BASIC {//ydi all num negative hoge to ye alg zero as a maxsum
    //ret karegi but yaha hame smallest negative num ret karna h hence apply loop all num find smallest neg num and then ret.
    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++) {
            currSum = currSum + arr[i];
            if(currSum < 0) {
                currSum = 0 ;
            }
            maxSum = Math.max(currSum , maxSum);
        }
        System.out.println("maxsum of our subarray " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
*/

/* 
class BASIC {
    public static int trappedRianWater(int height[]) {

        int n = height.length;

        //calculate left max boundary 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary 
        int rightMax[]= new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedRianWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax Boundary , rightmaxBoundary)
          int waterLevel = Math.min(leftMax[i], rightMax[i]);

          //trappedwater = waterLevel - height[i]
          trappedRianWater += waterLevel - height[i];
        }

        return trappedRianWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRianWater(height));
    }
}
*/

/* 
class BASIC {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++) {
            if(buyPrice < prices[i]) { //profit
                int profit =  prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else { //jis din profit na mile
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}
*/

/* 
class BASIC {
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int swap = 0;
            for(int j=0; i<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                if(swap == 0) {
                    Systrm.out.println("arr is sorted");
                    return;
                }
            }
        }
        System.out.print(arr);//apply for loop print the array
    }
}
*/

/* 
class BASIC {
    public static void Selection(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp ;
        }
        System.out.println(arr); // by for loop apply print the array
    }
}
*/ 

/* 
// class BASIC {
//     public static void Insertion(int arr[]) {
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int j = i-1;
//             while (j>=0 && curr < arr[j]) {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = curr;
//         }
//     }
// }
*/


/* 
class BASIC { //inbuilt sort
    public static void main(String []args) {
        int arr[]= {5,4,1,3,2};

        //increase order me sort -->
      //  Arrays.sort(arr); 
     // Arrays.sort(arr, 0,3);

        for(int i=0;i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
*/

/* 
import java.util.Collections;
class BASIC { //inbuilt sort
    public static void main(String []args) {
        Integer arr[]= {5,4,1,3,2};

        //yadi ham yha int likhe to sort me red line appear bz
        //bz reverseOrder() fun hamesha obj per kam karta h, 
        //int ek primitive type ka tha
        //but Integer likhne se arr ab obj h Integer class ka 
       //Decreasing order me sort --->

     //Arrays.sort(arr, Collections.reverseOrder());
     Arrays.sort(arr, 0,3 ,Collections.reverseOrder());
        for(int i=0;i< arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
*/

/* 
class BASIC {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        //countingsort me kebal positive ele lete h and 0 is a positive ele.
        int count[] = new int[largest+1];//+1 bz count arr 0 index se start 
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;//count freq 
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length;i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
*/

 /* 
class BASIC {
   public static void printSprial(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while(startRow <= endRow && startCol <= endCol) {

        //top
        for(int j= startCol; j<=endCol ;j++) {
            System.out.print(matrix[startRow][j] + " ");
        }
        //right
        for(int i = startRow+1; i<endRow; i++) {
            System.out.print(matrix[i][endCol]);
        }
        //bottom
        for(int j=endCol-1;j>=startCol; j--) {
            if(startCol == endCol) {
                break;
            }
            System.out.print(matrix[endRow][j]);
        }
        //left
        for(int i = endRow-1; i>= startRow+1; i--) {
            if(startRow == endRow) {
                break;
            }
            System.out.print(matrix[i][startCol]+ " ");
        }
    }
   }   
}
*/

/* 
class BASIC {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        //o(n^2)
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
*/

/* 
class BASIC {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        //o(n)
        for(int i=0; i<matrix.length; i++) {
            //pd
            sum+=matrix[i][i];
            //sd
            if(i != matrix.length-i-1){ //for rmoving overlapping condition which occor odd matrix
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
  }
}
*/

/* 
class BASIC {
    public static boolean Sorted_arr_Ser(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("found at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
*/

/* 
class BASIC {

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) { //print all the letter of the string
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { //string are immutable
        char arr[] ={'a','b','c','d'};
        String str = "abcd"; //defind string 
        String str2 = new String("xyz"); //2nd method for defined the string.

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(name.length()); //string length

        String first = "hello";
        String last = "world";
        String full = first + " " + last; //string cancetination
        System.out.println(full); 

        System.out.println(full.charAt(0)); 

        //printLetters(full);
    }
}
*/

/* 
class BASIC {
    public static boolean palindrome(String str) {
        for(int i =0; i<str.length()/2 ; i++) {
            int n =str.length();
            
            if(str.charAt(i) != str.charAt(n-i-1)) {// != se jha not palindrome bahi se return false 
                // == me bo aage bhi chek karge 
                return false;
            }
        }
        return true;
    }
}
*/

/* 
class BASIC {
    public static float getShortestPath(String path) {
        int x = 0 , y = 0;
        for(int i=0 ; i<path.length(); i++) {
            char dir = path.charAt(i);

            if( dir == 'N') { y-- ;}
            else if(dir == 'E' ) { x++ ;}
            else if(dir == 'S') { y++ ;}
            else { x-- ;}
        }
        int X2 = x * x; //X2 = (x2 - x1)^2
        int Y2 = y * y; //Y2 = (y2 - y1)^2 

        return (float)Math.sqrt(X2 + Y2); //sqrt fun ret double me val 
        //hence convert in into the float..
    }
}
*/
/* 
class BASIC {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        

        if(s1 == s3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        //jab kisi string ko new keyword ke sath nhi banate to kisi purani string ko hi
        //point out kar rahi hoti h s1 & s2 equal h bz s2 jo h bo s1 ko hi point out kar 
        //rahi h 
        //but s3 new keyword se bahi h to s3 ek alag tony ko point kar rahi h 
        // == chek karta h ki bo dono object level per same h kya

        if(s1.equals(s3)) { //for chek that s1 and s3 ki valu equal hh kya 
            System.out.println("equal");
        }
    }
}
*/
/* 
class BASIC {
    public static String Substring(String str, int si, int ei) {
        String substring = "";
        for(int i=si; i<ei; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
       // System.out.println(str.substring(0,5)); inbulit fun for print substring in java
    }
}
*/

/* 
class BASIC {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) { //means fruit[i] val is grate that largest val
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
*/
/* 
class BASIC  {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.print(sb + " ");
    }
}
*/

/* 
class BASIC {
    public static String compress(String str) {
        String newstring ="";
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++; //index 
            }
            newstring+=str.charAt(i);
            if(count > 1) {
                newstring+= count.toString();
            }
        }
        return newstring;
    }
}
*/

/* 
public class BASIC {
    class BanckAccount {
    public String username;
    private String password;

    public void setPassord(String pwd) { //method
        password = pwd;
    }
}
    public static void main(String[] args) {
        
    BanckAccount myAcc = new BanckAccount();
    myAcc.username = "mayank soni";
    // myAcc.password ="vnd"; we can not acccess this directally
    //password we can access by only function 
    myAcc.setPassord("vnd");
    }
}

*/

/* 
public class BASIC {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "mayank";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //yha copy ho gya tha 
        // for(int i=0; i<3 ; i++) {
        //     System.out.println(s2.marks[i]); //100, 90, 80
        // }

        s2.password = "xyz"; //only s2 change not s1
        s1.marks[2] = 100; //s1 change karne per s2 bhi change jabki copy pehle ho gya tha
       for(int i=0; i<3 ; i++) {
        System.out.println(s2.marks[i]); //100, 90, 100 print when use shallow copy
        //100,90,80 print when we use deep copy

       }

        
    }
}

class Student {
   
    String name;
    int roll;
    String password;
    int marks[];

    // Student(Student s1) { //copy con //shallow copy cons
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; //yha ayyay pass call by reference
    // }

    Student(Student s1) { //Deep copy cons
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
       for(int i=0; i<marks.length; i++) {
        System.out.println(s1.marks[i]);
       }
    }



    Student() {
        marks = new int[3];
        System.out.println("normal con");
    }

    Student(String name) {
        marks = new int[3];
       this.name = name;
    }

     
    Student(int roll) {
        marks = new int[3];
       this.roll = roll;
    }
}
*/

/* 
class BASIC {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
}
*/

/* 
class BASIC {
    public static void pairsInc(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        pairsInc(n-1);
        System.out.print(n + " ");
    }
}
*/

/* 
class BASIC {
    public static boolean isSorted(int arr[], int i) {

        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }

       return isSorted(arr, i+1);
       
    }
}
*/

/* 
class BASIC {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) { //yadi key mil gayi to aage not check 
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
}
*/

/* 
class BASIC {
    public static int lastOccurence(int arr[], int key, int i) {
        int isFound = lastOccurence(arr, key, i+1); //ye bta dega ki bad me key adgit karti h ki nhi ydi karti hogi to valid index ret ni to -1
        //yadi key mil bhi gayi phir bhi aage chek for find the lastindex
        if(i == arr.length) {
            return -1;
        }

        if(isFound != -1 && arr[i] == key) {
            return i;
        }

        return isFound;
        //return -1; //also we can write
    }
}
*/

/* 
class BASIC {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x , n-1);
    }
}
*/

/* 
class BASIC {
    public static int optimizedPower(int a, int n) {

        if(n == 0) {
            return 1;
        }
        //es bale code ki TC abhi b hi o(n) hogi
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2); // n is even

        if(n % 2 !=0) {
            halfPowerSq = a * optimizedPower(a, n/2) * optimizedPower(a, n/2); // n is odd
        }
        return halfPowerSq;
    }
}
*/

/* 
class BASIC {
    public static int optimizedPower(int a, int n) {
        //O(logn)
        if(n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(a, n/2) ;
        int halfPowerSq = halfpower * halfpower;

        if(n % 2 !=0) {
            halfPowerSq = a * optimizedPower(a, n/2) * optimizedPower(a, n/2); 
        }
        return halfPowerSq;
    }
}
*/
/* 
class BASIC {
    public static int tilingProblem(int n) { //2 x n ,(flore size) , n -> length of flore

        if(n==0 || n==1 )  {
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2; //1 bar horizontal place karke dekhege + 1 bar vertical 
        
        return totWays;
    }
}
*/

/* 
class BASIC {
    //remove duplicate in a string....
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

        if(idx == str.length()) {
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx); //current char nikalna then chek ki map me h ki nhi
        if(map[currChar -'a'] == true) { //a-a=0, b-a=1, c-a=2, d-a=3 esse a->0per, b->1 per, c->3 index per .. set ho jayege

            //if true means curr char is a duplicate char 
            removeDuplicates(str, idx+1, newStr, map);
        }
        else {
            //means abhi nhi aaya h then 
            map[currChar -'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnavbfgghmdsfd";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
*/

/* 
class BASIC {
    public static int friendsPairing(int n) {
        if(n==1 || n==2) {
            return n;
        }

        //single 
        int fnm1 = friendsPairing(n-1);

        //pairing // 1 peron ko pair karne ke bad aage ke n-2 person ko pair kerna h jiske n-1 tarike h..
        int fnm2 = friendsPairing(n-2); 
        int pairWays = (n-1) * fnm2;

        int totalways = fnm1 + pairWays;
        return totalways;
    }
}
*/

/* 
class BASIC { //n -> length of string..
    public static void printBinStrings(int n, int lastplace, StringBuilder str) {

        // if(lastplace == 0) { //to bad me 0 ya 1 me kisi ko bhi betha sakta hu 
        //    // str.append("0"); //0 ko bethna means binary string me 0 ko add 
        //    printBinStrings(n-1, 0, str.append("0")); //next level ko bta diya ki last plsce per 0 h 
        //    printBinStrings(n-1, 1, str.append("1"));
        // }
        // else {
        //     printBinStrings(n-1, 0, str.append("0"));
        // }

        if( n == 0 ) {
            System.out.println(str);
            return;
        }
        //yha stringBuilder not currect out th reason is that-> 
        //me chair me 0 ko betha diya then me usi same chaie me 1 ko betha raha hu to 1,0 ke bad jakar add ho rha h 
        //to 0 ke bad jab 1 ko me bethauga to mujhe 0 ko utha bhi padega 
        printBinStrings(n-1, 0, str.append("0")); // 0 ko to har bar bethna hi h
        if(lastplace == 0) {
            printBinStrings(n-1, 1, str.append("1"));
        }
    }
}
*/

/* 
class BASIC { 
    public static void printBinStrings(int n, int lastplace, String str) {
        if( n == 0 ) {
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+="0"); //esse jo 0 add hua h bo kebal agle level ke liye add hua h means agle level ko lagega mene 0 ko agle level per betha diya h per curr level per mene nhibethaya h
        if(lastplace == 0) {
            printBinStrings(n-1, 1, str+"1");
           //esse jo 1 add hua h bo kebal agle level ke liye add hua h
        }
    }
}
*/

/* 
class BASIC {
    public static void mergeSort(int arr[], int si, int ei) {

        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si) /2 ;
        mergeSort(arr, si, mid); //left part sort
        mergeSort(arr, mid+1, ei); //right part sort
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <=mid && j <= ei ) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++; k++;
            }
            else {
                temp[k] = arr[j];
                j++; k++;
            }
        }
            while(i <= mid ) {
                temp[k++] = arr[i++];
            }

            while(j <= ei) {
                temp[k++] = arr[j++];
            }
        //copy temp to original arr
        for(k=0, i=si ; i<temp.length;k++, i++) {
            arr[i] = temp[k];
        }
    }
}
*/
 
/* 
class BASIC {
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei) {
            return; //bc
        }

        //last ele
        int pidx = partition(arr, si, ei); //ye fun mujhe pivot ka index de dega
        quickSort(arr, si, pidx-1); //left part sort
        quickSort(arr, pidx+1, ei); //right part sort

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; //last indx of my arr is my pivot
        int i = si-1; //i = -1 //to make place for ele smaller than pivot

        for(int j = si; j < ei; j++) { //pivot se choote ele sahi jagahbper dalna 
            if(arr[j] <= pivot) { //jab prob chhote hisse me divide hoga to si change hoga
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //now pivot ko bhi uski sahi position per dalna 
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot = arr[i] not working bz pivot var h mujhe to index ele per change karna h 
        arr[i] = temp; //var ke change fun me ref nhi karte bz call by bal hota h
        return i; //sahi index of i ret as a pidx
    }
}
*/
 
/* 
class BASIC { //search in sorted rotated array
    public static int search(int arr[], int tar, int si, int ei) {
        int  mid = si+ei /2;

        if(si > ei) {
            return -1;
        }
        if(arr[mid] == tar) {
            return mid;
        }
       
        if(arr[si]  <= arr[mid]) { //mid lie on the line 1
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1); //left //mid-1 bz mid per to upper hi dekh chuka hu me 
            }
            else {
                return search(arr, tar, mid+1, ei);
            }
        }

        else { //mid lie on the line 2
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }
            else {
                return search(arr, tar, si, mid-1);
            }
        }
    }
}

*/

/* 
class Basic {
    public static int  search(int arr[], int tar) {
 
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == tar) {
                System.out.println();
             return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar= 9;
       System.out.println(search(arr, tar));
    }
}
*/

/* 
class BASIC { //backtracking on the array
    public static void changeArr(int arr[], int i, int val) {
        if(i == arr.length) {
            printArr(arr); //yha se 1,2,3,4,5 print 
            return; //yhe se return then arr[i]=arr[i]-2 bali line exe 
        }
        arr[i] = val; //pehle val arr me likh jayegi then changeArr aage call..
        changeArr(arr, i+1, val+1); //esse recursion call upper jayegi 
        arr[i] = arr[i] - 2 ; //jab recursion call vapis aayegi to me arr ki val ko -2 se ghata duga.. means ye bali line execute hogi //BACKTRACKING
        //backtracking step always fun call ke bad hi likhi jati h 
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);  //batracking arr prt...
    }
}
*/


/* 
class BASIC {
    public static void findSubsets(String str, String ans, int i) { //i yha index h us current letter ka jisse me puchuga ki ans me aana h ki nhi

        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        findSubsets(str, ans+str.charAt(i), i+1); //yes char aa gya h
        findSubsets(str, ans, i+1);//no choise ab aage bale char se chosie lege

        //yadi me StringBuilder se solve karu to yes case me,me ans me char ko juga to not case me muihe 
        //ans se us char ko delete bhi karna hoga bz same hi string me changes hoge yha per
    }
}
*/



/* 
class BASIC {
    public static void findPermutation(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i); //ith char ko take then use me str se hta duga

            //"abcde" => "ab" + "de" = "abde"

            //esse str me changes hoge to loop mr str.lenght me bhi changes ho jayege to loop sahi se work nhi karega
            //str = str.substring(0, i) + str.substring(i+1); //if be take c then remove c from the string

            //hence str ki jagah me Newstr banauga 
            String NewStr = str.substring(0, i) + str.substring(i+1); 
            findPermutation(NewStr, ans+curr);
        }
    }
}
*/

/* 
class BASIC {
    public static boolean isSafe(char board[][], int row, int col) {
        //chaek vertical up direction
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') { //jis place ke liye me chek kar raha hu yadi uske upper dir me koi Q sit h to ret false
                return false;
            }
        }
        
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            } 
        }

        //diad right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] =='Q') {
                return false;
            }
        }

        return true; //then bo place safe h 
    }

    public static void nQueens(char board[][], int row) {
        if(row == board.length) {
            printBoard(board);
            return ;
        }
        
        for(int j=0; j<board.length; j++) { //loop on the column
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); //call for next row
                //jab back track hoga to mujhe upper bali Q ko hatana bhi padega kyoki ek row mw kebal ek hi Q ho sakti h 
                board[row][j] = 'x'; //backtrack me mene row se Q ko hta diya 
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------   ---------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
     }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x'; //inisalize the chess board by dot(.)
            } 
        }
        nQueens(board , 0); //0 th row se q ko betana h 
    }
}
*/

/* 
class BASIC { //count total num of ways in which we can solve N Queens problem..
    public static boolean isSafe(char board[][], int row, int col) {
        //chaek vertical up direction
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') { //jis place ke liye me chek kar raha hu yadi uske upper dir me koi Q sit h to ret false
                return false;
            }
        }
        
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            } 
        }

        //diad right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] =='Q') {
                return false;
            }
        }

        return true; //then bo place safe h 
    }

    public static void nQueens(char board[][], int row) {
        if(row == board.length) {
           // printBoard(board);
           count++;
            return ;
        }
        
        for(int j=0; j<board.length; j++) { //loop on the column
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); //call for next row
                //jab back track hoga to mujhe upper bali Q ko hatana bhi padega kyoki ek row mw kebal ek hi Q ho sakti h 
                board[row][j] = 'x'; //backtrack me mene row se Q ko hta diya 
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------   ---------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
     }
     static int count = 0;
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x'; //inisalize the chess board by dot(.)
            } 
        }
        nQueens(board , 0); //0 th row se q ko betana h 
        System.out.println("total ways to solve n queens = " + count);
    }
}
*/

/* 
class BASIC { //Chek if problem can be solved & print only 1 solu to N Queens problem.
    public static boolean isSafe(char board[][], int row, int col) {
        //chaek vertical up direction
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') { 
                return false;
            }
        }
        
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            } 
        }

        //diad right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] =='Q') {
                return false;
            }
        }

        return true; //then bo place safe h 
    }

    public static boolean nQueens(char board[][], int row) {
        if(row == board.length) {
           count++;
            return true; //sol is adgist
        }
        
        for(int j=0; j<board.length; j++) { 
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q'; //yha ek Q ko to me hi put karduga phir
              if(nQueens(board, row+1)) { //yadi n-1 Q ko place karna possible h 
                //board[row][j] = 'x';//Q ko unplace tab karvana h jab sol adgist nhi karta h orr yadi sol adgist karta h to mujhe nai place ko check nhi karna 
                return true;
              }
              board[row][j] = 'x'; //orr yadi n-1 Q ko place karbana is not possible then unplace
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------   ---------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
     }
     static int count = 0;
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x'; 
            } 
        }
        if(nQueens(board , 0)){ //yadi call true return karti h to sol is adgist
          System.out.println("Solution is possible");
          printBoard(board);
        } 
        else {
            System.out.println("solution is not possible");
        }
    }
}
*/

/* 
class BASIC {
    public static int gridWays(int i, int j, int n, int m) { //i,j->curr cell jis per me khada hu, n->rows, n->cols
        if(i == n-1 && j == m-1) { //means me last cell per hi khadahu
            return 1; //last cell se usi per jane ka 1 hi tarika h 
        }
        else if(i ==n || j== n) { //yadi me corner per h to mujhe orr recursion nhi karna means mujhe grid se bahar nhi jana h..
            return 0;
        }
        return gridWays(i+1, j, n, m) + gridWays(i, j+1, n, m);
    }
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
*/

/*
class BASIC {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //column
        for(int i=0; i<=8; i++) {
            if(sudoku[i][col] == digit)  {
                return false;
            }
        }
        //row
        for(int j=0; j<=8; j++) {
            if(sudoku[row][j] == digit)  {
                return false;
            }
        }
        //grid
        //jis cell ke liye num place karna h uske liye pehle ye dekhna hoga ki bo kis grid ke ander aata h 
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3 ; j++) {
                if(sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true; 
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case
        if(row == 9) {//means sare soduko me mene sare rows ko dekh liya h or me eske agle bali row me aa gayi hu but aagerow to h nhi 
            return true;
        } 

        //recurssion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9) { //jab me col se hi baghar jane bal hu
            nextRow = row+1;
            nextCol =0;
        }
        //ydi pehle se koi num soduko mu betha hua h to usko bina hataye mujhe kebal 0 ki jagah per bas hi 
        //apna bala num place karna h 
        if(sudoku[row][col] != 0) {
           return sudokuSolver(sudoku, nextRow, nextCol); //ye true ret karga t true ret jar dena h nhi false 
        }
        for(int digit=1; digit<=9; digit++) { //1 to 9 tak digit cell num row,col per place karna h 
            if(isSafe(sudoku, row, col, digit)) {
             sudoku[row][col] = digit;
             if(sudokuSolver(sudoku, nextRow, nextCol)) { //sol adgist
                return true;
              }
              sudoku[row][col] = 0; //if sol is not adgist else return false
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int sudoku [][] = {{}};

        if(sudokuSolver(sudoku, 0, 0)) {
            System.out.println("adgist");
            printSudoku(sudoku);
        } else {
            System.out.println("not adgist");
        }
    }
}
*/


/* 
class BASIC {
    public static void main(String[] args) {
        ArrayList<Integset = new ArrayList<>            ();
        //add o(1) esse always ele add list ke last me hoga
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);   
        System.out.println(list);

        System.out.println(list.size()); //size() yha ek method

        //print the array list
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        //kisi bhi index per directally add
        list.add(3, 11);  //O(n)
        System.out.println(list);

        //get operatjion O(1)
        int ele = list.get(2);
        System.out.println(ele);
        
        //remove operation O(n)
        list.remove(2);
        System.out.println(list);

        //Set ele at index O(n)
        list.set(2, 10); //index 2 per 10 set kar dena 
        System.err.println(list);

        //contains ele chaek that ele is adgist in the list or not
        System.out.println(list.contains(0)); //return true or false..
    }
}
*/


/* 
class BASIC {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2)); //idx1 per vo val dal do jo abhi idx 2 per h
        list.set(idx2 , temp);
    }    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.print(list);

        Collections.sort(list); //for sort the list in the assending order
        Collections.sort(list, Collections.reverseOrder()); //sort list in reverse order

        //Swap index 1 val and index 2 val
        swap(list, 1, 3);


        //o(n)
       int largest  = Integer.MIN_VALUE;
        //find maximum nu in the arraylist
        for(int i= 0; i<list.size(); i++) {
            // if(largest < list.get(i)) {
            //     largest = list.get(i);
            // }
            largest = Math.max(largest, list.get(i));
        }
        System.out.println(largest);

        //Reverse print o(n)
        for(int i = list.size()-1; i>=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
*/

/* 
class BASIC { //multidimentional arraylist ... which can store 1 or more arraylist
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
             for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " "); //pehle 1st list aayegi uske sare ele ko me print karbauga 
                //then secound list aayegi orr uske sare ele ko me print karbauga ...
             }
             System.out.println();
        }

        System.out.println(mainList);
    }
}
*/

/* 
class BASIC {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

          mainList.add(list1);
          mainList.add(list2);
          mainList.add(list3);

          list2.remove(3);
          list2.remove(2);

          System.out.println(mainList);

          for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
             for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " "); 
             }
             System.out.println();
        }
    }
}
*/

/* 
class BASIC {
    public static int storeWater(ArrayList<Integer> height) {
            int maxWater = 0; //yadi height 1 hi di ho to contsiner nhi banega hence 0 se inisalize
            for(int i=0; i<height.size(); i++) {
                for(int j=i+1; j<height.size(); j++) {
                    int ht = Math.min(height.get(i), height.get(j));
                    int width = j-i;
                    int currWater = ht * width;
                    maxWater = Math.max(currWater, maxWater);
                }
            }
            return maxWater;
        }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
*/

/* 
class BASIC { //Container Two pointer approch....
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            if(height.get(lp) < height.get(rp)) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxWater;
    }
   
}
*/

/* 
class BASIC {
    public static boolean pairSum1(ArrayList<Integer> list , int tar) {
        for(int i =0; i<list.size(); i++) { 
            for(int j =i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == tar) {
                    return true;
                }
            }
        }
        return false;
    } 
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
         int tar = 5;
         System.out.println(pairSum1(list, tar));
    }
}
*/

/* 
class BASIC { // PairSum1 by using the 2 pointer approch
     public static boolean pairSum1(ArrayList<Integer>list , int tar) {
        int lp = 0;
        int rp = list.size() - 1;
        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == tar) {
                return true;
            }
            if(list.get(lp) + list.get(rp) < tar) {
                lp++;
            }
            else {
                rp -- ;
            }
        }
        return false;
      }
}
*/

/* 
class BASIC {
    public static boolean pairSum2(ArrayList<Integer> list, int tar) {
        int bp = -1; int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; //smallest
        int rp = bp; //largest

        while (lp != rp) {
            if(list.get(lp) + list.get(rp) == tar) {
                return true;
            }

            if(list.get(lp)+ list.get(rp) < tar) {
                lp = (lp+1) % n;
            } else {
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int tar = 16;
        System.out.println(pairSum2(list, tar));
    }
}
*/


/* 
class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; //ek hi head orr ek hi tail rehne h pure program me hence 
    public static Node tail;//static typr ka bna diya mene...
    public static int size; //static soo that hamesha same size ke ander hi chnges ho rhe ho

    public void addFirst(int data) {
        //classname obj = constructor call
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++; //nya node create then size increase
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
     }

     public void print() {
        Node temp = head;
        if(head == null) {
            System.out.print("list empty h bhai mere yarr"); 
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
     }

    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data); //esko alag se likh kyki ese nhi karge to head update nhi hoga
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0;

        while(i < idx-1) { // jis index per dalna h uske ek pehle bale node ka ind
            temp = temp.next;
            i++;
        }
        //i-> idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
     }

     public int removeFirst() { 
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE; //return invalid val
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
     }

    public int removeLast() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }

     public int itrSearch(int key) { //search a key in the ll by the iterative approch
        Node temp = head;
        int i=0;

        while(temp!= null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
     }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); //obj of LinkedList class 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.print();
       // System.out.println(ll.size);

      // ll.removeFirst(); ll.print();
      // ll.removeLast(); ll.print();
      System.out.println(ll.itrSearch(3));
      System.out.println(ll.itrSearch(10));
    }
}
*/


/* 
class BASIC { //search a key in the ll by recursive approch
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    public int helper(Node head, int key) {
        if(head == null) { //jab head aage badte-badte last me pahuch jaye 
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key); //helper method head ke next me key ko khojega..

        if(idx == -1) {
            return -1; //
        }

        return idx+1;  //jab stack me call back hogi to actual index calculate..
    }
    public int recSearch(int key) { //yha kebal key pass karna per head mera change hona h
        //esliye me ek helper fun bna leta hu..
        return helper(head, key);
    }
}
*/

/* 
class BASIC { //Reverse a ll 
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    public void reverse() {
        Node prev = null;
        Node curr = tail = head; //after revere mera abhi ka head hi tail ban jayega 
        Node next;

        while(curr != null) {
            next = curr.next; //set position of the next

            curr.next = prev; //reverse the link

            prev = curr;
            curr = next;
        }
        head = prev;
    }
} 
*/

/* 
class BASIC { //Delete nth node in tha ll from the End node
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    //jo node picche se nth node hogi bahi node aage se (size-n+1)th node hoga...
    public void deleteNthfromEnd(int n) { //n-> no node num h jisko pichhe se delte karna h 
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size) { //last se head matlab suruaat se head yadi mujhe head ko hi delete karna ho
            head = head.next; //for delete head head ko head ka next bana duga..
            return;
        }
        //size-n+1 bo node h jese delete kana h to us node ke prev node tak me jauga means size-n tak

     int i = 1;
     Node prev = head;

     while(i < size-n) {
        prev = prev.next;
        i++;
     }

     prev.next = prev.next.next;
     return;
        
    }
}
*/

/* 
class LinkedList { 
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    public Node findMid(Node head) { //mid ele of the ll
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //yadi fun me pointer ke sath bahut sare changes hone ho to me use static type ka nhi banauga
    public boolean checkPalindrome() {
        if(head == null || head.next == null) { //head=null empty ll,  
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode; //secound half ko reverse ke liye
        Node next ;
         
        while(curr != null) {
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        Node right = prev; //right half ka head(end node) reverse hone ke bad
        Node left = head;

        while(left != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true; 
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.checkPalindrome()); //mera fun static type ka nhi h hence me call obj bas ki help se kar sakta hu bas..
    }
}
*/

/* 
class LinkedList {  //Detect a cycle in the ll
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    public boolean isCycle() { //find Cycle is adgist in our ll or not
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    }
}
*/

/* 
class LinkedList {  // Remove a cycle in the ll..
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    
    public static void removeCycle() { 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        slow = head;
        Node prev = null; //fast ka prev node means last node
        while(slow != fast) {
            prev = fast; 
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next = temp;
        //1->2->3->2
        removeCycle();
    }
}
*/

/* 
class BASIC {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
*/

/* 
class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 

    private Node getMid(Node head) { //private bhi kar sakte hu yadi mujhe bahar excess nhi deni to
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //midNode
    }

    private Node merge(Node head1 , Node head2) {
        Node mergedLL = new Node(-1)
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {  //always soted
            return head;
        }
        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head); //lefthead ye sorted ll ka head return karega
        Node newRight = mergeSort(rightHead); //

        return merge(newLeft, newRight); //mer fun jo bhi ye sorted ll ka head ret karega me use ret kar diuga..
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5); //5-4-3-2-1 
        ll.print();
        ll.head = ll.mergeSort(ll.head); //jo nya head aaye use bhi head me store
        ll.print();
    }
}
*/

/* 
class LinkedList { //Zig- Zag pattern of the ll
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    public static int size; 
    
    public void ZigZag() {
          //find mid 
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    } 
    Node mid = slow;

    //reverse 2nd half
    Node prev = null;
    Node curr = mid.next;
    Node next;
    mid.next = null;

    while(curr != null ) {
        next = curr.next;
        curr.next = prev;

        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL; Node nextR;

    //merge in the zigzag pattern
    while(left != null && right != null) {
        nextL = left.next;
        left.next = right;

        nextR = right.next;
        right.next = nextL;

        //updation
        left = nextL;
        right = nextR;
    }
}
   
}
*/

/* 
public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFast() {
        if(head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
   
  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);

    dll.print();
    System.out.println(dll.size);

    dll.removeFast();
  }
}
*/

/* 
public class DoubleLL { // Reverse a dUBELLY linkedlist
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null ) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
*/

/* 
class StackB { //Implementation of STACK using Arraylist
    static class Satck {
        static ArrayList<Integer> list =  new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0; //if sz = 0 then ret true else false 
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(isEmpty()) { //true
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1); //remove last ind store val
            return top;
        }

        public static int peek() {
            if(isEmpty()) { //true
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
*/

/* 
class StackB { //Implementation of STACK using LinkedList
    static class Node { //class contain structure of ll
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack { 
        static Node head = null;

        public static boolean isEmpty() {
            return head == null ;
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
 
        public static int pop(int data) {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
        }
    }
}
*/

/* 
public class StackB { //Implement stack using java colletin framework
    public static void main(String args[]) 
    {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            while(!s.isEmpty()) 
            {
                System.out.println(s.peek());
                s.pop();
            } 
    }
}
*/

/*
public class BASIC { //Push At bottom in the Stack
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]) 
    {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
         
            pushAtBottom(s , 4);

            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
    }
}
*/


/* 
public class BASIC { 
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
    
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]) 
    {
            Stack<Integer> s = new Stack<>();
            System.out.println(reverseString("abcd"+ " "));
    }
}
*/


/* 
public class BASIC {

    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
 
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
*/

/* 
public class BASIC { //stock span problem
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;//span arr me alw 0th index per 1 bz esse pehle koi span h nhi
        s.push(0); //spack me 0th index push

        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];//find curr price
            //compaire currprice stack ke baki prices se
            while (!s.isEmpty() &&  stocks[s.peek()] < currPrice) { // s.peek() se find index ans stocks[s.peek()] se us index per store vlu find..
                //mujhe khud se bda prev[high] chaiye bo milega jab mujhse chhite sabhi index stack se nikal jaye
                //prevHigh milega jab stack ka top mujhse bhi bda ho jayega..
                s.pop();
            }
            if(s.isEmpty()) { //yadi nikalte nikalte stack kali ho jaye to
                span[i] = i+1; 
            }
            else {
                int prevHigh = s.peek(); //mujhse chhote pure nikalne ke bad stack ka peek mera curr ka prev high hoga
                span[i] = i - prevHigh;
            }
            s.push(i); //puch apne index ko in the stack
        }
    }
    
    public static void main(String args[]) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for(int i=0; i<span.length; i++) {
            System.out.println(span[i]+ " ");
        }
    }
} 
*/

/* 
public class BASIC { //Next grater element right side 
    //yadi next grater left side nikalna ho to loop 0 to n
    //yadi next smallest right side then while loop condition >=
    //yadi next smallest left then loop and while >= both change
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        //backward loop kyki mujhe right side bale ele ko pehle se track karke rakhna h ..

        for(int i = arr.length-1; i>=0 ; i--) {
            //while loop/jab tak stack empty nhi ho jata ya stack se jab tak chhote ele as compired to arr[i] nhi hat jate while loop run
            //stack ke ander me ind push karuga ele ka na ki us ind per store val
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {  //s.peek se indx milega arr[indx] se us ind per store val milegi
                s.pop();
            }
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } 
            else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i); //index push not indx val
        }

        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + "    ");
        }
        System.out.println();
    }
}
*/

/* 
public class BASIC {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch =='(' || ch=='{' || ch =='[') {
                s.push(ch); 
            }
            else {
                //if we have a str that start closing brackets })]
                //means opening pehle aaya hi nhi to push bhi nhi hua mens stack is empty now
                if(s.isEmpty()) {
                    return false;
                }

                if((s.peek() =='(' && ch == ')') ||
                 (s.peek() =='{' && ch == '}') ||
                 (s.peek() =='[' && ch == ']')) {
                    s.pop();
                 }
                 else {
                    return false;
                 }
            }
        }
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    } 

    public static void main(String[] args) {
        String str = "({})[]"; 
        System.out.println(isValid(str));
    }
}
*/

/* 
public class BASIC {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //opening bracket, operator, operand

            if(ch == ')')
             {
                int count = 0;
                while(s.peek() != '(')
                {  //me yha !s.isEmpty() hta sakta hu bz string kabhi kai hogi hi nhi 
                    //bz string ek valid string h to yadi uska opening aya h to uska closing bhi aayega mera..
                    s.pop(); //yha mene operatoe or operand ko pop kiya h
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate adgist 
                              }
                else {
                    s.pop();  //yha m opening pair ko pop kiya hu
                     }
            } 
            else 
            {
                //opening 
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
*/


/* 
class BASIC { //histogra
    public static void maxArea(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        for(int i= arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
}

        //Next smaller left
        s = new Stack<>(); 
        for(int i= 0; i< arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area : width = j-i-1 = nsr[i]-nsl[i]-1 
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width ;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("max area in histogram =" + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        maxArea(arr);
    }
}
*/

/* 
public class BASIC { //Normal Queue Using Array
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear =-1;
        }

        public static boolean isEmpty() {
            return rear == -1; 
        }

        //add 
        public static void add(int data){
            if(rear == size-1) { //last index of array
                System.out.println("full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }
         
        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
             return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/* 
public class BASIC { //Circular Queue using Array
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;//normal queue me front alw arr[0] per hota h but
        // circular queue me front chang hota rehta h ...

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear =-1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front; //means ham rear ko bda rhe h per agle hi index per front betha hua h 
        }

        //add 
        public static void add(int data){
            if(isFull()) { //last index of array
                System.out.println("full");
                return;
            }
            if(front == -1) {
                front = 0; //for add 1st ele

            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
           int result = arr[front];
           if(rear == front) { //yadi ek hi ele h
            rear = front = -1;
           }
           else {
            front = (front + 1) % size;
           }
           return result;
        }
         
        //peeek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
             return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);


        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/* 
public class BASIC { //Normal Queue using LinkedList
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //add 
        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
             head = tail = newNode;   
             return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            if(tail == head) { //single ele
                tail = head = null;
            }
            else {
                head = head.next;
            }
            return front;
        }
         
        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
             return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/* 
public class QueueB {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }        
    }
}
*/

/* 
public class QueueB { //Queue using the 2 stack..
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty(); //yadi s1 empty h to phir puri queue hi khali h kyoki ele add hona s1 se hi shuru hoga..
        }

        //s2 me permanent ele store hi nhi kar rhe h to s2 ko dekhne ki jarurat hi nhi h..

        //add 
        public static void add(int data) {

            while(!s1.isEmpty()) { //st 1
                s2.push(s1.pop());
            }

            s1.push(data); //st 2

            while(!s2.isEmpty()) { //st 3
                s1.push(s2.pop());
            }
        }

        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();

        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            Sysyem.out.println(q.peek());
            q.remove();
        }

    }
}
*/

/* 
public class BASIC { //Stack by using 2 queues..
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() &&  q2.isEmpty(); //both chek bz hame nhi pata peranentally kiske ander ele h 
        }

        public static void push(int data) {
            //jo bhi queue non empty h usme add karna h hamesha..
            if(!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("empty");
            }
            int top = -1;

            //case 1 jisme q1 me sare ele h
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove(); //jab queue empty ho jayega to usme last ele hoga jo top me store hoga
                    if(q1.isEmpty()) {
                        break;
                    }
                    q2.add(top); //yadi last ele nhi h to add karege top ko q2 me 
                }
            } 
            else { //case jisme q2 me sare ele h 
                while(!q2.isEmpty()) {
                    top = q2.remove(); 
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top); 
                }
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()) {
                System.out.println("empty");
            }
            int top = -1;
            
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();   
                    q2.add(top); 
                }
            } 
            else { 
                while(!q2.isEmpty()) {
                    top = q2.remove(); 
                    q1.add(top); 
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
} 
*/

/* 
public class BASIC { //first non repeating letter in the str..

    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++; //us ele ki jisko q me add kiya h freq inc

        while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) { //yadi ele q me repeted h to use remove
            q.remove();
        } 

        if(q.isEmpty()) {
            System.out.println(-1 + " ");
        }
        else {
            System.out.println(q.peek() + " ");
        }
    }
    System.out.println(str);
}

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
*/

/* 
public class BASIC { //InterLeave 2 halves of a queue(even length)
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2 ; i++) {
            firstHalf.add(q.remove());//remove fun q se ele nikalkar remove kar deta h or ret kar deta h
        }

        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    } 
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);

        while(!q.isEmpty()) {
            syso(q.remove() + " "); 
        }

    }
}
*/

/* 
public class BASIC { //Reverse of the queue..

    public static void reverse(Queue<Integer> q) {
     Stack<Integer> s = new Stack<>();

     while (!q.isEmpty()) {
        s.push(q.remove());
     }
     while (!s.isEmpty()) {
        q.add(s.pop());
     }
     System.out.print(q + " ");
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
*/

/* 
public class BASIC { //Deque usaing the java collection framework
    public static void main(String[] args) {
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        //deque.removeFirst();
       // System.out.println(deque);
       System.out.println(deque.getFirst());
       System.out.println(deque.getLast());
    }
}
*/

/* 
public class BASIC { //Implemanting stack using deque...
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
*/

/* 
public class BASIC { //Implemanting Queue using deque...
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println(s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
*/

/* 
public class BASIC { //Activity selection  (select max act at a time )
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] =  {2, 4, 6, 7, 9, 9};

        //end time ke basis per sorted (yha peghele se sort diya h)
        //sorting ke liye 2D req bz yadi me kebal end time ko sort kar du to activity ka starting time change ho jayega mera..
        
        //2D arry calum -> index, start, end and activity jistni activity hogi utini row 
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
            activities[i][0] = i; //i ko i me hi store kykoi jab 2d array sort ho jayega to original index badal jayede henace esko lene se mere original index nhi badlege..
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
 
        //lamda function //sort based on 2nd array end time ke basis per..
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity 
        maxAct = 1;
        ans.add(activities[0][0]); //index add jo ki 0th col me h 
        int lastEnd = activities[0][2] ;
        for(int i=1; i<end.length; i++) {
            if(activities[i][1] >= lastEnd) { //non overlapping activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activity =" + maxAct);

        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ ans.get(activities[i][0]));
        }
    }
}
*/


/* 
public class BASIC {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0 col -> idx , 1 col -> ratio

        for(int i=0; i<val.length; i++) {
            ratio[i][0] =i; //stor origional index that is must
            ratio[i][1] = val[i]/(double)weight[i]; //fraction part is also imp hence double me
        }
        
        //assending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //sort based on 1st index

        int capacity = w;
        int finalVal = 0;

        //mujhe decrising order me ratio chaiye hence pichhe se loop
        for(int i = ratio.length-1 ; i>=0 ; i--) {
            int idx = (int)ratio[i][0]; //sabse high ratio index
            if(capacity >= weight[idx]){
                finalVal += val[idx]; //include full item
                capacity -= weight[idx];
            }
            else { //include fraction item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalVal);
    }
}
*/

/* 
public class BASIC {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println(minDiff);
    }
}
*/

/* 
// public class BASIC {
//     public static void main(String args[]) {
//         int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//         int chainLen = 1;
//         int chainEnd = pairs[0][1]; // last selected pair end

//         for(int i=1; i<pairs.length; i++) {
//             if(pairs[i][0] > chainEnd) {
//                 chainLen++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.println("max len of chain = " + chainLen);
//     }
}
*/


/* 
public class BASIC {
    public static void main(String args[]) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        
        Arrays.sort(coins, Comparator.reverseOrder()); 
        
        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
           
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-= coins[i];
                }
            }
        }
        System.out.println(countOfCoins);     
        
        for(int i=0; i<ans.size(); i++) {
            syso(ans.get(i));
        }
    }
}
*/

/* 
public class BASIC {
    //info ko class ki obj ki form me defined
    static class Job {
        int deadline;
        int profit;
        int id; //0(A), 1(B), 2(C), 3(D) ..

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        //jobInfo defind job object ki form me
        ArrayList<Job> jobs = new ArrayList<>(); //Job type ki obj ka 

        for(int i=0; i<jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //a,b do obj ko compair karna h based on profit
       // Collections.sort(jobs, (a,b) -> a.profit-b.profit); //assending order of profit me sari obj aa jayegi
       Collections.sort(jobs, (a,b) -> b.profit-a.profit); //decending  

        ArrayList<Integer> seq  = new ArrayList<>();
        int time = 0;
        for(int i= 0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(seq.size());
         
        for(int i=0; i<seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
    }
}
*/

/* 
public class BASIC { //Chocola problem
    public static void main(String args[])  {
    int n = 4, m = 6;
    Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
    Integer costHor[] = {4, 1, 2}; //n-1

    Arrays.sort(costVer, Collections.reverseOrder());
    Arrays.sort(costHor, Collections.reverseOrder());

    int h = 0; int v = 0;
    int hp = 1; int vp = 1;
    int cost = 0;

    while(h< costHor.length && v < costVer.length) {
        if(costVer[v] < costHor[h]) { //horizontal cut is expensive so horizontal cut
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        else {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
     }
     
     while (h < costHor.length) {
        cost += (costHor[h] * vp);
        hp++;
        h++;
     }

     while (v < costVer.length) {
        cost += (costVer[v] * hp);
        vp++;
        v++;
     }

     System.out.println(cost);

    }
}
*/

/* 
public class BASIC { //Tree bulid when pree order seq is given

    static class Node {
        int data;
        Node left ;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1; 

        public static Node buildTree(int nodes[]) { //fun that ret root  
            idx++;

            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]); // root
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode; //ret root
         }

         public void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
         }

         public static void Inorder(Node root) {
            if(root == null) {
                return;
            }
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
         }

         public static void postorder(Node root) {
            if(root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
         }

         public static void levelOrder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null); //null is used for next line

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null); //taki agle level per bhi next line print ho
                    }
                }
                else {
                    System.out.print(currNode.data);
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
             } 
         }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1};
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings("static-access")
        Node root = tree.buildTree(nodes);
       // System.out.println(root.data);
       tree.preorder(root);

    }
}


/* 
public class BASIC { //Binary tree
    static class Node {
        int data;
        Node left ;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) { // Height of the tree

        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) { // Count of the tree

        if(root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        return  lc + rc + 1;
    }

    public static int sum(Node root) {
        
        if(root == null) {
            return 0;jj
        }

        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls + rs + root.data;
    }

    public static int diameterApp1(Node root) {
        if(root == null) {
            return 0;
        }
        int ld = diameterApp1(root.left);
        int rd = diameterApp1(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int selfdiameter = lh+rh+1;

        return Math.max(Math.max(ld, rd), selfdiameter);
    }

    //Caluclate diameter approch 2
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root ) {
        if(root == null) {
            return new Info(0, 0);
        } 
        Info lInfo = diameter(root.left); //left sub tree dia & ht dega
        Info rInfo = diameter(root.right);

        int diam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht+ rInfo.ht+1); 
        int ht = Math.max(lInfo.ht, rInfo.ht) +1 ; //root ke liye likhna pada
        
        return new Info(diam, ht); //ret info in the form of object
        //ye dinfo obj ret karega jisme se mujhe sirf root.diam print karbana h 
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(count(root));
        System.out.println(diameter(root).diam);

    }
}
*/

/* 
public class BASIC { //A tree is a subtree of our tree or not 
    static class Node {
        int data;
        Node left ;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node node , Node subRoot){//node bo h jiske val subRoot ke same h
        //all condition here we write non identical
        if(node == null && subRoot == null)  {
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data)  { //non-identical condition
                return false;
        }

        if(!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }

        if(root.data == subRoot.data) {
            if(isIdentical(root , subRoot)) {
                return true;
            }
        }
        //root ke left nad right me ode find if mil jaye isidentical chek if identical ret true
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {

        //tree nodes 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subtree nodes
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
} 
*/
/* 
public class BASIC { //Top View of the tree
    static class Node {
        int data;
        Node left ;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //mujhe har ek node ke liye 2 info store karbana h ek node.data and 2 is horizontal distance
    //to me ek class me ese wrap karuga 

    static class Info {
        Node node ; //over aal noe ki info
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        //Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); //hd is key and node is a val

        int min = 0; int max = 0; //min and max key ki val
        q.add(new Info(root, 0)); //add root with hd = 0 level order traversal
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr == null) {
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } 
            else{
            if(!map.containsKey(curr.hd)) { //if key not adggist in map 
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }

            for(int i=min ; i<=max ; i++) {
                System.out.print(map.get(i).data); //i is a hd that is key to key ki val print hogi
                //.node nhi kar sakta bz node ek obj h hisse address print ho jayega
            }
          }
        }
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
}
*/
/* 
public class BASIC { // Build a Binary search tree..

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){ //ye fun hamari BST ke ander ek node ko insert karega 
        //orr ret bhi ek node tyep ki val ko ret karega that is root of our tree

        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val); //insert val in left //after insert upate root.left
        }
        else {
            root.right = insert(root.right, val);
        }
        return root; //ret root with all over the changes...
    }

     public static void Inorder(Node root) {
         if(root == null) {
             return;
         }
         Inorder(root.left);
         System.out.println(root.data);
         Inorder(root.right);
      }

     public static boolean search(Node root, int key) {  //search in bst
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if( root.data > key) {
           return search(root.left, key); //jo bhi ye ans dega use ham parent ko send kar dege
        }
        else{
          return search(root.right, key);
        }
     }

    public static Node delete(Node root, int val) { //val jise delete karna h
        if(root.data < val) {
            root.right = delete(root.right, val); //delete val in rightsub jo bhi change hoga after delte use ham right subtree me update kar dege
        }
        
       else if(root.data > val) {
            root.left = delete(root.left, val); //update left pointer
        }
        else {
            //when root == val
            //case -1 //delete leaf node
            if(root.left == null && root.right == null) { //jis node per abhi me hu or yadi uske left and right donu node null h that is leaf node to es leaf node ki jagah me null ret kar duga
                return null;
            }

            //case -2 //single child
            if(root.left == null) {
                return root.right;
            }

            else if(root.right == null) {
                return root.left;
            }

            //case-3 //both childeren adgist
            Node IS = findInorderSuccessor(root.right); //inorder successor is a left most node in the right subtree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);//after delete update in the pointer
        }
        return root;
     }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
     }

     public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else  {
            printInRange(root.right, k1, k2);
        }
     }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path); //jab ham leaf node per pahuch jaye to prit the path
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1); //bracktracking //assume that left and right subtree me jitne bhi node add huye hoge bo remove bhi ho gaye hoge
        //hamare root node ka deta last index per adgist karta h 
     }

     public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("null");
     }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     static Node prev;
     public static boolean isBST(Node root) { //valid bst or not
        if(root != null) {
            if(!isBST(root.left)) {
                return false;
            }

            if(prev != null && root.data <= prev.data){
                return false;
            }
            prev = root;

            return isBST(root.right);
        }
        return true;
     }

   public static boolean isValid(Node root){
     return isBST(root);
   }

    public static boolean isValidBST(Node root, Node min, Node max) { 
        //chek if max val in left subtree < node
        //and min val in right subtree > node
        //root data always liy bet min and max
        //for each node ki ek min and max val jogi yadi node ki val us min and max ki bich h sabhi node follow that than this is valid bst
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false; 
        }
        else if(max != null && root.data >= max.data) {
            return false; 
        }
        //if both condition not ret false then chek left and right subtree
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        
       // Inorder(root);
    //    if(search(root, 1)) {
    //     System.out.println("found");
    //    } else {
    //     System.out.println("not found");
    //    }

    // root = delete(root, 1);
    // Inorder(root);

    //printInRange(root, 5, 12);
   // printRoot2Leaf(root, new ArrayList<>());
   // System.out.println(isValid(root));

   if(isValidBST(root, null, null)) {
        System.out.println("valid");
   }
  }
}
*/

/* 
public class BASIC {  //Mirror of a binary search trree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createMirror(Node root){

        if(root == null) {
            return null;
        }

        Node leftMirror = createMirror(root.left); //left subtree ka mirror 
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    //for print the overall tree
     
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = createMirror(root);
        preorder(root);
    }
}
*/

/* 
public class BASIC { //Kth Level of a Tree....
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void KLevel(Node root, int level, int k) {
        if(root == null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data + " ");
            return; //not req to go subtree
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }
 
    public static void main(String[] args) {
        //preorder traversal se each note visit and har node apna level dega yadi bo k ke barabar h to bo node data print then niche bale tree ko level+1 se call 
        //jab me kth level per pahuch gya to uske child subtree tak jane ki jarurat nhi to bhi se me return karba duga ..

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

        int k = 2;
        KLevel(root, 1, 2);
    }
}
*/

/* 
public class BASIC { // Lowest Comman ansesstor
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path) { //boolean type taki pata rhe ki n node kis sub tree me adgist karta h 
        if(root == null) {
            return false;
        }
        path.add(root);

        if(root.data == n) {
            return true; //yadi node mil gayi h to mujhe subtree tak jane ki jarurat nhi h
        }

        boolean foundLeft = getPath(root.left, n, path);//left subtree call ki path mila ya nhi
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) { //jo mera node h bo ya to mujhe left subtreee me mil gya tha ya mujhe rightsubtree me mil gya tha
            return true;
        } 

        //yadi l & r subtrr me nhi mila to root mere path ka hissa nhi ho rha hoga
        path.remove(path.size() -1); //yafi l & r dono me na mile to root ko bhi remove bz node hi nhi mila h 
        return false;
    }

    public static Node lowesrCommonAnssestor(Node root , int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();//n1 path
        ArrayList<Node> path2 = new ArrayList<>();// n2 path
        
        getPath(root, n1, path1); //fun root se n1 node tak ka path path1 me store kar ke dega
        getPath(root, n2, path2);

        int i=0;
        for( ; i < path1.size() && i < path2.size() ; i++) {
            if(path1.get(i) != path2.get(i)) {
                break; //tab tak chalega jab tak val equal ho
            }
        }
        //loop break karega ith index per jha val equal hogi to i-1 th index per val same thi to bhi mera last common anssesstor h 
        Node lca = path1.get(i-1);
        return lca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        
        int n1 = 4; int n2 = 5;
        System.out.println(lowesrCommonAnssestor(root, n1, n2).data);
    }
}

*/

/* 
public class BASIC {
//me har node per khada ho kar dekhuga ki kya es node l & r subtree me dono node adgist karti h jo node false ret karga uske ek pehle
//bala node mera lca hoga
static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public static Node lca2(Node root, int n1, int n2) {
    if(root == null) {
        return null;
    }

    if(root.data == n1 || root.data == n2) {
        return root;
    }

    //har node ke loye upper bali cond chal]egi 
    Node leftLca = lca2(root.left, n1, n2); //find lca in left subtree
    Node rightLca = lca2(root.right, n1, n2);
    
    //leftLCA = valid val ret and rightLca = null
    if(rightLca == null) {
        return leftLca; //n1 and n2 both adgist leftside
    }

    //rightLCA = valid val ret and leftLca = null
    if(leftLca == null) {
        return rightLca; //n1 and n2 both adgist rightside
    }

    //if both are not null means ek sub tree me n1 dusre me n2 adgist karta h mera
    //means me hi unka first comman anssestor hu
    return root;
}

public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7); 
    System.out.println(lca2(root, 4, 5));
   }
}
*/

/* 
public class BASIC { //minimam dis between 2 nodes
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node lca2(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }
    
        if(root.data == n1 || root.data == n2) {
            return root;
        }
    
        Node leftLca = lca2(root.left, n1, n2); 
        Node rightLca = lca2(root.right, n1, n2);
        
        if(rightLca == null) {
            return leftLca; 
        }
    
        if(leftLca == null) {
            return rightLca; 
        }
    
        return root; //ret lca of of n1 and n2
    }

    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        } else if(leftDist == -1){
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }

    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1); //lca to n1 tak ka dis
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        System.out.println(minDist(root, 4, 6));
    }
}
*/

/* 
public class BASIC { //K th Ancestor of a node..
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int KAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }
        //jab mu  val ko ret karta hu to bo val original root tak ret hoti hui jati h 
        if(root.data == n){
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1) { //jis node ko find out karna h me uska anscestor nhi hu means bo mere subtree me not adgist 
            return -1;  
           }

           int max = Math.max(leftDist, rightDist);

           if(max + 1 == k) {
            System.out.println(root.data);
           }
           return max+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
       System.out.println(KAncestor(root, 5, 2));

    }
}
*/

/* 
public class BASIC { //transform to sum treee...
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   public static int transform(Node root) {
      if(root == null) {
        return 0;
      }
 
      int leftChild = transform(root.left); //ye apna data upper ret karega
      int rightChild = transform(root.right); //ye bhi

      //root.left.data mera uupdated data h left node me and leftChild bo data h jo usne ret kiya h 
      int data = root.data;
      int newLeft = root.left == null ? 0 : root.left.data; //must for leaf node ka data nikalne ke liye
      int newRight = root.right == null ? 0 : root.right.data;

      root.data = newLeft + leftChild + newRight + rightChild;
      return data;
   }

   public static void preorder(Node root) {
    if(root == null) {
        return ;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
   }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

        transform(root);
        preorder(root);
    }
}
*/

/* 
public class BASIC { //form balanced BST from sorted array
    // sorted arr mera inorder seq hoga bst ka left subt node+ root node (mid of arr) + right subt node.. for all nodes..
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   public static void preorder(Node root) {
    if(root == null) {
        return ;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
   }

   public static Node createBST(int arr[], int st, int end) {
    if(st > end) {
        return null; 
    } 
    int mid = (st+end) / 2;
    Node root = new Node(arr[mid]);
    root.left = createBST(arr, st, mid-1);
    root.right = createBST(arr, mid+1, end);
    return root;
   }
   
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        
        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);
    }

}
*/

/* 

public class BASIC { //Convert BST to balanced bst
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
       }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
    if(root == null) {
        return;
    }
    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if(st > end) {
            return null; 
        } 
        int mid = (st+end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
       }

    public static Node balancedBST(Node root) {
        //st1 get sorted inorder serq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //st2 from sorted arr converted it into a balanced bst
        root = createBST(inorder, 0, inorder.size()-1);
        return root;

    }
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12); 

       root = balancedBST(root);
       preorder(root);
    }
}
*/

/* 
public class BASIC { //largest BST in BT
    static class  Node {
    int data;
    Node left;
    Node right;    

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

static class Info { //mujhe har ek node ke liye ye info store karna h esliye class ki form me wrap
    boolean isBST;
    int size;
    int min;
    int max;

   public Info(boolean isBST, int size, int min, int max) {
    this.isBST = isBST;
    this.size = size;
    this.min = min;
    this.max = max;
    }
}

public static int maxBST = 0; //size
public static Info largestBST(Node root) { //har ek single node apni info ko ret karega
    if(root == null) {
        return new Info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    Info leftInfo = largestBST(root.left);
    Info rightInfo = largestBST(root.right);
    int size = leftInfo.size + rightInfo.size+1;
    int min = Math.min (root.data,Math.min(leftInfo.min,rightInfo.min));
    int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

    if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
        return new Info(false, size, min, max);
    }

    if(leftInfo.isBST && rightInfo.isBST) {
        maxBST = Math.max(maxBST, size); //lsubt size and right ka + mera size 
        return new Info(true, size, min, max);
    }
    return new Info(false, size, min, max); 
}


    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70); 
        root.right.right.left= new Node(65); 
        root.right.right.right= new Node(80); 

        Info info = largestBST(root);
        System.out.println(maxBST);
    }
}
*/

/* 
public class BASIC { // Merge 2 bst.. 
    static class  Node {
    int data;
    Node left;
    Node right;    

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
     }
  }
  public static void getInorder(Node root, ArrayList<Integer>arr) {
    if(root == null) {
        return;
    }
    getInorder(root.left, arr);
    arr.add(root.data);
    getInorder(root.right, arr);
  }

  public static Node mergeBSTs(Node root1, Node root2) {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    ArrayList<Integer> finalArr = new ArrayList<>();
    getInorder(root1, arr1);
    getInorder(root2, arr2);

    //merge 
    int i=0; int j=0;
    while(i< arr1.size() && j<arr2.size()) {
        if(arr1.get(i) <= arr2.get(j)) {
            finalArr.add(arr1.get(i));
            i++;
        }
        else {
            finalArr.add(arr2.get(j));
            j++;
        }
    }

    while (i< arr1.size()) {
        finalArr.add(arr1.get(i));
        i++;
    }

    while (j< arr2.size()) {
        finalArr.add(arr1.get(j));
        j++;
    }

    //sorted aaraylist se balanced bst
    Node root = createBST(finalArr, 0, finalArr.size()-1);
    return root;
    
  }

  public static Node createBST(ArrayList<Integer> arr, int st, int end) {
    if(st > end) {
        return null;
    }
   
    int mid = (st + end)/2;

    Node root = new Node(arr.get(mid));
    root.left = createBST(arr, st, mid-1);
    root.right = createBST(arr, mid+1, end);
    return root;

  }
  public static void preorder(Node root) {
    if(root == null) {
        return ;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
   }


  public static void main(String[] args) {
    // BST - 1
    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    //BST -2
    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);

    Node root = mergeBSTs(root1, root2);
    preorder(root);
  }
}
*/


/* 
public class BASIC { //Implementation of priority queue..
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //implement priority queue in the reverse order..
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
*/

/* 
public class BASIC { // Store the object in the priority queue... 
    static class Student implements Comparable<Student>{ // jab class me hame priority defined karni ho to ham Comprable nam ke interface ko imp karte h
        // <Student> means compair karne bale h student class ke obj ko..
        //comprable interface ke ander ek fun hotah jiska nam h compareto esi fun ko student class ko bhi imp karna hoga to parent Comrable interface me ye fun h jise meri student class ko bhi imp karna h this concept is called function overriding
        String name;
        int rank;

       public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
    @Override
    public int compareTo(Student s2) { //student obj s2 ko compair karna h 
        //mujhe rank ke basis per sort karna h hence
        return this.rank - s2.rank;
    }
}
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().name+ " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
*/

/* 
public class BASIC { //Insert in Heap
    static class Heap {
        ArrayList<Integer> arr = new  ArrayList<>();

        public void add(int data) {
            //add at last index
            arr.add(data);
            
            //yha data ka ind arr.size()-1;
            int x = arr.size()-1 ; //x is a child index
            int par = (x-1)/2; //parent index

            //in min heap -> child >= parent
            while(arr.get(x) < arr.get(par)){ //for max heap >
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }


        public int peek() {
          return arr.get(0); //this is peek ele that is store in 0th index
        }

        //heapify hamare heap ka ek private fun hota h jise bahar ka koi use nhi kar pata per heap class ese call kar sakta h 
        private void heapify(int i) { //i is the indx jisko ese fix karna h 
            int left = 2*i+1; //left child
            int right = 2*i+2;//right child
            int minIdx = i; //jo meri root h bahi meri minimam val ka index h  //for max heaf convert name maxheap

            //leaf node ka left and right child adgist nhi karta to uske liye mera left and right not adgist yadi bo ham nikalege to arr.size se index par chale jayega mera ..
            // hence chek left < arr.size() 

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) { //parent > left child val  // for max heap <
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) { //parent > left child val  // for max heap <
                minIdx = right;
            }
            
            if(minIdx != i) { //yadi mene ek node remove liye per kuchh bhi nhi bigda means minIdx mera i to kuchh karne ki jaruat nhi h usme root hi minimam hoga
                //per yadi minIdx i nhi h to fix now

                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                
                heapify(minIdx); //uppar fix karne ke bad yadi niche koi node kharb ho rhi ho to use bhi fix
            }
        }

        public int remove() {
            int data = arr.get(0); //data jise delete karna h 

            //step1 -  swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //stp2 - delete last
            arr.remove(arr.size()-1);

            //hepify -> fix my heap
            heapify(0);
            return data;
        }
    

    public boolean isEmpty() {
        return arr.size() == 0;
    }
}
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
*/

/* 
public class BASIC { //Heap sort..
    public static void heapify(int arr[], int i, int size) { 
        int left = 2*i+1; 
        int right = 2*i+2;
        int maxIdx = i; 

        if(left < size && arr[left] > arr[maxIdx]) { //parent > left child val  // for max heap <
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]) { //parent > left child val  // for max heap <
            maxIdx = right;
        }
        
        if(maxIdx != i) { 

            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            
            heapify(arr, maxIdx, size); 
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length-1;
        //st1 - build max heap
        for(int i= n/2; i>= 0 ; i--) {
            heapify(arr, i, n);
        }

        //st2 - push largest at end
        for(int i= n-1; i>0 ;i--) {
            //swap(largest-first with last) //max heap me largest 0 th inx per hi hoga
            //largest ko uthana h end me push kar dena h hep ka size dec by 1
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0 , i); //i val dec by 1 har bar to heap ka size bhi dec by 1

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2, 4, 5, 3};
        heapSort(arr);
        for(int i= 0; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
*/

/* 
public class BASIC { //find K nearby cars
    static class Point implements Comparable<Point>{ //mujhe har point ko sort karna on the basis of distance ka square
        //means class ke obj ko compair karna h soo we can use comparator interface
        int x;
        int y;
        int distSq;
        int idx;
        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq; //assiending ordr me sort
        }
    }
    public static void main(String[] args) {
        int pts[][] ={{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1],distSq, i));
        }
        // print only k nearest cars
        for(int i=0; i<k ; i++){
            System.out.println(pq.remove().idx);
        }
    }
}
*/

/* 
public class BASIC { //Connect Ropes..
    public static void main(String[] args) {
        int ropes[] = {2, 3, 3, 4, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost =0;
        while (pq.size()>1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
             cost += min1+min2;
             pq.add(min1+min2);
        }
        System.out.println(cost);
    }
}
*/


/* 
public class BASIC { //weakest soldiers
    static class Row implements Comparable<Row>{
        int soldiers; // soldiers count iin each row
        int idx;
        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override 
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers) {
                return this.idx - r2.idx; // yadi soldier count same h to idex ke basis per compare 
            } else {
                return this.soldiers - r2.soldiers; //nhi to soldiers ke basis per
            } 
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<army.length; i++) {
            int count = 0;
            for(int j = 0; j<army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for(int i=0; i<k; i++) {
            System.out.println(pq.remove().idx);
        }
    }
}
*/

/* 
public class BASIC {// Sliding window maximam..
    static class Pair implements Comparable<Pair> {
        int val; //pq me mujhe num store karbana h sath hi sath mujhe uska index store karban h..
        int idx;//hence class ki form me data insert 

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) { //max heap -> jis num val high bo pehle
           // return this.val - p2.val; //assending order
            return p2.val - this.val; //dessending order 
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; //window size 
        int res[] = new int[arr.length - k + 1]; // for store ans..

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        //1 window 
        for(int i=0; i<k ; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val; //first window ka max 
        
        for(int i=k; i<arr.length; i++) { //k se bz k ke pehle tak me dal hi chuka hu na 
            while(pq.size() > 0 && pq.peek().idx <= (i-k)) { //pq ke top se un ele ko remove jo mere window se pehle adgist karte the  
                pq.remove(); //means bo ele ahi bali window me adgist nhi karta bo pehle bale window me tha an es remove bz bo abhi bali window ke liye to max ho nhi sakta na 
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val; //3-3+1 = 1 wind  //find out our window number..
        }
        for(int i=0; i<res.length;i++){
            System.out.print(res[i] +" ");
        }
    }
}
*/

/* 
public class BASIC {
    public static void main(String[] args) {
        
        //Create
        HashMap<String, Integer> hm = new HashMap<>();
        
        //insert 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //get
        // int population = hm.get("India"); //if key not adgist then return null val
        // System.out.println(population);

        // //containsKey -> t or f
        // System.out.println(hm.containsKey("India"));

        //remove
      //   System.out.println(hm.remove("India"));
      //   System.out.println(hm);

         //size 
     //    System.out.println(hm.size());

         //isEmpty
      //   System.out.println(hm.isEmpty());

         //clear
         //hm.clear(); //overall hash map khali ho jayega 

         //iterate on hashmap
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        //  for (String k : keys) {
        //     System.out.print(k +"->" + hm.get(k) + " ");
        //  }

        Set<Entry<String, Integer>> keys = hm.entrySet();
        System.out.println(keys);
    }
}
*/


/* 
public class BASIC { //implementation of hashmap
    static class HashMap<K, V> { //<K, V> hash me key, val ka type fix nhi hoto hence ham use es trahas 
        //se pass karte h jise generic kehte h .. means jab bhi es class ka obj banayea jayega usme <k,V> 2 perameter aayege kisi bhi type ke
        private class Node {
            K key;
            V value;
        
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
      }

      private int n; //total num of nodes // size
      private int N;
      private LinkedList<Node> buckets[]; // N //arry me linked list store karna hence bahi type bhi diya h 

      @SuppressWarnings("unchecked") //LinkedList[4] esko likj=hne se warning create bz java me kuchh version me batana hota h ki lll kis type ki create karna h us warning ko dabane ke liye its use 
    public HashMap() {
        this.N = 4; //bucket size
        this.buckets = new LinkedList[4];
        for(int i=0; i<4 ; i++){
            this.buckets[i] = new LinkedList<>(); //har index per jakar kali linked list ko create kar diya 
        }
      }

      private int hashFunction(K key) {
        int hc = key.hashCode(); //ye fun kisi bhi obj ya val ke liye uska hashcode ret karke dedeta h ..
        //ye nigative or positive kisi bhi prakar ka hashcode ret kar sakta h to me use positive me convert kar duga
        //mujhe bucket index 0 to 3 ke bich bas chahiye to me size ke sath modular operator ka use karuga
         return Math.abs(hc) % N;
      }

      private int SearchInLL(K key , int bi) {
        LinkedList<Node> ll = buckets[bi]; //jo bhi mera bi h keval us ll per traverse not all 
        int di =0;
        for(int i=0; i<ll.size(); i++) {
            Node node = ll.get(i);
            if(node.key == key) {
                return di;
            }
            di++;
        }
        return  -1;
      }

      private void rehash() {
        LinkedList<Node> oldBuck[] = buckets; //current data ko pehle store
        buckets = new LinkedList[N * 2]; //khali hone ke bad increase the size of bucket
        N  = 2 * N; //size ko bhi double

        for(int i = 0; i<buckets.length; i++) {
            buckets[i] = new LinkedList<>(); //khali ll se inisalize
        }
        //oldbucket se node niklkar new bucket me add now 
        for(int i=0; i<oldBuck.length; i++){
            LinkedList<Node> ll = oldBuck[i];
            for(int j=0; j<ll.size(); j++){
                Node node = ll.remove(); //old se remove
                put(node.key, node.value); //new me add
                 
            }
        }
      }
      
      public void put(K key, V value) {
        int bi = hashFunction(key); //hash fun ko me key pass karuga bo us key ka bucket index ret kar degga
        int di = SearchInLL(key, bi); //yha se us bucket me ll ke data ka  index aa jauega yadi mujhe jise serch karn tha bo miljaye to ret valid ind nhi to -1
        //yadi valid index mila to me update karuga nhi to pehle node create karuga

        if(di != -1) { //means key adgist in the ll
            Node node = buckets[bi].get(di);
            node.value = value;
        } else {
            buckets[bi].add(new Node(key, value));
            n++;
        }
        double lambda = (double)n/N;
        if(lambda > 2.0) { // for reshaing that is used whem num of nodes too more and size of arr is less then increase the size of the array
            rehash();
        }
      }

      public boolean containsKey(K key) {
        int bi = hashFunction(key); 
        int di = SearchInLL(key, bi); 

        if(di != -1) { 
            return true; //key is adgist 
        } else {
           return false;
        }
      }

      public V get(K key) {
        int bi = hashFunction(key); 
        int di = SearchInLL(key, bi); 

        if(di != -1) { 
            Node node = buckets[bi].get(di);
            return node.value ;
        } else {
            return  null;
        }
      }

      public V remove(K key) {
        int bi = hashFunction(key); 
        int di = SearchInLL(key, bi); 

        if(di != -1) {
            Node node = buckets[bi].remove(di);
            n-- ; //ek node kam ho gya 
            return node.value;
        } else {
            return null;
        }
      }

      public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0; i<buckets.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
      }

      public boolean isEmpty(){
        return n==0;
      }
      
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String string : keys) {
            System.out.println(keys);
        }
    }
}
*/

/* 
public class BASIC {
    public static void main(String[] args) {
        //in LinkedHashmap always ordered of insertion of keys are maintain while in Hashmap order of key is not maintain acc to insertion of data..
        //orederd maintain bq double ll stire in buckets..
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Us", 50);

        TreeMap<String , Integer> thm = new TreeMap<>(); //keys are arranged in sorted order
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("Us", 50);

        System.out.println(lhm);
        System.out.println(thm);
    }
}
*/

/* 
class BASIC { //Majority Element
    public static void Majority(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int n = arr.length;
        for(int i=0; i<count.length; i++) {
            if(count[i] > n/3) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2};
        Majority(arr);
    }
}
*/

/* 
public class BASIC {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            if(hm.containsKey(num)) {
                hm.put(num, hm.get(num)+1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int n = arr.length;
        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet) {
            if(hm.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
}
*/

/* 
public class BASIC {
    public static boolean isAnangram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }
      
        for(int i =0; i<s.length(); i++) {
           char ch = s.charAt(i);
        //    if(map.containsKey(ch)) {
        //        map.put(ch, map.get(ch)+1);
        //    } else {
        //        map.put(ch, 1);
        //    }
        map.put(ch, map.getOrDefault(ch, 0) +1);
        }


        for(int i=0; i<t.length();i++) {
           char ch = t.charAt(i);
           if(map.get(ch) != null) {
               if(map.get(ch) == 1) {
                   map.remove(ch);
               } else {
                map.put(ch, map.get(ch)-1);
               }
            } else {
               return false; //means t me esa char h jo s me adgist nhi karta h 
           }
        }
        return map.isEmpty();
   }
    public static void main(String[] args) {
         String s = "knee";
         String t = "knee";

         System.out.println(isAnangram(s, t));
    }
}
*/

/* 
public class BASIC { //operationon hashset
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(2));
        //set.clear();

        // if(set.contains(2)) {
        //     System.out.println("yes baby 2 h mere pass..");
        // }
        // 
        // set.remove(2);
        
        // if(set.contains(2)) {
        //     System.out.println("yes baby 2 h mere pass..");
        // }
    }
}
*/

/* 
public class BASIC { //operation of Hashset and Linkedhashset
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
        // Iterator it = cities.iterator(); //ye fun ek itrator ret karega jise it me store
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for (String st : cities) {
        //     System.out.print(st + " ");
        // }
      
    LinkedHashSet<String> lhs = new LinkedHashSet<>();  //always maintain the insertioin order 
    lhs.add("Delhi");
    lhs.add("Mumbai");
    lhs.add("Noida");
    lhs.add("Bengaluru");
    System.out.println(lhs);

    // for (String st : lhs) {
    //     System.out.print(st + " ");
    // }

    TreeSet<String> ts = new TreeSet<>();  //always maintain the insertioin order 
    ts.add("Delhi");
    ts.add("Mumbai");
    ts.add("Noida");
    ts.add("Bengaluru");
    System.out.println(ts);

}
}
*/

/* 
public class BASIC {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
      //  System.out.println(hs);
        
        // for(int i=0; i<hs.size(); i++) {
        //     count++;
        // }
        // System.out.println(count);
        System.out.println(hs.size());

    }
}
*/

/* 
public class BASIC { //union ans insertion of two arays 
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2 []= {6, 3, 9, 2, 9, 4};


        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int i=0; i< arr2.length; i++) {
            set.add(arr2[i]);
        }

     //  System.out.println(set);
    //   System.out.println(set.size());

       set.clear();
       for(int i=0; i< arr1.length; i++) {
        set.add(arr1[i]);
      }
      int count = 0;
      for(int i=0; i<arr2.length; i++){
        if(set.contains(arr2[i])) {
            System.out.print(arr2[i] + " ");
            count++;
            set.remove(arr2[i]);
        }
      }
      System.out.println(count);
    }
}
*/


/* 
public class BASIC { ///find itenary for tickets..
    public static String getStart(HashMap<String, String> tickets) { //origional map from --> to
        HashMap<String,String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
         revMap.put(tickets.get(key), key);   //to -> from 
        }

        for(String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key; //it is my starting point
            }
        }
        return null; //if stating point not adgist..
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start +" ");
        for(String key: tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
*/

/* 
public class BASIC { //subarray sum equal to k
    public static void main(String args[]){
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>(); // (sum, count)

        //sum(j) - k = sum(i);
        map.put(0, 1);//when pure arrau ka sum k ke eqal ho jaye 

        int ans = 0;
        int sum =0;
        for(int j=0; j<arr.length; j++) {
         sum += arr[j]; //sum(j)
         if(map.containsKey(sum-k)) { //sum(j) - k 
            ans += map.get(sum-k);
         }
         map.put(sum, map.getOrDefault(sum, 0)+1); //yadi pehle sse sdgist karta h to sum ka cout increase by 1 nhi to put sum with 1 count
        }
        System.out.println(ans);
    }
}
*/

/* 
public class BASIC { //Trie me insert and search 
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; //end od word

      public Node() { //yha peramerer me data aaayega hi nhi bz data me index ke through hi track kar paufga by ind mujhe pata lag jayega ki me kis char ki bat kar rha hu
            for(int i=0; i<26; i++) {
                children[i] = null;  //null se pure arrray ko inisalize..
            }
        }
    }
    
    public static Node root = new Node(); //by default root hameha khali rehata h eske pass ek araay hota jisme ki ham apne childrrn ki inf store kara sake h ..

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a'; //esse se char curr ka index aaa jayega mera jisse mujhe apne root bale array search karna h 

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); //new node create
            }
            curr = curr.children[idx]; //curr jo bhi idx aaya tha ab bo as a root work karega mera 
        }
        //jab me last node per pahuch gaya hu to curr me mere pass last node store hoga 
        curr.eow = true; //baki jagah by defalut  false hi rahega mera..
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a'; //esse se char curr ka index aaa jayega mera jisse mujhe apne root bale array search karna h 

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];  //level by level update  //jis bhi childerne kseliye ser bo meri root ho jayegi
        }
         return curr.eow == true; 
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
*/

/* 
public class BASIC { //Word break probleam 
    static class Node {
        Node children[] = new Node[26];
        boolean eow;

        public Node() {
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    
    public static void insert(String arr) {
        Node curr = root;
        for(int level = 0; level<arr.length(); level++) {
            int idx = arr.charAt(level) -'a';
            if(curr.children[idx]  == null) {
                curr.children[idx] = new Node();
             }
             curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0 ; level<key.length(); level++) {
            int idx = key.charAt(level) -'a';
            if(curr.children[idx] == null) {
                return true;
            }
            curr = curr.children[idx];
        }
        return curr.eow = true;
    }

    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true; //yadi choote hisse hote hote meri puri string first part me chali gayi h or secound part mera empty string h to bha se secound part return true 
        }
        for(int i=1; i<=key.length(); i++) { //1 sr shueru bz jo mera substring bala fun hota h 
            //substring(beg ind, last idx) //last indx not included subssting(0, i) yadi i 0 h to 0 to -1 erroe dega hence 1 se shuru
           // key.substring(0, i);
           // key.substring(i); //by defalut last tak jayega ye 

            //0 se i jise me seach karuga orr i ke aage se last tak ke liye recursive call 
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile","ice"};

        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }
        String key = "ilikesamsung"; //ess key ke liye mujhe partition karne h orr partition karne ke bad chek karna h 
        //ki jo substring form huye h bo arr me adgist or not
        System.out.println(wordBreak(key));
    }
} 
*/

/* 
public class BASIC { //find prefix
   static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int frq;

        public Node(){
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
            frq = 1; //kisi bhi naye node ki frq start with 1
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].frq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    } 

    public static void findPrefix(Node root, String ans) {
        if(root == null) {
            return;
        }
        if(root.frq == 1) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.children.length; i++){ //har root ke pure arr me traverse ki yha se kya koi prefix shuru hota h 
            if(root.children[i] != null) { //null nhi h to vaha valid valu mila rahi h 
                findPrefix(root.children[i], ans+(char)(i+'a')); //valid val mili then next level ko call next lev el ke liu=ye root hoga root ka childern 
                //yadi i ki val 0 hogi to a char ans me add 1 hogi to 1 add 
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }

        root.frq = -1; //bz first create node ki 1 h 
        findPrefix(root," ");
    }
}
*/

/* 
public class BASIC { 
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; 

      public Node() { 
            for(int i=0; i<26; i++) {
                children[i] = null;  
            }
        }
    }
    
    public static Node root = new Node(); 

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); 
            }
            curr = curr.children[idx]; 
        }
        curr.eow = true; 
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a'; 

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];  
        }
        return curr.eow == true; 
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
       System.out.println(startsWith(prefix1));
    }
}
*/

/*
public class BASIC {  //find Unique prefix
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; 

      public Node() { 
            for(int i=0; i<26; i++) {
                children[i] = null;  
            }
        }
    }
    
    public static Node root = new Node(); 

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); 
            }
            curr = curr.children[idx]; 
        }
        curr.eow = true; 
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a'; 

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];  
        }
        return curr.eow == true; 
    }

    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int cunt = 0;
        for(int i=0; i<26; i++) { // 26 tak bz 1 node ke max 26 childrewn ho sakte h 
            if(root.children[i] != null) { //yadi aage node h tabhi ham uske liye call lagayege
             cunt += countNodes(root.children[i]);
            }
        }
        return cunt + 1; //count + 1 for self node ke liye
    }
    //find all uniqe sufex then insert trie 
    //trie me sabhi words ke kebal unique prefix hote h to me cout of nodes le lu to all uniqu prefix we can find out 
    
    public static void main(String[] args) {
        String str = "ababa";

        //suffix -> insert in trie 
        for(int i=0; i<str.length(); i++) {
                String suffix = str.substring(i);
                insert(suffix);
        }
     
        System.out.println(countNodes(root));
    }
}
*/

/* 
public class BASIC {  //Longest word with all prefixes..

    //mujhe longest word find karna h jiske sabe prefix mere word me ho
    //to  es word ke liye jiske sabhi prefix word me h har ek char ke end me trie me eow = true hoga 
    //bz evry prefix mere ek word[ ka ek tring hogui
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; 

      public Node() { 
            for(int i=0; i<26; i++) {
                children[i] = null;  
            }
        }
    }
    
    public static Node root = new Node(); 

    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); 
            }
            curr = curr.children[idx]; 
        }
        curr.eow = true; 
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a'; 

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];  
        }
        return curr.eow == true; 
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0; i<26; i++) { //yadiu mujhe ans me apply chahiye to loop 25 se i>=0 tak i--
            if(root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i + 'a');  //i th index mere char ka index h usme yadi me 'a' add kar du to mera pura char aa jayega ..
                temp.append(ch);
                if(temp.length() > ans.length()){ //bz apply and apply dono string hi upper ki sabhi condition ko satisfied kar rhi h per muhe 
                    //apple lena h lexiographically to pehle mera apple temp and ans dono me aa jayega or jab me e se backtrack karke y per jauga to temp me apply and ans me apple hi hoga
                    //bz ans ko me tab update kauga jab length temp ki badi ho per apple or apply dono ki lenth same h to ans me apple hi rahega not update
                    ans = temp.toString(); //
                }
                longestWord(root.children[i], temp);//recursive call

                temp.deleteCharAt(temp.length()-1); //backtracking temp se last char ko dalete 
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
*/

/* 
public class BASIC { //Graph creating using ArrayList
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int v = 5; //num of vertices
        //int arr[] = new arr[v];
        ArrayList<Edge>[] graph = new ArrayList[v]; //null empty arraylist

        for(int i=0; i<v ; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 -> vertix
        graph[0].add(new Edge(0, 1, 5));

        //1 ->vertix
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 vertix
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3 vertix
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4 vertix
        graph[4].add(new Edge(4, 2, 2));

        //2ver neighbours
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); //src , dest, wt
            System.out.println(e.dest);
        }
    }
}
*/

/* 
public class BASIC { 
    //Breadth First Search 
    //Depth for search
    //path from src to dest
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) { //breath for search
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); //src = 0

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]) { //visit curr
                System.out.println(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) { //put neighbour in the queue of the curr
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) { //depth first search
        //visit
        System.out.println(curr);
        vis[curr] = true;

        //call the neighbour of curr
        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){ //if notcurr is visited then visit 
                dfs(graph, e.dest, vis); //recurive csll
            }
        }
    }
    
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){ //path from src to dest for Undrected graph...
        if(src == dest) {
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dist = neighbour 
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){ //yagi jis src per me hu uska dis not vid h to usko call
                return true; //yadi src ke neighbour se dist tak ka path adgist karta h to src se neighbour tak bhi path adgist karega mera
            }
        }
        return false;
    }

    static void creatreGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

          //0 -> vertix
          graph[0].add(new Edge(0, 1, 1));
          graph[0].add(new Edge(0, 2, 1));

          //1 ->vertix
          graph[1].add(new Edge(1, 0, 1));
          graph[1].add(new Edge(1, 3, 1));
  
          //2 vertix
          graph[2].add(new Edge(2, 0, 1));
          graph[2].add(new Edge(2, 4, 1));
  
          //3 vertix
          graph[3].add(new Edge(3, 1, 3));
          graph[3].add(new Edge(3, 4, 1));
          graph[3].add(new Edge(3, 5, 1));
  
          //4 vertix
          graph[4].add(new Edge(4, 2, 1));
          graph[4].add(new Edge(4, 3, 1));
          graph[4].add(new Edge(4, 5, 1));

          //5 vertix
          graph[5].add(new Edge(5, 3, 1));
          graph[5].add(new Edge(5, 4, 1));

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        creatreGraph(graph);

        //bfs(graph);
        //dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
*/

/* 
public class BASIC {  //Connected components... 
    //multiple components ko visit karna graph ke 
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]) { //pehle ek grap bfsUtil se pura visit hoga then loop ke karan se control 
                bfsUtil(graph, vis); //vapis aayega then 2nd grap visited hoga..
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) { 
        Queue<Integer> q = new LinkedList<>();
        q.add(0); 

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]) { 
                System.out.println(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) { 
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
                dfsUtil(graph,i, vis); 
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) { //depth first search
        System.out.println(curr);
        vis[curr] = true;

        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){ 
                dfsUtil(graph, e.dest, vis); 
            }
        }
    }

    static void creatreGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
          //0 -> vertix
          graph[0].add(new Edge(0, 1, 1));
          graph[0].add(new Edge(0, 2, 1));

          //1 ->vertix
          graph[1].add(new Edge(1, 0, 1));
          graph[1].add(new Edge(1, 3, 1));
  
          //2 vertix
          graph[2].add(new Edge(2, 0, 1));
          graph[2].add(new Edge(2, 4, 1));
  
          //3 vertix
          graph[3].add(new Edge(3, 1, 3));
          graph[3].add(new Edge(3, 4, 1));
          graph[3].add(new Edge(3, 5, 1));
  
          //4 vertix
          graph[4].add(new Edge(4, 2, 1));
          graph[4].add(new Edge(4, 3, 1));
          graph[4].add(new Edge(4, 5, 1));

          //5 vertix
          graph[5].add(new Edge(5, 3, 1));
          graph[5].add(new Edge(5, 4, 1));

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        creatreGraph(graph);
    }
}
*/

/* 
public class BASIC {  // cycle detect by using DFS only Undirected grap we can not use this approch with directed graph...
    static class Edge {
        int src;
        int dest;
     
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true; //cycle exist in one of the component
                } //i th node se mujhe shuruaat karni h uska parent nhi hota to uske liye -1 parent liya h  
            }
        }
        return false;
    }
    
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            //case 3 yadi mera neighbour visited nhi h 
            // if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){ //ydi after call usne true de diya to cycle adgist
            //     return true; //yadi me !visit[e.dist] && deleteCycleUtil dono ko hii ek hii if condition me rakhu to neigh visit ho jayega orr niche bal else if hamesh true ho jayega hence con do if me seprate kar duga me 
            // } 

            if(!vis[e.dest]){ //
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }

            //case 1
            else if(vis[e.dest] && e.dest != par) { //yadi mera nieighbour visited h and bo mera parent bhi nhi h ..
                return true;
            }

            //casw 2 yadi mera neighbour vidted h but but bo uska parent bhi h  to es case me we can not say that 
        }
        return false;
    }

    static void creatreGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

          graph[0].add(new Edge(0, 1));
          graph[0].add(new Edge(0, 2));
          graph[0].add(new Edge(0, 3));

          graph[1].add(new Edge(2, 0));
          graph[1].add(new Edge(2, 2));

          graph[2].add(new Edge(2, 0));
          graph[2].add(new Edge(2, 1));

          graph[3].add(new Edge(3, 0));
          graph[3].add(new Edge(3, 4));

          graph[4].add(new Edge(4, 3));

    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        creatreGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
*/

/* 
public class BASIC { //Biartite graph
    static class Edge {
        int src ;
        int dest ;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void creatreGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

          graph[0].add(new Edge(0, 1));
          graph[0].add(new Edge(0, 2));
         

          graph[1].add(new Edge(1, 0));
          graph[1].add(new Edge(1, 3));

          graph[2].add(new Edge(2, 0));
          graph[2].add(new Edge(2, 4));

          graph[3].add(new Edge(3, 1));
          graph[3].add(new Edge(3, 4));

          graph[4].add(new Edge(4, 2));
          graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge> []graph){
        int col[] = new int[graph.length]; //colorable array
        
        for(int i=0; i<col.length; i++){
            col[i] = -1; //no colour
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++){ // loop use for chek all components of grap
            if(col[i] == -1){ //yadi node ko mene color nhi diya 
                 q.add(i);
                 col[i] = 0; //yellow
                 while(!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0 ; //next node ko colour..
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]){ //neigh me pele se color h orr nigh color and curr node ka color same h 
                            return false; //not bipartited
                        }
                    }
                 }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatreGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
*/

/* 
public class BASIC { //Detected cycle in directed graph by using Dfs Approch 
    static class Edge {
        int src; 
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){ //for cheak all over the components of the graph
            if(!vis[i]){
                if(isCycleUtil(graph,i, vis, stack )){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e =graph[curr].get(i);
            if(stack[e.dest]){ // yadi neigh stack me pehle se h to cycle exist h 
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false; //stack me jab call top to bottem niche aayegi to call hat jayegi
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
*/

///////////////////////////////////////////////////////////////
/* 
public class BASIC { //Topological sort using DFS ..
    //Topological sort always -> Directed Acyclic graph me lagta h 
    //yadi koi next node mera curr node per dependent ho to pehle curren node aayega then next aaayega
   //mean dependent node bad me aayege ..
   static class Edge {
    int src; 
    int dest;

    public Edge(int src, int dest){
        this.src = src;
        this.dest = dest;
      }
   }

   public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));

    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));

   }

   public static void topSort(ArrayList<Edge>[] graph){
         Stack<Integer> s = new Stack<>();
         boolean vis[] = new boolean[graph.length];

         for(int i=0; i<graph.length; i++){
            if(!vis[i]){  //yadi mera curr node not visited h to visited ke liye calll..
                topSortUtil(graph, i, vis , s);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
   }

   public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
    vis[curr] = true;
    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
            topSortUtil(graph, e.dest, vis, s);
        }
     }
    s.push(curr);
   }

   public static void main(String[] args) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    topSort(graph);
   }
}
*/

/*
public class BASIC { //Topological sort using BFS ..
   static class Edge {
    int src; 
    int dest;

    public Edge(int src, int dest){
        this.src = src;
        this.dest = dest;
      }
   }

   public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));

    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));
   }

   public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){ //fun jo sabhi node ke liye indeg cal kar ke dega 
    //yadi indeg h to means destination ke side edge aa rha h to des ki indeg me +1 kar duga
    for(int i=0; i< graph.length; i++){
        int v = i; //yadi me v vertix per khda hu to  uske liye sar edge nikal rha hhu
        for(int j=0; j<graph[v].size(); j++){
            Edge e = graph[v].get(j); //edge v se e.dest tak pahuch rha h
            indeg[e.dest]++;
        }
    } 
 }

   public static void topSort(ArrayList<Edge>[] graph){
         Queue<Integer> q = new LinkedList<>();
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        //Queue me kebal mujhe un nodes ko add karna h jinki idneg 0 h
         for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
         }
         //bfs
         while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            } 
         }
         System.out.println();
   }

   public static void main(String[] args) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    topSort(graph);
   }
}
*/

/* 
public class BASIC { //All path src to dest for directed graph.. DFS
    static class Edge {
     int src; 
     int dest;
 
     public Edge(int src, int dest){
         this.src = src;
         this.dest = dest;
       }
    }
 
    public static void createGraph(ArrayList<Edge> graph[]){
     for(int i=0; i<graph.length; i++){
         graph[i] = new ArrayList<>();
     }
     graph[0].add(new Edge(0, 3));

     graph[2].add(new Edge(2, 3));
 
     graph[3].add(new Edge(3, 1));
 
     graph[4].add(new Edge(4, 0));
     graph[4].add(new Edge(4, 1));
 
     graph[5].add(new Edge(5, 0));
     graph[5].add(new Edge(5, 2));
    }
 
    public static void printAllPath(ArrayList<Edge> []graph, int src, int dest, String path){
        if(src == dest){
            System.out.print(path+ " " +dest + " ");//dest last me jo dest node hogi use bhi path me add karne ke liye  
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
            }
        }

    public static void main(String[] args) {
     int V = 6;
     ArrayList<Edge> graph[] = new ArrayList[V];
     createGraph(graph);
     printAllPath(graph, 5,1, "");
    }
 }

*/

/* 
public class BASIC { //Dijkstra Algoritham..use only for +wt
    static class Edge {
     int src; 
     int dest;
     int wt;

     public Edge(int src, int dest, int wt){
         this.src = src;
         this.dest = dest;
         this.wt = wt;
       }
    }
 
    public static void createGraph(ArrayList<Edge> graph[]){
     for(int i=0; i<graph.length; i++){
         graph[i] = new ArrayList<>();
     }
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));

    graph[1].add(new Edge(1, 3, 7));
    graph[1].add(new Edge(1, 2, 1));

    graph[2].add(new Edge(2, 4, 3));

    graph[3].add(new Edge(3, 5, 1));

    graph[4].add(new Edge(4, 3, 2));
    graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int n; //node
        int path; //shortest path  

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; // jo val chhoti h bo PQ pehle ret karega sorting me bo bala piar pehle aa rha hoga
        }
    }
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length]; //dist[i] = means that src se i tak ka dist..
        for(int i=0; i<graph.length; i++){
            if(i != src){  //src se src tak ka dis hota 0 
                dist[i] = Integer.MAX_VALUE; //baki nodes ko +infiniti se inisalize
            }
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));//1 pair mera src se src tak ka

        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); //jiska bhi shortest dis hoga bo meri PQ sebahar nikal ke aa jayega 
            if(!vis[curr.n]){ //yadi mer curr node not visited h 
                vis[curr.n] = true;  //curr ek pair val h mujhe to index chahiye hence curr.n liya h 
                //vis hone ke bad uske nesbes update 
                for(int i=0; i<graph[curr.n].size(); i++){ //curr.n se indedx val access 
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt; //wt is my wt from u to v

                    if(dist[u]+ wt < dist[v]){ //update dis from src to v
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     int V = 6;
     ArrayList<Edge> graph[] = new ArrayList[V];
     createGraph(graph);
     dijkstra(graph, 0);
    }
 }
*/

/* 
public class BASIC { // Bell Man Ford Algoritham....most for =and -wt both type of wt
    static class Edge {
     int src; 
     int dest;
     int wt;

     public Edge(int src, int dest, int wt){
         this.src = src;
         this.dest = dest;
         this.wt = wt;
       }
    }
 
    public static void createGraph(ArrayList<Edge> graph[]){
     for(int i=0; i<graph.length; i++){
         graph[i] = new ArrayList<>();
     }
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));

    graph[1].add(new Edge(1, 2, -4));

    graph[2].add(new Edge(2, 3, 2));

    graph[3].add(new Edge(3, 4, 4));

    graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];

        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for(int i=0; i<V-1 ; i++){
            for(int j=0; j<graph.length; j++) { //for go to all over the vertix
                for(int k=0; k<graph[j].size(); k++){ //for go to all the of the edges
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt; 

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+ wt < dist[v]){  //java me infite ke sath jab koi positive val jodte h to negstive val
                        //aati h to infinity + wt = negative val to ye condition hamesha hi negative val de degi hence 
                        //1st condition add
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
     int V = 5;
     ArrayList<Edge> graph[] = new ArrayList[V];
     createGraph(graph);
     bellmanFord(graph, 0);
    }
}
*/
 
/* 
public class BASIC { //MST -> prims algorithm
    static class Edge {
        int src; 
        int dest;
        int wt; 

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int v; //virtex
        int cost;  

        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;  //chhote cost bale pehle aayege mere 
        }
    }

    public static void prims(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0; //totall min cost of mst or tally min weight of mst...

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost +=curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest , e.wt)); //neabers add taki pata chal sake ki unka bala edge add hona h kya priority queueu me hona nhi hona pq batayegi per ham neabers ko add kar lege 
                }
            }
        }
        System.out.println(finalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}
*/

/* 
public class BASIC { //Cheapest Flights within K stops 
//mujhe yha PQ ko lene ki jarurat nhi h PQ ko me tab leta hu jab mujhe 
//dist ya cost ke basisi per sorting karni ho //but yha me stop(k) ke basis per 
//sorting kar rha hu jo ki costant +1 se bad rha h to me simple Q ka use kar sakta hu
static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

public static void createGraph(int flights[][], ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length;i++){
        graph[i] = new ArrayList<>(); 
    }

    for(int i=0; i<flights.length; i++){
        int src = flights[i][0];
        int dest = flights[i][1];
        int wt = flights[i][2];

        Edge e  = new Edge(src, dest, wt);
        //graph me hamesha src index per sare neabers ki inf store karte h 
        graph[src].add(e);
    }
}
 
  static class Info {
    int v; //vertix
    int cost;
    int stops;

    public Info(int v, int cost, int stops){
        this.v = v;
        this.cost = cost;
        this.stops = stops;
    }
  }


public static int cheapestFlight(int n, int flights[][], int src, int dist, int k){
    ArrayList<Edge> graph[] = new ArrayList[n];
    createGraph(flights, graph);

    int dest[] = new int[n];
    for(int i=0; i<n; i++) {
        if(i != src) { //src to src dis is 0 
            dest[i] = Integer.MAX_VALUE;
        }
    }

    Queue<Info> q = new LinkedList<>();
    q.add(new Info(src, 0, 0));

    while(!q.isEmpty()){
        Info curr = q.remove();
        if(curr.stops > k){
            break;
        }
        for(int i=0; i<graph[curr.v].size(); i++){
            Edge e = graph[curr.v].get(i);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;

           // if(dest[u] != Integer.MAX_VALUE && dest[u] + wt < dest[v] && curr.stops <= k){
            //dist[u] se overall updated dist aati h jabki  curr.cost se distance bo ayegi jis path ke throught me destination tak pahucha hu

            if(curr.cost + wt < dest[v] && curr.stops <= k){
                dest[v] = curr.cost + wt;
                q.add(new Info(v, dest[v], curr.stops+1)); 
            } 
        }
    }
    if(dest[dist] == Integer.MAX_VALUE){ //means me pahucha hi nhi apne dist=>destinaion tak to return -1
        return -1; //dest = array    dist = destination
    }
    else {
        return dest[dist];
    }
}

public static void main(String[] args) {
    int n = 4;
    int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2,3, 200}};
    int src =0;
    int dest = 3; int k = 1;
   System.out.println(cheapestFlight(n, flights, src, dest, k));
 }
}
*/


/* 
public class BASIC { //Connecting citis 
    static class Edge implements Comparable<Edge> { // me Adjaceny list na banakar sare ke sare edges ko store karauga edges kr liye sorces to pata hoti h ki 0th index per 0 , 1st ind per 1 src h..
        int dest;
        int cost;

        public Edge(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int connectCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(); // kis kis edge ko mene mst me add kiya
        boolean vis[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalcost = 0;

        while(!pq.isEmpty()){
            Edge curr = pq.remove();

            if(!vis[curr.dest]){ //jis bhi destination tak me pahuch rahi hu anpne curr ke through bo yadi non visited h ..
                vis[curr.dest] = true;
                finalcost += curr.cost; //curr.dest bai edge ko mene 1st time visit kiya h to eski cost ko bhi me add kar duga 

                for(int i=0; i<cities[curr.dest].length; i++){
                    if(cities[curr.dest][i] != 0){ //yadi yha bhi edge adgist karta h to
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }
}
*/

/* 
public class BASIC { //Disjoint set DS
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n]; //by default 0 hoga sab me

    public static void init() { //kisi bhi static fun ke ander ham tabhi bhar ke arry ya var use kar sakte jab bo bhi static type ke ho
        for(int i=0; i<n; i++){
            par[i]  = i; //shuru me har koi khud ka hi parent h 
        }
    }

    public static int find(int x){ //find fun  x ka leader de dega 
        if(x == par[x]){ //mean jab me khud ka hi parent ho jau
            return x;
        }
        //return  find(par[x]);
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
       else if(rank[parA] > rank[parB]){ //rank not increase because ham pehle se hi jayda rank bale me kam rank bale k jod rhe h 
            par[parB] = parA;
        }
        else { //(rank[parA] < rank[parB])
            par[parA] = parB;
        }
    }

    public static void main(String[] args) {
        init();//for inisalize the value
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
*/

/* 
public class BASIC { //Kruskal's Algorithm...
     static class Edge implements Comparable<Edge> {
        int src; 
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src =  src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
           return this.wt - e2.wt;
        }
     }

     static void createGraph(ArrayList<Edge> edges){ //adjacencynlist not crete here here we create edges ki list
        //edges..
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
     }

     static int n = 4; //num of vertixes
     static int par[] = new int[n];
     static int rank[] = new int[n]; 
 
     public static void init() { 
         for(int i=0; i<n; i++){
             par[i]  = i; 
         }
     }
 
     public static int find(int x){ 
         if(x == par[x]){
             return x;
         }
         return par[x] = find(par[x]);
     }
 
     public static void union(int a, int b){
         int parA = find(a);
         int parB = find(b);
 
         if(rank[parA] == rank[parB]){
             par[parB] = parA;
             rank[parA]++;
         }
        else if(rank[parA] > rank[parB]){
             par[parB] = parA;
         }
        else { 
             par[parA] = parB;
         }
     }

     public static void KruskalsMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges); //sort all the edges
        int mstcost = 0; //final cost of mst
        int count = 0;  //mst me abhi kitne edges mene include kiye h 

        for(int i=0; count < V-1; i++){ // yadi V ver h mere pass to v-1 edges are req to connected them .. also i<edges.length
            // i se me edges per travers kar rha hu 
            Edge e = edges.get(i); // esse se ith num bala edge mil jayega 

            int parA = find(e.src); // src = a
            int parB = find(e.dest);  //dest = b

            //yadi en parA and parB ka ek hi leader h means parA == parB equal  orr yadi dubara enka union kar de to cycle bali condition ban jati h 
            if(parA != parB){ 
                union(e.src, e.dest);
                mstcost += e.wt;
                count++;//edge include then update the count
            }
        }
        System.out.println(mstcost);
     }
     public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        KruskalsMST(edges, V);
     }
}
*/

/* 
public class BASIC { //flood fill  algorithm
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr<0 || sc<0 || sr>=image.length || sc>= image[0].length || 
            vis[sr][sc] || image[sr][sc] != orgCol){
                return;
            }
        //left
        helper(image, sr, sc-1, color, vis, orgCol);
        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //up
        helper(image, sr+1, sc, color, vis, orgCol);

        //Down
        helper(image, sr-1, sc, color, vis, orgCol);

    }
    public static void main(String[] args) {
        
    }
}
*/

/* 
public class BASIC { //find out strong connected components in directed graph
    //by Kosaraju algorithm...
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 0));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[curr]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");

        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){ 
                dfs(graph, e.dest, vis); 
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[], int V){
        
        //st 1  topological shorting by Dfs by this form a stack
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){ //sare vertix topological bale order me stack ke ander store hokar aa jayege..
                topSort(graph, i, vis, s);
            }
        }

        //st 2 -> transpose graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0; i<graph.length; i++){
            vis[i] = false; //topsort me sabhi vertix vis ho gaye yha non vis liya taki bad me use kar sake 
            transpose[i] = new ArrayList<Edge>();
        }
        //ab graph[] me loop chalayege orr transpose ke ander eski copy banayege 
        for(int i=0; i<V; i++){ //get vertix
            for(int j=0; j<graph[i].size(); j++){  //get the neabers of these virtex
                Edge e = graph[i].get(j); //e.src -> e.dest

                //now reverse these edges
                transpose[e.dest].add(new Edge(e.dest, e.src));// e.dest se edge nikal rha h orr bo e.dest se e.src tak ja rha h 
            }
        }
        
        //st 3 -> jo stack ke ander nodes the use bahar nikalna h orr us node ke adhar per transpose graph me dfs apply karna h
        // that is called reverse dfs 
        while (!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]){
                System.out.println("scc");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
*/

/* 
public class BASIC { //find out Bridge in graph
    //by using tarjanes algo
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));


        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));


        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i); //e.src --> e.dest
            int neigh = e.dest;

            if(neigh == par){
                continue;
            }
            else if(!vis[neigh]){
                dfs(graph, neigh, curr, dt, low, vis, time);
                low[curr] = Math.min(low[curr], low[neigh]);

                //Bridge condition
                if(dt[curr] < low[neigh]){
                    System.out.println("Bridge : "+ curr + "------------"+ neigh);
                }
            }
            else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for(int i=0; i<V ; i++){
            if(!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);
    }
} 
*/

/* 
public class BASIC { //Articulation Point (Tarjan's algorithm)
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));


        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));


        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time, boolean ap[]){

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int childern = 0; //for track the children

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i); //e.src --> e.dest
            int neigh = e.dest;

            if(neigh == par){
                continue; //esse me pure hi for loop ke outside pahuch jauga 
            }

            else if(vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
            }

            else {
                dfs(graph, neigh, curr, dt, low, vis, time, ap);
                low[curr] = Math.min(low[curr], low[neigh]);

                //Articulation point condition
                if(par != -1 && dt[curr] <= low[neigh]){
                   // System.out.println( curr + " ");
                   ap[curr] = true;
                }
                childern++; //jab already unvisited node hogi tab hi to ham use childern ki tarah count karege
            }
        }
          if(par == -1 && childern > 1) {
           // System.out.println( curr + " ");
           ap[curr] = true;
          }
    }
    public static void getAp(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V]; //bade graph ke liye kai bar AP multiple time print ho jate h to use track karne ke liye

        for(int i=0; i<V ; i++){ //for cepture all of the components of the graph
            if(!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time, ap);
            }
        }

        for(int i=0; i<V ; i++){ //for print all of the Articulation po
            if(ap[i]) {
                System.out.println(i + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        getAp(graph, V);
    }

}
*/

/* 
//Daynamic Programming
public class BASIC { //fignochhi num by using memoization
    //memoization -> recurssion app
    public static int fib(int n, int f[]){
        if(n == 0 || n == 1) {
            return n;
        }
        if(f[n] != 0){ // yadi bydefault 0 nhi h means bo fib num alredy cal ho chuka h 
            return f[n]; //dubara not calculate me cal val ko hi ret kar duga 
        }
        f[n] = fib(n-1, f) + fib(n-2, f); //or jis case me mujhe cal karna pad gya to cal karne ke bad assign val 
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        //by default sabhi index per 0 store hoga 
        int f[] = new int[n+1]; //fib 0 se n num tak lete h esliye n+1 use
        System.out.println(fib(n, f));
    }
}
*/

/* 
public class BASIC { //fibnachhi by tabulation approch
    //tabulation -> iteration app
    public static int fib(int n){
        int dp[] = new int[n+1];
        dp[0] = 0; dp[1] =1; //alredy calculated val se inisalized

        for(int i=2; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(5854930));

    }
}
*/

/* 
public class BASIC { //Climbing Stairs.... //By only recurssion approch
    public static int countWays(int n){
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        return countWays(n-1)+ countWays(n-2);
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(countWays(n));
    }

}
*/

/* 
public class BASIC { //Climbing Stairs.... //By only Memoization  approch
    public static int countWays(int n, int ways[]){
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }

        if(waya[n] != -1) {
            return ways[n]; //alredy calculated
        }

          ways[n] = countWays(n-1, ways)+ countWays(n-2, ways);
          return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1); //-1, -1, -1..
       System.out.println(countWays(n, ways));
    }
}
*/

/* 
public class BASIC { //Climbing Stairs.... //By only Tabulation approch
    public static int countWays(int n, int ways[]){
       ways[0] = 1; //ground se ground tak pahuchne ke tarike

       //ways[1] = 1;
        for(int i=1; i<= n; i++){
            if(i == 1){
                ways[i] = ways[i-1]; 
            } else {
                ways[i] = ways[i-1]+ways[i-2];
            }
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1];
       System.out.println(countWays(n, ways));
    }
}
*/

/* 
public class BASIC { // 0 1 knapsack by reacurssion 
    public static int knapsack(int val[], int wt[], int W, int n){ // n -> me array me kis item ki bat kar rha hu ya total num of item
        if(W == 0 || n == 0){ //capacity ya num of item khatam h 
            return 0;
        }

        if(wt[n-1] <= W) { //n = 1 to w[0] means 1st item mera 0th index per hoga 
            //when wt valid then we can include the item ya not include the item
            //include
           int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1);
            //exclude
           int ans2 =  knapsack(val, wt, W, n-1);
          //mujhe ans1 and ans2 ka maximam nikalna h ki item ko include karke maximam profit aayega ya item ko exclude karke 
          //ans2 me mene val include ni ki to mera profit badega kab  ==>  abhi to include nhi kiya per ho sakta h ki agle bale level per include ho jaye 
          return Math.max(ans1, ans2);
        } else {
            //exclude
            return knapsack(val, wt, W, n-1); //direct yahi val return karni hogi ab ese compaor karne ki jarurat nhi h 
        }
    }

    public static void main(String[] args) {
      int val[] = {15, 14, 10, 45, 30};
      int wt[] = {2, 5, 1, 3, 4};
      int W = 7;
      System.out.println(knapsack(val, wt, W, val.length));
    }
}
*/

/* 
public class BASIC { // 0 1 knapsack by momoization
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]){ 
        if(W == 0 || n == 0){ 
            return 0;
        }

        if(dp[n][W] != -1){ //yadi ans cal ho chuka h to bo 2D array me store hoga use direct bahi se ret not again calculate
            return dp[n][W];
        }

        if(wt[n-1] <= W) { 
            //include
           int ans1 = val[n-1]+knapsack(val, wt, W-wt[n-1], n-1, dp);
            //exclude
           int ans2 =  knapsack(val, wt, W, n-1, dp);
           dp[n][W] = Math.max(ans1, ans2); //pehle ans stored hogga tabhi bo agle bale level ko direct mil payega na 
           return dp[n][W];
        } 
        else {
            //exclude
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W]; 
        }
    }

    public static void main(String[] args) {
      int val[] = {15, 14, 10, 45, 30};
      int wt[] = {2, 5, 1, 3, 4};
      int W = 7;
      int dp[][] = new int[val.length+1][W+1];
      for(int i=0; i<dp.length; i++){ //inisalized with -1 ovearall dp
        for(int j=0; j<dp[0].length; j++){
            dp[i][j] = -1;
        }
      }
      System.out.println(knapsack(val, wt, W, val.length, dp));
    }
}
*/

/* 
public class BASIC { // 0 1 knapsack by tabulation
    public static int knapsack(int val[], int wt[], int W, int n){ 
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 0; //0 th coloum
          }

          for(int j=0; j<dp[0].length; j++) {
            dp[0][j] = 0; //0 th row
          }

          for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1 ; j++) {
                int v = val[i-1]; // ith item value
                int w = wt[i-1]; // ith item weight

                if(w <= j){ //valid
                    int incProfit = v + dp[i-1][j-w]; //curr item ki valu add then age ke liye dekh lege..
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit); //final profit 
                }
                else { //invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
          }
          return dp[n][W];
    }

    public static void main(String[] args) {
      int val[] = {15, 14, 10, 45, 30};
      int wt[] = {2, 5, 1, 3, 4};
      int W = 7;
      System.out.println(knapsack(val, wt, W, val.length));
    }
}
*/

/* 
public class BASIC { //Target Sum Subset
    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        //i = items and j = target sum
        for(int i=0; i<n+1 ; i++){
            dp[i][0] = true; //0th colom , yadi mera target sum 0 ho to arr kitna bhi bada ho true hi hoga 
        }

        for(int j=0; j<sum+1 ; j++){
            dp[0][j] = false; //0th row , yadi mere pass item 0 h orr targest sum > 0 h to thela kabhi nhi bharega ..
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<sum+1; j++) {
                int v = arr[i-1];
                //include
                if(v <= j && dp[i-1][j-v] == true) { //vth item ko add karne ke bad kya j-v bachhi capacity ko i-1 th item yadi bhar pate h to ret true
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true) {
                        dp[i][j] = true;
                    }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println(targetSumSubset(arr, sum));
    }
}
*/

/* 
public class BASIC { // unbounded knapsack by tabulation
    public static int unboundedknapsack(int val[], int wt[], int W, int n){ 
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<n+1; i++) {
            dp[i][0] = 0; //0 th coloum
          }

          for(int j=0; j<W+1; j++) {
            dp[0][j] = 0; //0 th row
          }

          for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1 ; j++) {
                int v = val[i-1]; // ith item value
                int w = wt[i-1]; // ith item weight

                if(w <= j){ //valid
                    //0 1 knapsack me dp[i-1][j-w] tha bz bha pr ith item lene ke bad me bache huye beg ko me i-1th item se bar rha tha
                    //kyoki i th item ko 0 1 knapsack me, Me dubara nhi le sakta hu ..
                    //per unbounded knapsack me,Me ith item ko ubara dal sakta hu beg me esliye yha mene dp[i][j-w] liya h 
                    int incProfit = v + dp[i][j-w]; //curr item ki valu add then age ke liye dekh lege..
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit); //final profit 
                }
                else { //invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
          }
          print(dp);
          return dp[n][W];
    }
    public static void print(int dp[][]) {
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int val[] = {15, 14, 10, 45, 30};
      int wt[] = { 2,   5,  1,  3,  4};
      int W = 7;
      System.out.println(unboundedknapsack(val, wt, W, val.length));
    }
}
*/

/* 
public class BASIC { // coinChange by tabulation
    public static int coinChange(int coins[], int sum){ 
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        for(int i=0; i<n+1; i++) {
            dp[i][0] = 1; //0 th coloum = 0 sum dene ka kebal 1 hi tarika h null 
          }

          for(int j=1; j<sum+1; j++) {
            dp[0][j] = 0; //0 th row yadi coin hi given na ho to 0 ways means not possible
          }

          //i - sum and j - sum
          for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++) {
                if(coins[i-1] <= j){ //valid
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else { //invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }

    public static void print(int dp[][]) {
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int coins[] = {1, 2, 3};
      int sum = 4;
      System.out.println(coinChange(coins, sum));
    }
}
*/

/* 
public class BASIC { //RDodCutting variation of unbounded knapsack
   // weight[] = length[], val[] = price[], W = totRod
    public static int rodCutting(int length[], int price[], int totRod) {
        int n = price.length;
        int dp[][] = new int[n+1][totRod+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 0; //0th coloum //total rod length 0 h //then max profit = 0 
        }

        for(int j=0; j<totRod+1; j++){
            dp[0][j] = 0; //0th row  // not any pices given //max profit = 0
        } 

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<totRod+1; j++){
                if(length[i-1] <= j) {
                    int include = price[i-1]+ dp[i][j-length[i-1]];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else
                {  dp[i][j] = dp[i-1][j];

                }
            }
        }
        return dp[n][totRod];
    }
    public static void main(String[] args) {
        int length[] ={1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totRod = 8;
        System.out.println(rodCutting(length, price, totRod));
    }
}
*/

/* 
public class BASIC { //longest comman subsequence by recurssion
    public static int lcs(String str1, String str2, int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) { //if last character are same 
            return lcs(str1, str2, n-1, m-1) + 1; //if same then aage ke liye call ans same char ke liye +1 add ans me
        } 
        else {
            int ans1 = lcs(str1, str2, n-1, m); //str1 len dec by 1 and str 2 is same len
            int ans2 = lcs(str1, str2, n, m-1); //str1 len same and str2 len dec by one 
            return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n= str1.length();
        int m = str2.length();

        System.out.println(lcs(str1, str2, n, m));
    }
}
*/

/* 
public class BASIC { //longest comman subsequence by memoization 
    public static int lcs(String str1, String str2, int n, int m, int dp[][]) {
        if(n==0 || m == 0){
            return 0;
        }

        if(dp[n][m] != -1) {
            return dp[n][m]; //str1 size n and str2 size m h esi string ke liye ans is alredy calculate h 
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
           dp[n][m] = lcs(str1, str2, n-1, m-1, dp) + 1; 
                return dp[n][m];
            }
              else {
                int ans1 = lcs(str1, str2, n-1, m, dp); 
                int ans2 = lcs(str1, str2, n, m-1, dp); 
                dp[n][m] = Math.max(ans1, ans2);
                return dp[n][m];
            }
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n= str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) { //inisaliztion
          for(int j=0; j<m+1; j++) {
            dp[i][j] = -1;
            }
        }

        System.out.println(lcs(str1, str2, n, m, dp));
    }
}
*/

/* 
public class BASIC { //longest comman subsequence by tabulation
    public static int lcs(String str1, String str2) {
        int n= str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) { 
          for(int j=0; j<m+1; j++) {
            if(i==0 || j== 0){
                dp[i][j] = 0; //0 th colum and 0th row me 0 se inisaized
              }
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                     dp[i][j] = dp[i-1][j-1] + 1; //+1 because ham lca ki length count kar rhe h..
                     }
                       else {
                         int ans1 = dp[i-1][j];
                         int ans2 = dp[i][j-1]; 
                         dp[i][j] = Math.max(ans1, ans2);
                     }
                }
            }
            return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println(lcs(str1, str2));
    }
}
*/

/* 
public class BASIC { //longest comman substring by tabulation
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int ans = 0;

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) { 
          for(int j=0; j<m+1; j++) {
            if(i==0 || j== 0){
                dp[i][j] = 0; //0 th colum and 0th row me 0 se inisaized
              }
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){ //ith item i-1 th index per hoga
                     dp[i][j] = dp[i-1][j-1] + 1; 
                     ans = Math.max(ans, dp[i][j]);  //har dp[i][j] ke liye dekhe jo ans ki len bdi hogi use retur 
                     }
                       else {
                         dp[i][j] = 0; //jis point per dono chr diff huye bha len = 0 bez their is not any common substring  
                     }
                }
            }
          //  return dp[n][m]; //substring me dp array me longest ans kahi bhi store ho sakta h not we can say that ki last index per hoga
          return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println(lcs(str1, str2));
    }
}
*/

/* 
public class BASIC { //longest increasing subsequence
    //lis - >  is a longest common sorted unique subsequence
    public static int longestIncreasingSunsequence(int arr1[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()]; //sorted unique ele
        int i=0;

        for (int num : set) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2); //sort bz haset order maintain nhi karta h 
        return lcs(arr1, arr2); //longest common subsequence call for both the array 
    } 

    public static int lcs(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];

        //initialize
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0; //0th coloum
        }

        for(int j=0; j<m+1; j++){
            dp[0][j] = 0; //0th row
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int arr1[] = {50, 3, 10, 7, 40, 80};
        System.out.println(longestIncreasingSunsequence(arr1));   
    }
}
*/

/* 
public class BASIC { //Edit Distance

    public static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0) { //str1 is empty means 2nd string me jitne char h utne hi operation
                    dp[i][j] = j;
                }
                if(j == 0) { //str2 is empty means 1st string me jitne char h utne hi operation
                    dp[i][j] = i; 
                } 
            } 
        }

    for(int i=1; i<n+1; i++) {
        for(int j=1; j<m+1; j++) {
            if(str1.charAt(i-1) == str2.charAt(j-1)) { //yadi dono string ke last character same h to mujhe koi operation perform nhi karna h 
                dp[i][j] = dp[i-1][j-1]; //simple aage bachi hui string ke liye //jitne operation chhoti problem ko solve hone me lagege utne hi badi ko lagege
            } else {
                int add = dp[i][j-1] +1 ; //1 add for perform add operation string i len same and str2 len decrease by one
                int delete = dp[i-1][j] +1;
                int replace = dp[i-1][j-1] +1;
                dp[i][j] = Math.min(add, Math.min(delete, replace));
            }
        }
    }
     return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(editDistance(word1, word2));
    }
}
*/

/* 
public class BASIC { //wildcard Matching
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        //jab string bhi khali h or pattern bhi khali h
        dp[0][0] = true;

        for(int i=1; i<n+1; i++){ 
                dp[i][0] = false; //when pattern is empty
        }

        for(int j=1; j<m+1; j++){
            if(p.charAt(j-1) == '*'){ //when string is empty
                //yadi last char ? or koi bhi char ho to false ho jayega 
                //orr yadi * h last char to baki bche huye pattern ko empty string se match ke liye [j-1]
                dp[0][j] = dp[0][j-1]; //es cae me yadi true hoga to true ho jayega yadi fal hoga to fal ho jayega baki sabhi case me otomatically fasle ho jayega..
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1 ; j++) {
                //case -> ith char  == jth char || jth char == ? 
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } 
                else if(p.charAt(j-1) == '*') {
                    //when * ignore || when * is match
                    dp[i][j] =  dp[i][j-1] || dp[i-1][j];  
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(isMatch(s, p));
    }
}
*/

/* 
public class BASIC { //catalan num by recurssion
    public static int calatanRec(int n) {
        if(n == 0 || n == 1){ // Co =1 and C1 = 1
            return 1;
        }

        int ans = 0;

        for(int i=0; i<= n-1; i++) {
            ans += calatanRec(i) * calatanRec(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(calatanRec(n));
    }
}
*/

/* 
public class BASIC { //catalan num by memoization
    public static int calatanMemo(int n , int dp[]) {
        if(n == 0 || n == 1){ 
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;

        for(int i=0; i<= n-1; i++) {
            ans += calatanMemo(i, dp) * calatanMemo(n-i-1, dp);
            dp[n] = ans;
        } 
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(calatanMemo(n, dp));
    }
}
*/

/* 
public class BASIC { //catalan num by tabulation
    public static int calatanRec(int n) {
       int dp[] = new int[n+1];

       dp[0] = 1;
       dp[1] = 1;

       //pehle me Cn calculate kar rha tha to ab me Ci cal kar rha hi to n ki jagah per i ho jayega..
       for(int i=2; i<=n; i++) { //i th catlan cal //<=n bz dp arr n+1 size ka h 
         for(int j=0; j<i ; j++) {
            dp[i] += dp[j] * dp[i-j-1];
         }
       }
       return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;   
        System.out.println(calatanRec(n));
    }
}
*/

/* 
public class BASIC { //count BST's
     //bst sequence is my catalan seq means number of bst = num of catalan num
    public static int countBst(int n) {
        int dp[] = new int[n+1];
        
        dp[0] = 1; //if node = 0 ya node = 1 then num of bst is 1 
        dp[1] = 1;

        for(int i=2; i<=n ; i++) { //<=n bz n+1 tak mera dp array h
            for(int j=0; j<i ; j++) {
                int left = dp[j]; //left subtree nodes arrengment
                int right = dp[i-j-1]; //right subtree nodes arrangement
                //ci = cj * ci-j-1
                dp[i] += left * right;  //arrange left and right subtree
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(countBst(n));
    }
}
*/

/* 
public class BASIC { //Mountain Ranges
    public static int countBst(int n) {
        int dp[] = new int[n+1];
        
        dp[0] = 1; 
        dp[1] = 1;

        for(int i=2; i<=n ; i++) { 
            for(int j=0; j<i ; j++) {
                int inside = dp[j]; 
                int outside = dp[i-j-1]; 
                dp[i] += inside * outside;  
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(countBst(n));
    }
}
*/

/* 
public class BASIC { //matrix chain multiplication by recurssion
    public static int mcm(int arr[], int i, int j) {
        //i= starting pt, j= ending pt
        if(i == j) {
            return 0; //single matrix mul is zero
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm(arr, i, k);  //Ai......Ak =>arr[i-1] x arr[k]
            int cost2 = mcm(arr, k+1, j); //Ai+1 ..... Aj => arr[k] x arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 * cost2 * cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};  //n = 5;
        int n = arr.length;
        System.out.println(mcm(arr, 1, n-1));
    }
}
*/

/* 
public class BASIC { //matrix chain multiplication by memoization
    public static int mcm(int arr[], int i, int j, int dp[][]) {
        
        if(i == j) {
            return 0; 
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm(arr, i, k, dp);  
            int cost2 = mcm(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 * cost2 * cost3;
            ans = Math.min(ans, finalCost);
            dp[i][j] = ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};  //n = 5;
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcm(arr, 1, n-1, dp));
    }
}
*/

/* 
public class BASIC { //matrix chain maltiplication by tabulation
    public static int mcmtab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++) { //inisaliztion digonally when single matrix
            dp[i][i] = 0;
        }

        //fill digonally
        for(int len=2; len<=n-1; len++) { //2 se bz ham 0 and 1 ke liye inisalized kar chuke h
            for(int i=1; i<=n-len; i++) { //1 se ab,bc,cd then 1 se abc,bcd then 1 se abcd
                int j = i+len-1; //col
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j] , cost1+cost2+cost3);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        System.out.println(mcmtab(arr));
    }
}
*/

/* 
public class BASIC{ //minimam partition
    public static int minPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int W = sum/2; //set1
        int dp[][] = new int[n+1][W+1];

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1; j++) {
                if(arr[i-1] <= j) { //valid
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
                } 
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};
        System.out.println(minPartition(nums));
    }
}
*/

/* 
public class BASIC { //minimam jumps
    public static int minJumps(int nums[]){
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        dp[n-1] = 0; //inisalization

      for(int i=n-2; i>=0 ; i--) {
        int steps = nums[i];
        int ans = Integer.MAX_VALUE;
        for(int j = i+1; j <= i+steps && j<n; j++) {
            if(dp[j] != -1) {
                ans = Math.min(ans, dp[j] + 1);
            }
        }
        if(ans != Integer.MAX_VALUE) {
            dp[i] = ans;
        }
      }
      return dp[0]; //dp[i] = i to n-1 tak jane me kitne steps
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1, 4};
        System.out.println(minJumps(nums));
    }
}
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * /* 
 */
