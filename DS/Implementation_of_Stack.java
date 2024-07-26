package DS;

public class Implementation_of_Stack {
    public class Stack{
        int capacity =2;
//        int stack[] = new int[5];
        int stack[] = new int[capacity];
        int top = 0;
        public void push(int data)
        {
            if(size()==capacity)
            {
                expand();
            }
            stack[top]=data;
            top++;
//            if(top == 5)
//            {
//                System.out.println("The Stack is full");
//            }
//            else {
//                stack[top] = data;
//                top++;
//            }

        }
        private void expand()
        {
            int length=size();
            int newStack[] = new int[capacity*2];
            System.arraycopy(stack,0,newStack,0,length);
            stack=newStack;
            capacity*=2;
        }

        public int pop()
        {
            int data=0;
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
            }
            else {
                top--;
                data = stack[top];
                stack[top] = 0;
                shrink();
            }
            return data;
        }
        private void shrink()
        {
            int length = size();
            if(length<=(capacity/2)/2)
            {
                capacity = capacity/2;
            }
            int newStack[]=new int[capacity];
            System.arraycopy(stack,0,newStack,0,length);
            stack=newStack;
        }
        public void show()
        {
            for(int n:stack)
            {
                System.out.println(n+" ");
            }
        }
        public int peek()
        {
            int data;
            data = stack[top-1];
            return data;
        }
        public int size(){
            return top;
        }
        public boolean isEmpty(){
            return top<=0;
        }
    }
    public static void main(String[] args) {
        Implementation_of_Stack outerinstance = new Implementation_of_Stack();
        Stack nums = outerinstance.new Stack();
        nums.push(5);
        nums.push(5);
        nums.push(5);
        nums.push(5);
        nums.push(5);
        nums.push(5);
        nums.push(5);
        nums.push(5);

        nums.show();
        System.out.println("Size of the Stack: "+nums.size());
        System.out.println("Empty: "+nums.isEmpty());
    }
}
