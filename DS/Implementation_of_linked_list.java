package DS;

import java.util.*;
public class Implementation_of_linked_list {
    public class Node{
        int data;
        Node next;

    }
    public class LinkedList{
        Node head;
        public void insert(int data)
        {
            Node node = new Node();
            node.data=data;
            node.next=null;
            if(head==null)
            {
                head=node;
            }
            else
            {
                Node n = head;
                while(n.next!=null)
                {
                    n=n.next;
                }
                n.next=node;
            }
        }
        public void insertAtStart(int data)
        {
            Node node = new Node();
            node.data=data;
            node.next=null;
            node.next=head;
            head=node;
        }
        public void insertAt(int index,int data)
        {
            Node node = new Node();
            node.data=data;
            node.next=null;

            if(index == 0)
            {
                insertAtStart(data);
            }
            else
            {
                Node n = head;
                for(int i=0;i<index-1;i++)
                {
                    n = n.next;
                }

                node.next=n.next;
                n.next=node;
            }

        }

        public void deleteAtBeginning(){
            if(head==null){
                System.out.println("There are no elements in the linked list");
            }
            else{
                head=head.next;
            }
        }
        public void deleteAt(int index)
        {
            if(index==0)
            {
                head = head.next;
            }
            else
            {
                Node n = head;
                Node n1=null;
                for(int i=0;i<index-1;i++)
                {
                    n = n.next;
                }

                n1=n.next;
                n.next = n1.next;
                n1 = null;
            }
        }


        public void show()
        {
            Node node = head;
            while(node.next!=null)
            {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        Implementation_of_linked_list outerInstance = new Implementation_of_linked_list(); // Create an instance of the outer class
        LinkedList list = outerInstance.new LinkedList(); // Create an instance of the inner class
        list.insert(18);
        list.insert(15);
        list.insert(125);
        list.insertAtStart(10);
        list.insertAt(0,111);
        list.show();
        list.deleteAtBeginning();
        System.out.println("After Deleting");
        list.show();
    }
}
