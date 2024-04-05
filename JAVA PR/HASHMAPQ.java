/* 
import java.util.*;
import java.util.HashMap;
public class HASHMAPMAPQ {
    public static void majorityElement(int num[]){
        HashMap<Integer, Integer> map = new HasMap<>();
        int n = num.length;
        for(int i=0 ; i<n ; i++) {
            if(map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i])+1);
            } else {
                map.put(num[i] , 1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key) > n/3) { // key ki frq > n/3
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
    int num[] = {1,3,2,5,1,3,1,5,1};
    majorityElement(num);

    }
}


*/


/* 
//unioun of two array and ret the couont of unioun num---->
import java.util.*;
public class HASHMAPQ {
    public static int union(int arr1[] , int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }

        return set.size(); //union ka size
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));

        
    }
}
*/

/* 
//take the intersectjion  of the 2 arrays--->
import java.util.*;
public class HASHMAPQ {
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0 ; j<arr2.length; j++){
            if(set.contains(arr2[j]));{
            count++;
            set.remove(arr2[j]);
        }
        }
        return count; //intersection count 
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(intersection(arr1, arr2));
    }
}
*/

/* 
import java.util.*;
public class HASHMAPQ {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key: tick.keySet()) {
        revMap.put(tick.get(key), key);
       }

       for(String key : tick.keySet()) {
        if(!revMap.containsKey(key)) {
            return key ; //starting point.
          }
       }
       return null ; //ysdi starting key nhi milti h to
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)) {
            System.out.println(start);
            start  = tickets.get(start);
        }
        System.out.print(start);
    }
}

*/

//Sbarray sum equals to K arr={1,2,3} k=3 ==> ans = {1,2}{3} ret num of such aubarry