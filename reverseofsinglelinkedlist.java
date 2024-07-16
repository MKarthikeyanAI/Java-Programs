public class reverseofsinglelinkedlist {
    public class Node
    {
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        public void insert(int data){
            Node node = new Node();
            node.data=data;
            node.next=null;

            if(head ==null)
            {
                head = node;
            }
            else{
                Node n = head;
                while(n.next!=null)
                {
                    n=n.next;
                }
                n.next=node;
            }

        }
        public void show(){
            Node n=head;
            while(n.next!=null)
            {
                System.out.println(n.data);
                n=n.next;
            }
            System.out.println(n.data);
        }
        public void reverse(){
            Node prev=null;
            Node nextt=null;
            while(head!=null)
            {
                nextt = head.next;
                head.next = prev;
                prev = head;
                head = nextt;
            }
            head = prev;
        }
    }

    public static void main(String[] args) {
        reverseofsinglelinkedlist o = new reverseofsinglelinkedlist();
        LinkedList list = o.new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.show();
        System.out.println("After Reversing");
        list.reverse();
        list.show();
    }
}
