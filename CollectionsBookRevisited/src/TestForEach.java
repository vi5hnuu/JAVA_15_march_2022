import java.util.*;
import java.util.function.Consumer;

public class TestForEach {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

//        collection.forEach(e-> System.out.println(e.toUpperCase()+" "));
        collection.forEach(new xyz());
    }

    public static class xyz implements Consumer<String>{
        @Override
        public void accept(String s){
            System.out.println(s);
        }
    }
}
