import java.util.*;
public class HASHMAPimp {
    static class HashMap<K,V>{//genric type ya perametric type-->k,v ka type nhi pata 
        private class Node { //class define node of ll.
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key ;
                this.value = value;
            }
        }

        private int n;//n - nodes
        private int N;//N - buckets
        private LinkedList<Node>buckets[]; // ll of Node type ka  bucket arr

       public HashMap() {
        this.N = 4;
        this.buckets = new LinkedList[4]; //inisallize arr
        for(int i=0; i<4; i++){
            this.buckets[i] = new LinkedList<>(); //every index per khali ll create
        }
       }

       private int hasFunction(K key) {
        int bi = key.hashCode(); //take key and ret bucket index but ye ned orr pos me se koi bhi val de skta h
        return Math.abs(bi) % N; //remainder N ke sath jisse ret value 0 to N-1 ki range me rhe 
       }

       private int searchInLL(K key, int bi) {
        LinkedList<Node> ll = buckets[bi];//bi bucket index per ll linked list store h
        for(int i=0; i<ll.size(); i++){
            if(ll.get(i).key == key) {
                return i ; // i is my di
            }
        }
        return -1; //if key is not in adgit in bi 
       }

       //rehashing -->
       private void rehash() {
        LinkedList<Node>oldBucket[] = buckets; //purane deta ko oldbuket me store 
        buckets = new LinkedList[N * 2];
        for(int i=0 ; i<N*2 ; i++) {
            buckets[i] =  new LinkedList<>(); //bucket ko new ll se inisalize
        }
        for(int i=0; i<oldBucket.length; i++) {
            LinkedList<Node> ll = oldBucket[i];
            for(int j=0; j<ll.size(); j++){
            Node node = ll.get(j);
            put(node.key, node.value);
        }
    }
       }

       //put 
       public void put(K key, V value){
        int bi = hasFunction(key);
        int di = searchInLL(key, bi);//search key bucket index per adgit or not and data index ret if adgist ret index if not adgist ret -1.

        if(di == -1){ //key does not adgist then create new node then increase n
            buckets[bi].add(new Node(key, value));
            n++;
        }
        else {
            Node node = buckets[bi].get(di);// bucket[bi] se mujhe ll mil jayegi, get[di] de data index nikal jis pr key adgit karti h.
            node.value = value;
        }
       double lambda = (double)n/N;
       if(lambda > 2.0){
        //rehashing
        rehash();
       }
    }

    //get function
    public V get(K key){
        int bi = hasFunction(key);
        int di = searchInLL(key, bi);

        if(di == -1){ 
          return null;
        }
        else {
            Node node = buckets[bi].get(di);
            return node.value;
        }
    }
    
    //contains key
    public boolean containskey(K key){
        int bi = hasFunction(key);
        int di = searchInLL(key, bi);

        if(di == -1){ 
          return false;
        }
        else {
            return true;
        }
    }

    //remove fun
    public V remove(K key) {
        int bi = hasFunction(key);
        int di = searchInLL(key, bi);

        if(di == -1){ 
          return null;
        }
        else {
             Node node = buckets[bi].remove(di);
             n--;
            return node.value;
        }
    }

    public boolean isEmpty() {
        return  n == 0;
    }

    public ArrayList<K> keySet() { //ret all these keys
        ArrayList<K> keys = new ArrayList<>();

        for(int i=0; i<buckets.length; i++) {//bi
            LinkedList<Node> ll = buckets[i];
            for(int j=0; j<ll.size(); j++) { //di
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
     
    }
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();//hashmap claass ka obj
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for(int i =0; i<keys.size(); i++){
            System.out.println(keys.get(i)+ " "+ map.get(keys.get(i)));

            map.remove("India");
            System.out.println(map.get("India"));
        }
    }
}
