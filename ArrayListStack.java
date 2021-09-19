import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStack<T> {
    //Create a stack of ArrayList objects
    ArrayList<T> stack;
    ArrayListStack(){
        //Calls the constructor from the superclass
        super();
        //Assign the array-list to the stack
        this.stack = new ArrayList<>();
    }
        boolean safePush (T element) {
                if (stack.add(element))
                    return true;
                else
                    return false;
    }

    boolean safePop() {
        if(stack.isEmpty()) {
            System.out.println("Cannot pop an empty stack!!!!");
            return false;
        }
        //Remove the element at the last index of the stack
        else{
            //System.out.println("Popping element: " + safeTop());
            stack.remove(stack.size()-1);
            //System.out.println("Successfully popped element!!!");

        }
        return true;
    }
    //Method to return the element at the topIndex so long as the stack is not empty
    T safeTop() {
        if(stack.isEmpty())
            return null;
        return stack.get(stack.size()-1);
    }
    public static void main (String[] args){
        //Create a new empty stack
        ArrayListStack<String> names = new ArrayListStack<>();

        System.out.println("Add a name to the stack");
        System.out.println("Successfully pushed? - " + names.safePush("Mallory"));
        System.out.println("Successfully pushed? - " + names.safePush("Mandy"));
        System.out.println("Successfully pushed? - " + names.safePush("Natalie"));
        names.toString();
        System.out.println(names.safeTop());
        //Remove Natalie
        System.out.println(names.safePop());
        System.out.println(names.safeTop());
        //Remove Mandy
        System.out.println(names.safePop());
        System.out.println(names.safeTop());
        //Remove Mallory
        System.out.println(names.safePop());
        System.out.println(names.safeTop());
        //Cannot pop empty stack
        System.out.println(names.safePop());






    }

    }

     /*


} */