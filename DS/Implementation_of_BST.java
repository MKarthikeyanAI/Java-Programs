package DS;

public class Implementation_of_BST {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public class BinaryTree{
        Node root;
        public void insert(int data){
            root = insertRec(root,data);
        }
        public Node insertRec(Node root,int data)
        {
            if(root==null)
                root = new Node(data);
            else if(data<root.data)
                root.left=insertRec(root.left,data);
            else if(data>root.data)
                root.right=insertRec(root.right,data);

            return root;
        }

        public void inorder()
        {
            System.out.println("In Order: ");
            inorderRec(root);
        }
        public void inorderRec(Node root)
        {

            if(root!=null)
            {
                inorderRec(root.left);
                System.out.print(root.data+" ");
                inorderRec(root.right);
            }
        }

        public void preorder()
        {
            System.out.println("Pre Order: ");
            preorderRec(root);
        }
        public void preorderRec(Node root)
        {

            if(root!=null)
            {
                System.out.print(root.data+" ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }
        public void postorder()
        {
            System.out.println("Post Order: ");
            postorderRec(root);
        }
        public void postorderRec(Node root)
        {

            if(root!=null)
            {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.data+" ");
            }
        }
    }
    public static void main(String[] args) {
        Implementation_of_BST outerinstance = new Implementation_of_BST();
        BinaryTree tree = outerinstance.new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inorder();
        System.out.println("");
        tree.preorder();
        System.out.println("");
        tree.postorder();
    }
}
