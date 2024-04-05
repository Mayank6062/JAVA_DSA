import java.util.*;
public class BFS {
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
        
        //BFS --> level order traversal
   public static void levelOrder(Node root) {
    if(root == null){
        return ; //empty tree
    }
    Queue<Node> q = new LinkedList<>(); // q that store ll node
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode == null){
            System.out.println();
            if(q.isEmpty()){
                break; //yadi null node nikalne ke bad queue khali hi ho gayi h
            }else {
            q.add(null);
           } 
        }else{
            System.out.print(currNode.data+" ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }
}

//cout the num of nodes--------->
public static int countOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);

    return leftNodes + rightNodes + 1;
}


//sum of nodes ----------->
public static int sumOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftsum = sumOfNodes(root.left);
    int rightsum = sumOfNodes(root.right);
    return leftsum + rightsum + root.data;
}

//Height of the treee------>
public static int height (Node root){
    if(root == null){
        return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int myHeight = Math.max(leftHeight, rightHeight)+ 1;
    return myHeight;
}


//Deameter of the tree ------->0(n2 )
public static int diameter(Node root){
    if(root ==  null) {
        return 0; //if root->0 then length of diameter is 0 .
    }
     
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;

    return Math.max(diam3, Math.max(diam1, diam2));
}

//Deameter of the tree --->0(n)
static class TreeInfo {
    int ht;
    int diam ;

    TreeInfo(int ht , int diam ){
        this.ht = ht;
        this.diam = diam ;
    }
}
//ek fun h,d sath me et nhi kar sakta hence es fun ko class ke obj ke through bheja gya h 
public static TreeInfo diameter2(Node root){
    if(root == null){
       return new TreeInfo(0, 0);
    }


    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1;

    int mydiam = (Math.max(Math.max(diam1, diam2), diam3));

    TreeInfo myInfo = new TreeInfo(myHeight, mydiam);

    return myInfo;
}

//ckeck subtree of another tree=----->
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){ // leaf condition also tree ke null hone ki
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        //if not null val h then 
        if(root.val == subRoot.val){
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
public boolean isSubtree(TreeNode root, TreeNode subRoot){
    if(subRoot == null){
        return true;
    }

    if(root == null){
        return false;
    }
    if(root.val == subRoot.val ){
        if(isIdentical(root, subRoot)){
            return true;
        }
    }
    return isSubtree(root.left, subRoot)|| isIdentical(root.right, subRoot);

}
}

       public static void main(String[]args){
           // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       //     BinaryTree tree = new BinaryTree();
           // Node root = tree.buildTree(nodes);
           // levelOrder(root);
           //System.out.println(countOfNodes(root));}
          // System.out.println(root);
           //System.out.println(height(root));
          // System.out.println(diameter2(root).diam);yaha se hamare pass tree ingo ke ek obj return hokar aayge jiski ham diam print karbayege

       }

    }
    
}
