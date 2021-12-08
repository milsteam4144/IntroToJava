import java.lang.reflect.Array;
import java.util.List;

public class useBag<T> implements BagInterface<T>{

    Object[] items;
    int numElements;
    int capacity = 20;
    CollectionInterface<T> ac = new ArrayCollection<T>();
    CollectionInterface<T> sac = new SortedArrayCollection();
    CollectionInterface<T> lc = new LinkedCollection();

        @Override
        public Object get(Object target) {
            return null;
        }

        @Override
        public boolean contains(Object target) {
            return false;
        }

        @Override
        public boolean remove(Object target) {
            return false;
        }

        @Override
        public boolean isFull() {
            return false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public int count(T target){
            return 0;
        }

        @Override
        public int removeAll(T target){
            return 0;
        }

        @Override
        public void clear(){

        }

        public boolean add (T element){
            if (isFull())
                return false;
            else
            {
                ac.add(element);
                numElements++;
                return true;
            }
        }

    //Use overridden constructors for the three collection types
    public useBag(ArrayCollection T){
        System.out.println("An ArrayCollection bag was created");
    }

    public useBag(SortedArrayCollection T){
        System.out.println("A SortedArrayCollection bag was created");
    }
    public useBag(LinkedCollection T){
        System.out.println("A LinkedCollection bag was created");
    }

    //Grab method
    public T grab(){
        if (this.ac.size() == 0){
            System.out.println("The bag is empty");
            return null;
        }
        else{
            return ac.getIndex[((int)(Math.random() * ac.size()))];
        }
    }
}
