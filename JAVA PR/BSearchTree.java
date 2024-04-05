import java.util.ArrayList;

public class BSearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
        }
    }
//INSERT NODE IN THE BST
    public static Node insert(Node root, int val){ //type Node bz ham recursively insert karege val ko after insert ham node ko ret karege
        if(root == null){
            root = new Node(val);
            return root; 
        }
        if(root.data > val){
            root.left = insert(root.left, val);//yha pure left sub ka pointer mil jayega
        }
        else {
             root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    //SEARCH IN BINARY TREE--->
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data > key ){
            return search(root.left , key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    //DELETENODE IN BST---->
     //node type diya bz har level per ham apni hi node ret kar rhe h jab bhi ham node ko ret karte h to jo bhi changes hote h reflect karne lagte h
     public static Node delete(Node root, int val){
        if(root.data > val){ //only search
            root.left = delete(root.left, val); // node jo ret hogi store
        }
        else if(root.data < val){ // only search
            root.right = delete(root.right, val);
        }
        else { //root.data == val 
            //case 1
            if(root.left == null && root.right == null) {
                return null; //parent ko null ret
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
     }

     public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
     }

//PRINT IN RANGE=------>
     public static void printinorder(Node root, int x, int y){
        if(root == null){
            return ;  // if tree is null than ret 
        }
        
        if(root.data >= x && root.data <= y){
          printinorder(root.left, x, y); //print nodes jo es range me left subtree me lie karte h 
         System.out.println(root.data+" ");
          printinorder(root.right, x, y);
        }
        else if(root.data >= y ){
            printinorder(root.left, x, y);
        }
        else{
            printinorder(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i =0; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println();
    }


//PRINT ALL THE PATH OF OUR BST ------>
public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
    if(root == null){
        return ; }
    path.add(root.data); //kisi bhi node per pahuche orr use path me add
    if(root.left == null && root.right==null){ //we have leaf node
        printPath(path);
    }
    else{ //non--leaf
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
    }
    path.remove(path.size() -1);
}



    public static void main(String args[]) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null ;

        for(int i=0 ; i<values.length; i++){
            root = insert(root , values[i]);
        }
        inorder(root);
        System.out.println();

          //boolean ll = search(root, 7);
          //System.out.println(ll);

          //delete(root , 4);
        //  delete(root, 10);
         // inorder(root);
        // printinorder(root, 10, 14);
        printRoot2Leaf(root, new ArrayList<>());
    }
    
}
