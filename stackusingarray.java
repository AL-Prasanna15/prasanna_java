public class stackusingarray {
    int[] stack = new int[5];
    int top = -1;
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed to stack");
        }
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }
    void display(){
        if(top==-1){
            System.out.println("the stack is underflow");
        }
        else{
            System.out.println("the stack elements are:");
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        stackusingarray    s = new stackusingarray  ();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Top element is: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element is: " + s.peek());
        s.display();

    }
}

