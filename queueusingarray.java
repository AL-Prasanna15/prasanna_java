public class queueusingarray {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;
    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue");
        }
    }
    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        }
    }
    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return queue[front];
        }
    }
    void display(){
        if(size==0){
            System.out.println("the queue is underflow");
        }
        else{
            System.out.println("the queue elements are:");
            for(int i=0;i<=size;i++){
                int index=(front+i)% queue.length;
                System.out.print(queue[index]+" ");
            }
        }
    }

    public static void main(String[] args) {
        queueusingarray   q = new queueusingarray ();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Front element is: " + q.peek());
        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Front element is: " + q.peek());
        q.display();


    }
}

