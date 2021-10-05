//Mallory Milstead Chapter 4
//This program simulates a link-based
//Deque class (elements can be added or removed from front or rear)

import java.util.Arrays;

public class Deque {
    protected int[] array;
    protected int capacity;
    protected int size;

    //Initialize Deque object
    public Deque(int capacity) {
        this.capacity = capacity;
        size = 0;
        //Create an array with the size of the capacity
        array = new int[capacity];
    }
    //Return true if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFront(int value) {
        //for every element in the array...
        for (int i = size; i > 0; i--) {
            //Move it one index up
            array[i] = array[i-1];
        }
        //Assign the newly added value to index 0 (front)
        array[0] = value;
        //Increase the size of the array
        size++;
    }

    public void addLast(int value) {
        //Increase the size of the array and add the element at that new index
        int newSize = size++;
        array[newSize] = value;
    }

    public int removeFront() {
        //Determine the value to be removed
        int value = array[0];
        //
        for (int i = 0; i < size-1; i++) {
            //Move each item down one index
            array[i] = array[i+1];
        }
        size--;
        //Returns the value to be removed
        return value;
    }

    public int removeLast() {
        int newSize = --size;
        //Returns the value to be removed
        return array[newSize];
    }
}

class Driver {

    public static void main(String[] args) {
        Deque queue = new Deque(5);
        queue.addFront(1);
        queue.addFront(2);
        queue.addLast(5);
        queue.addFront(3);
        queue.addLast(4);

        System.out.println("The deque looks like this: " + Arrays.toString(queue.array) + " to begin");


        System.out.println("Removing item from rear... " + queue.removeLast());
        System.out.println("Removing item from rear... " +queue.removeLast());

        System.out.println("Removing item from front... " +queue.removeFront());
        System.out.println("Removing item from front... " +queue.removeFront());
    }

}
