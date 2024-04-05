public class BinaryTrees {
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
    static class BinaryTree {
        static int idx = -1; //index that trave all the indexs.
        public static Node buildTree(int nodes[]){ //take all nodes and ret root node
            idx++; //-1 to 0 means root node ko sabse pehle create
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);//root banane ke bad baki deta ke liye nayi node create 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    
    //PREORDER--->
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //INORDER ----->
      public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    
    //POSTORDER ---->
     public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }

    public static void main(String []args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
      //  System.out.println(root.data);
      preorder(root);
      inorder(root);
      postorder(root);
    }

}
