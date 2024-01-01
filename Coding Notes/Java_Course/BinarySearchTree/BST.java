import java.util.ArrayList;

public class BST{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return root=new Node(val);
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        // Base case
        if (root == null) {
            return;
        }

        // recursive case
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static boolean search(Node root  , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left=delete(root.left, val);

        }else if (root.data < val){
            root.right = delete(root.right, val);
        }else{
            //case 1
            if(root.left == null && root.right ==null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.right;
            }
            //case 3
            Node IS= inOrderSuccess(root.right);
            root.data = IS.data;
            root.right= delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inOrderSuccess(Node root){
        while (root.left !=null) {
            root=root.left;
        }
        return root;
    }

    public static void PrintInRange(Node root,int x,int y){
        //Base Case
         if(root == null){
            return ;
         }

         if(root.data >= x && root.data <=y){
            System.out.print(root.data);
         }

        //Recursive Case
        PrintInRange(root.left,x,y);
        PrintInRange(root.right,x,y);
}

public static void find(Node root,int X,int Y){
    if(root==null){
        return;
    }
    //Base Case
    if(root.data >=X && root.data<=Y){
        find(root.left, X, Y);
        System.out.print(root.data);
        find(root.right,X , Y);
    } else if(root.data >=Y){
        find(root.left, X, Y);
    }else{
        find(root.right, X, Y);
    }

}
 public static void rootToleaf(Node root,ArrayList<Integer>list){
    if(root==null){
        return;
    }
     list.add(root.data);
    //Base Case 
    if(root.left == null && root.right == null){
        System.out.println(list);
        return;
    }else{

           
    rootToleaf(root.left, list);
       
    rootToleaf(root.right, list);
    }


    list.removeLast();





    //Recursive test
 }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<Integer>();
        int values[] = { 1,10,3,11,14,12,16 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root, 10));
        delete(root, 3);
        System.out.println();
        inorder(root);
        PrintInRange(root,3,7);
        find(root, 3, 7);
        rootToleaf(root,list);

    }
}