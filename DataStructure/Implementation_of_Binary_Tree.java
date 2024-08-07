package DataStructure;

import java.util.*;
class BinaryTree{
    private TreeNode root = null;//Root of the Binary Tree

    //Inner class representing a node in the Binary Tree
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            val=value;
            left=null;
            right=null;
        }
    }

    // Method to insert nodes into the binary tree
    public void insert(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int root_value = in.nextInt();
        if(root_value!=-1){
            TreeNode node = new TreeNode(root_value);
            root = node;
            insert(root);
        }
    }
    // Helper method to insert nodes recursively
    public void insert(TreeNode curr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the left  value of " + curr.val + " : ");
        int left_value = sc.nextInt();
        if (left_value != -1){
            TreeNode node = new TreeNode(left_value);
            curr.left = node;
            insert(curr.left);
        }
        System.out.print("Enter the right value of " + curr.val + " : ");
        int right_value = sc.nextInt();
        if (right_value != -1){
            TreeNode node = new TreeNode(right_value);
            curr.right = node;
            insert(curr.right);
        }
    }

    // Method to search a node in the binary tree
    void search(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key value : ");
        int key = sc.nextInt();
        if(search(key)){
            System.out.println("key value is present");
        }
        else{
            System.out.println("key value is not present");
        }
    }

    // Helper method
    boolean search(int key){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()){
            TreeNode temp = que.remove();
            if(key == temp.val){
                return true;
            }
            if(temp.left != null){
                que.offer(temp.left);
            }
            if(temp.right != null){
                que.offer(temp.right);
            }
        }
        return false;
    }

    // Method to delete a node present in the binary tree
    void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key value to delete: ");
        int key = sc.nextInt();
        if(root == null){
            return;
        }
        else if(root.left == null && root.right == null && root.val == key){
            root = null;
        }
        else {
            delete(key);
        }
    }

    // Helper method
    void delete(int key){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int right_most = -1;
        TreeNode key_node = null, right_most_node = null;

        while (!que.isEmpty()){
            TreeNode temp = que.remove();
            right_most = temp.val;
            right_most_node = temp;
            if(key == temp.val){
                key_node = temp;
            }
            if(temp.left != null){
                que.offer(temp.left);
            }
            if(temp.right != null){
                que.offer(temp.right);
            }
        }

        if(key_node != null){
            key_node.val = right_most;
            delete_rightmost(right_most_node);
        }
    }

    // Helper method
    void delete_rightmost(TreeNode del){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()){
            TreeNode temp = que.remove();
            if(temp.left != null){
                if(temp.left == del){
                    temp.left = null;
                }
                else{
                    que.offer(temp.left);
                }
            }
            if(temp.right != null){
                if(temp.right == del){
                    temp.right = null;
                }
                else {
                    que.offer(temp.right);
                }
            }
        }
    }

    // Method to perform level order traversal of the binary tree
    void levelOrder(){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        System.out.print("level order traversal : ");
        while (!que.isEmpty()){
            TreeNode temp = que.remove();
            System.out.print(temp.val + " ");
            if(temp.left != null){
                que.offer(temp.left);
            }
            if(temp.right != null){
                que.offer(temp.right);
            }
        }
        System.out.println();
    }

    // Method to perform preorder traversal of the binary tree
    void preOrder(){
        System.out.print("preorder traversal   : ");
        preOrder(root);
        System.out.println();
    }

    void preOrder(TreeNode curr){
        if (curr == null){
            return;
        }
        System.out.print(curr.val + " ");
        preOrder(curr.left);
        preOrder(curr.right);
    }

    // Method to perform inorder traversal of the binary tree
    void inOrder(){
        System.out.print("Inorder traversal    : ");
        inOrder(root);
        System.out.println();
    }

    void inOrder(TreeNode curr){
        if (curr == null){
            return;
        }
        inOrder(curr.left);
        System.out.print(curr.val + " ");
        inOrder(curr.right);
    }

    // Method to perform postorder traversal of the binary tree
    void postOrder(){
        System.out.print("postorder traversal  : ");
        postOrder(root);
        System.out.println();
    }

    void postOrder(TreeNode curr){
        if (curr == null){
            return;
        }
        postOrder(curr.left);
        postOrder(curr.right);
        System.out.print(curr.val + " ");
    }

    void height(){
        System.out.println("Height is : " + (1-height(root)));
    }

    int height(TreeNode curr){
        if(curr == null){
            return 0;
        }
        return Math.max(1 + height(curr.left), 1 + height(curr.right));
    }
}


public class Implementation_of_Binary_Tree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert();
        bt.levelOrder();
//        bt.search();
//        bt.delete();
//        bt.levelOrder();
//        bt.height();
    }
}
