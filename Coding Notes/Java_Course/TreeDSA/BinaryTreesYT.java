import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesYT{
    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
        
    }
    static class BinaryTree {
    
        static int indx = -1;
        public static Node buildTree(int nodes[]){
            indx++;

            if(nodes[indx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
        
    }

    public static void preorder (Node root){
        //Base Case
        if(root == null){
            // System.out.print(" -1 ");
            return ;
        }
      


        //recursive Case
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        //Base Case
        if(root == null){
            // System.out.print(" -1 ");
            return;
        }



        //Recursive Case
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public  static void postOrder(Node root){
        //Base Case
        if(root == null){
            // System.out.print( " -1 ");
            return;
        }




        //Recursive Case
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void levelOrder(Node root){

    Queue<Node> q=new LinkedList<Node>();
    q.add(root);
    while (q.size()>0) {

        int n=q.size();
        for(int i=1;i<=n;i++){

        
        Node temp=q.peek();
        System.out.print(temp.data);
        q.remove();
        if(temp.left != null){
            q.add(temp.left);
        }
        if(temp.right != null)
            q.add(temp.right);
        }
        System.out.println();

    }

        return ;
    }

    // void count number of nodes in Binary tree
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int a= countNode(root.left);
        int b=countNode(root.right);
        return (a+b+1);



    }
    public static int sumNodes(Node root){

        if(root==null){
            return 0;
        }



        int a=sumNodes(root.left);
        int b=sumNodes(root.right);
        return (a+b+root.data);
    }

    public static int heighTree(Node root){
        if(root == null){
            return 0;
        }

        int a=heighTree(root.left);
        int b=heighTree(root.right);
        return Math.max((a+1), (b+1));
    }
    public static int DaimeterOFTree(Node root){
        //Base Case
        if(root==null){
            return 0;
        }




        //Recursion Case
        int leftHeight = heighTree(root.left);
        int rightHeight= heighTree(root.right);

        return Math.max(leftHeight+rightHeight+1,Math.max(DaimeterOFTree(root.left), DaimeterOFTree(root.right)));


        
    }
    static class TreeInfo {
    
        int ht;
        int dia;
        TreeInfo(int ht , int dia){
            this.ht = ht;
            this.dia =dia;

        }

        
    }

    public static TreeInfo diameter2(Node root){
        ///Base Case
        if(root==null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight =Math.max(left.ht, right.ht)+1;
        int diam1= left.dia;
        int diam2=right.dia;
        int diam3= left.ht+right.ht+1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;


    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
       System.out.println(root.data);
       preorder(root);
       System.out.println();
       inorder(root);
       System.out.println();
       postOrder(root);
       System.out.println();
       levelOrder(root);
       System.out.println();
       System.out.println(countNode(root));
       System.out.println(sumNodes(root));
       System.out.println(heighTree(root));
       System.out.println(DaimeterOFTree(root));
       System.out.println(diameter2(root).dia);
    }
}