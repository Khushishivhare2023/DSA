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
    // static class Info{
    //     int d;
    //     int h;
    //     public Info(int d, int h){
    //         this.d=d;
    //         this.h=h;
    //     }
    // }
    // public static Info diameter(Node root){
    //     if(root==null){
    //         return new Info(0,0);
    //     }
    //     Info Linfo=diameter(root.left);
    //     Info Rinfo=diameter(root.right);
    //     int d=Math.max((Math.max(Linfo.d,Rinfo.d)),Linfo.h+Rinfo.h+1);
    //     int h=Math.max(Linfo.h,Rinfo.h)+1;

    //     return new Info(d,h);
    // }
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
    static class Info{
        Node node;
        int hd;

        Info(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                  map.put(curr.hd, curr.node);
                }
                if(curr.node.left!=null){
                   q.add(new Info(curr.node.left,curr.hd-1));
                   min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data +" ");
        }
        System.out.println();
    }
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data);
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    public static Node lca(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca(root.left, n1, n2);
        Node rightlca=lca(root.right, n1, n2);

        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;
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

        // Node subroot=new Node(2);
        // subroot.left=new Node(4);
        // subroot.right=new Node(5);
        //System.out.println(isSubtree(root,subroot));
        // topView(root);

        // int k=3;
        // Klevel(root, 1, k);
        System.out.println(lca(root, 4, 6).data);


        
    }
    
}
