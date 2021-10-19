import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCollection<T> {
    protected int DEFCAP = 10; //Default Capacity
    protected T[] elements; // array of type T
    protected int numElements = 0; // int to hold the number of elements in the array
    protected boolean found; //was the element found in the collection
    protected int location; // index of the element if it is found

    //First constructor uses default capacity if none is given
    public ArrayCollection()
    {
        elements = (T[]) new Object[DEFCAP]; //Create a new collection of elements of type T
    }

    //Second constructor creates a collection of size "capacity" (int) as passed to the constructor
    public ArrayCollection(int capacity)
    {
        elements = (T[]) new Object[capacity];
    }



    public boolean add(T element)
    {
        if (isFull())
            return false;
        else
        {
            elements[numElements] = element;
            numElements++;
            return true;
        }
    }

    public boolean isFull()
// If the number of elements in the array is equal to the length, it is full, return true
    {
        if (numElements == elements.length){
            return true;
        }
        return false;
    }

    //Added Methods
    public String toString(){
        String output = ("Collection: " );
        location = 0;
        while (location < elements.length)
        {
            if (elements[location] != null) {
                output += (elements[location].toString()) + ", ";
            }
            else output += "null, ";
            location ++;
        }
        //Display output to console
        return output;
    }

    public int count(T target)
    {
        int count = 0;
        if(numElements == 0)
        {
            return count;
        }
        else
        {
            //For every element in the collection...
            for(location = 0; location < numElements; location++)
            {
                //If that element is equal to the target,
                if(elements[location].equals(target))
                {
                    //Increase the count
                    count++;
                }
            }
            return count;
        }

    }

    public void removeAll(T target)
    {
        System.out.println("Removing all instances of " + target.toString() + " in the collection...");
        if(numElements == 0)
        {
            System.out.println("The collection is empty, cannot remove target");
        }
        else
        {
            //For each element in the collection...
            for (location = 0; location < numElements; location++)
            {
                //If that element equals the target
                if(elements[location].equals(target))
                {
                    //Assign the value of the element at the end of the array to the index of the element that matches the target
                    elements[location] = elements[numElements - 1];
                    //Remove the data associated with the element that was previously at the end of the array
                    elements[numElements - 1] = null;
                    //Remove one from the number of elements in the array
                    numElements--;
                }
            }
        }
    }

    public ArrayCollection<T> combine(ArrayCollection<T> source2)
    {
        ArrayCollection<T> combined = new ArrayCollection<T>();

        //For every element in the source2 collection...
        for (location = 0; location < source2.numElements; location++)
        {
            //In the new array, assign the elements from the source2 array to their corresponding indexes
            combined.elements[location] = source2.elements[location];
        }

        //For every element in the source1 (the current object) array
        for (int i = 0; i < this.numElements; i++)
        {
            //Currently the location is at one less than the num of elements in the collection
            //Its at the end index, see line 115.
            //Assign the element to the next available index
            combined.elements[location++] = this.elements[i];
        }
        //The number of elements is equal to the length of the collection
        combined.numElements = combined.elements.length;

        return combined;
    }

    //MAIN METHOD
    public static void main(String args[])
    {
        //Create new ArrayCollection object of type integer to store the test data
        ArrayCollection<Integer> t = new ArrayCollection<Integer>(12);

        //Add elements to the collection
        t.add(1);
        t.add(1);
        t.add(2);
        t.add(2);
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(7);
        t.add(6);

        //Demonstrating overridden toString() method
        System.out.println(t.toString());

        //Demonstrating counting the number of a specific element in the collection
        //Like how many 2's or how many 7's
        System.out.println("There are " + t.count(2) + " instances of 2 in the collection");
        System.out.println("There are " + t.count(7) + " instances of 7 in the collection");

        //Remove any instances of 2's in the collection
        t.removeAll(2);

        //For testing
       //System.out.println(Arrays.toString(test.elements));

        //Display list to check if the 2's have been removed
        System.out.println("Ensuring all 2's are removed: " + t.toString() + "\n");

        //Create a new collection to combine with "test"
        ArrayCollection<Integer> joiner = new ArrayCollection<Integer>();
        joiner.add(3);
        joiner.add(9);
        joiner.add(10);

        System.out.println("Adding the new collection: " + joiner.toString() + "\n");


        //Combine the collections and print them
        System.out.println("The newly combined collection is:\n" + t.combine(joiner).toString());


    }
}
