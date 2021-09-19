interface PairInterface{

    String listItems();
}

class BasicPair implements PairInterface{
    String first;
    String second;
    BasicPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String listItems(){
        return ("The Basic Pair is: " + this.first + " " + this.second);

    }

}

class ArrayPair implements PairInterface {
    String first;
    String second;

    ArrayPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String listItems() {
        return ("The Basic Pair is: " + this.first + ", " + this.second);
    }
}

public class Interfaces{
    public static void main(String[] args){
    PairInterface tester = new BasicPair("Item One", "Item Two");
    System.out.println(tester.listItems());

    }
}