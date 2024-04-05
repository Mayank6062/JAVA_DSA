import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size 
        System.out.println("size :"+ set.size());

        //print 
        System.out.println(set);

        // //search
        // if(set.contains(1)){ //ret true
        //     System.out.println("yes 1 contain");
        // }
        // if(!set.contains(6)){
        //     System.out.println("not constain 6");
        // }

        // //Delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("not 1 now");}

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        
    }
}
