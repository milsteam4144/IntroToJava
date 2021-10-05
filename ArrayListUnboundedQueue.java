//Mallory Milstead Chapter 4
//This program simulates using an ArrayList (dynamic list) to simulate an unbounded queue.

import java.util.ArrayList;

public class ArrayListUnboundedQueue<T>  implements QueueInterface<T>{
    protected int DEFCAP = 100;
    protected ArrayList<T> elements; //ArrayList to hold the queue elements
    protected int size;
    protected int front;
    protected int rear;

    //Constructor to initialize the ArrayList
    public ArrayListUnboundedQueue(int capacity) {
        this.DEFCAP = capacity;
        front = 0;
        rear = capacity - 1;
        elements = new ArrayList<T>();
    }

    //If the size is equal to capacity, the queue is full
    public boolean isFull(ArrayListUnboundedQueue<T> queue) {
        return (queue.size == queue.DEFCAP);
    }

    //If size is zero, the queue is empty
    public boolean isEmpty(ArrayListUnboundedQueue<T> queue) {
        return (queue.size == 0);
    }

    //Add element to the queue
    public void enqueue(T element) throws QueueOverflowException{
        if (!isFull(this)) {
            this.rear = (this.rear + 1) % this.DEFCAP;
            this.elements.add(element);
            this.size = this.size + 1;
            System.out.println("The element " + element.toString() + " has been added to the queue");
        }
        else{
            throw new QueueOverflowException("The queue is full");
        }
    }

    //Remove element from the queue
    public T dequeue() throws QueueUnderflowException {
        if (isEmpty(this)) {
            throw new QueueUnderflowException("The queue is empty. Cannot dequeue an element.");
        }
        else{
            T element = this.elements.get(front);
            this.front = (this.front + 1) % this.DEFCAP;
            this.size = this.size - 1;
            System.out.println("The element " + element.toString() + " has been removed from the queue");
            return element;
        }
    }

    //Return the size of the queue
    public int getSize() {
        return this.size;
    }

    //Return the element at the front of the queue
    public T peek() {
        if (isEmpty(this))
            return null;
        else{
            return this.elements.get(front);
        }
    }

    //Return the element at the rear of the queue
    public T rear() {
        if (isEmpty(this))
            return null;
        else{
            return this.elements.get(rear);
        }
    }

    //MAIN METHOD
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        ArrayListUnboundedQueue<Integer> queue = new ArrayListUnboundedQueue<Integer>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("\nThe size of the queue is: " + queue.getSize());

        queue.dequeue();

        System.out.println("\nThe size of the queue is: " + queue.getSize());


        //Used for testing purposes. This will cause a QueueUnderflowException
        /*
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
         */

        System.out.println("Front item is " + queue.peek());

        System.out.println("Rear item is " + queue.rear());
    }
}


//Here is the INTERFACE
interface QueueInterface <T>{
    void enqueue(T element) throws QueueOverflowException;
    // Throws QueueOverflowException if this queue is full;
    // otherwise, adds element to the rear of this queue.

    T dequeue() throws QueueUnderflowException;
    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.

    boolean isFull(ArrayListUnboundedQueue<T> queue);
    // Returns true if this queue is full; otherwise, returns false.

    boolean isEmpty(ArrayListUnboundedQueue<T> queue);
    // Returns true if this queue is empty; otherwise, returns false.

    int getSize();
    // Returns the number of elements in this queue.
}
//Here are the exceptions
class QueueOverflowException extends Exception {
    public QueueOverflowException(String errorMessage) {
        super(errorMessage);
    }
}
class QueueUnderflowException extends Throwable {
    public QueueUnderflowException(String errorMessage) {
        super(errorMessage);
    }
}