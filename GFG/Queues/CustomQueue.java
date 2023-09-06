package GFG.Queues;

public class CustomQueue<T> {
    private Object[] array;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public void reverse(CustomQueue<T> q) {
        if (q.isEmpty()) {
            return;
        }
        T top = q.dequeue();
        reverse(q);
        q.enqueue(top);
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        T item = (T) array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue size: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.print("Dequeue: " + queue.dequeue());
        }
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.reverse(queue);
        while (!queue.isEmpty()) {
            System.out.print("Dequeue: " + queue.dequeue());
        }
    }
}
