package DS;

public class Implementation_of_Queue {
    public class Queue{
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enQueue(int data)
        {
            if(!isFull())
            {
                queue[rear]=data;
                rear=(rear+1)%5;
                size=size+1;
            }
            else
            {
                System.out.println("Queue is Full");
            }
        }
        public int deQueue()
        {
            int data = queue[front];
            if(!isEmpty())
            {
                front = (front+1)%5;
                size=size-1;

            }
            else
            {
                System.out.println("Queue is Empty");
            }
            return data;
        }
        public int getSize()
        {
            return size;
        }
        public boolean isEmpty()
        {
            return getSize()==0;
        }
        public boolean isFull()
        {
            return getSize()==5;
        }
        public void show()
        {
            System.out.println("Elements: ");
            for(int i=0;i<size;i++)
            {
                System.out.print(queue[(front+i)%5]+" ");
            }
            System.out.println();
            for(int n:queue)
            {
                System.out.print(n+" ");
            }
        }
    }
    public static void main(String[] args) {
        Implementation_of_Queue outerinstance = new Implementation_of_Queue();
        Queue q = outerinstance.new Queue();
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(25);
        q.enQueue(15);
        q.enQueue(25);
        q.show();
    }
}
