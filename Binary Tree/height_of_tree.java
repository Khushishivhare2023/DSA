import java.util.*;
public class height_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
    }
    static class Info{
        int d;
        int h;
        public Info(int d, int h){
            this.d=d;
            this.h=h;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info Linfo=diameter(root.left);
        Info Rinfo=diameter(root.right);
        int d=Math.max((Math.max(Linfo.d,Rinfo.d)),Linfo.h+Rinfo.h+1);
        int h=Math.max(Linfo.h,Rinfo.h)+1;

        return new Info(d,h);
    }
    public static boolean isIndentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isIndentical(node.left, subroot.left)){
            return false;
        }
        if(!isIndentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIndentical(root,subroot)){
                return true;
            }
        }
        return isIndentical(root.left,subroot) || isIndentical(root.right,subroot);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //System.out.println(height(root));
        //System.out.println(count(root));
        //System.out.println(sum(root));
        //System.out.println(diameter(root).d);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println(isSubtree(root,subroot));
        
    }
    
}
