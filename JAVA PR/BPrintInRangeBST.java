public class BPrintInRangeBST {
    static class Node { //rep evry single node of tree
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printinorder(Node root, int x, int y){
        if(root == null){
            return ; // if tree is null than ret 
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


    
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null ;

        printinorder(root, 6 ,10);

    }

}