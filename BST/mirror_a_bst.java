import java.util.*;
public class mirror_a_bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node LeftS=mirror(root.left);
        Node RightS=mirror(root.right);

        root.left=RightS;
        root.right=LeftS;

        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node createBST(int[] arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, st,mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int [] arr={3,5,6,8,10,11,12};
        // Node root=new Node(8);
        // root.left=new Node(5);
        // root.right=new Node(10);
        // root.left.left=new Node(3);
        // root.left.right=new Node(6);
        // root.right.right=new Node(11);

        // root=mirror(root);
        // preOrder(root);
        // System.out.println();

        Node root =createBST(arr, 0,arr.length-1);
        preOrder(root);
    }
    
}
