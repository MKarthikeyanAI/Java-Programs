public class findmiddleelementoflinkedlist {
    public class Node{
        int data;
        Node next;
    }
    public class LinkedList{
        Node head;
        public void insert(int data){
            Node node = new Node();
            node.data=data;
            node.next=null;
            if(head == null)
            {
                head = node;
            }
            else
            {
                Node n = head;
                while(n.next!=null)
                {
                    n=n.next;
                }
                n.next = node;
            }
        }
        public void insertAtStart(int data)
        {
            Node node = new Node();
            node.data=data;
            node.next=null;
            node.next=head;
            head = node;
        }
        public void insertAt(int index,int data)
        {
            Node node = new Node();
            node.data=data;
            node.next=null;
            if(index==0){
                insertAtStart(data);
            }
            else {
                Node n=head;
                for(int i=0;i<index-1;i++)
                {
                    n=n.next;
                }
                node.next=n.next;
                n.next = node;
            }
        }
        public void Middleelement(){
            Node n = head;
            Node temp =head;
            int count=0;
            while(n!=null){
                n=n.next;
                count++;
            }
            int x=count/2;
            int a=0;
            while(a!=x-1)
            {
                temp=temp.next;
                a++;
            }
            Node t = temp.next;
            System.out.println(t.data);

        }
    }
    public static void main(String args[])
    {
        findmiddleelementoflinkedlist o= new findmiddleelementoflinkedlist();
        LinkedList list = o.new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.Middleelement();

    }
}
