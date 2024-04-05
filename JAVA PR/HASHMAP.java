import java.util.HashMap;
import java.util.*;
public class HASHMAP {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>(); 

        //insert
        map.put("India", 120);
        map.put("us", 30);
        map.put("china", 150);
       // System.out.print(map +" ");
        
        //update
        map.put("china", 200);
      //  System.out.print(map +" ");

        //search
        // if(map.containsKey("china")){
        //     System.out.println("china h lode ");
        // }
        // else{
        //     System.out.println("key is not present in the map");
        // }

        // System.out.println(map.get("china"));
        // System.out.println(map.get("Indoneshiya"));

        //int arr[] = {12,15,18};
        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        // //loop for hashmap ---> by entry set ke through
        // for(Map.Entry<String, Integer> e : map.entrySet()){
        //     System.out.print(e.getKey()+"->");
        //     System.out.print(e.getValue()+" ");
        // }

        //loop for hashmap---> by key set ke through 
       // Set<String> keys = map.keySet();
       // for(String key : keys) {
         //   System.out.println(key+" "+map.get(key));
        //}

        map.remove("china");
        System.out.println(map);
    }
}
