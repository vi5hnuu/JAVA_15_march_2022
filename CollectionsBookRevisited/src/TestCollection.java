import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1=new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dalas");
        collection1.add("Medison");

        System.out.println("A list of cities in collection1 :");
        System.out.println(collection1);

        System.out.println("|n Dallas in collection :"+collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("Size "+collection1.size()+" cities in the collection now");

        Collection<String> collection2=new ArrayList<>();
        collection2.add("Seatle");
        collection2.add("Portland");
        collection2.add("Los Angles");
        collection2.add("Atlanta");

        System.out.println("\nLsit of cities in collection2 :");
        System.out.println(collection2);


        ArrayList<String> c1=(ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("Cities in collection1 and collection2 :");
        System.out.println(c1);

        c1=(ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("Cities in colection1 , but not in collection 2");
        System.out.println(c1);
    }
}
