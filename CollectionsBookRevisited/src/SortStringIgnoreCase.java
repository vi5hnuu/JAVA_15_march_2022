import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortStringIgnoreCase {
    public static void main(String[] args) {
        java.util.List<String> cities= java.util.Arrays.asList("Atlants","Savannah","New York","Dallas");
//        cities.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        cities.sort(String::compareToIgnoreCase);
//        cities.sort(Comparator<? Super E>);
        for(String s:cities)
            System.out.println(s+" ");
//        Arrays.asList(); //return new ArrayList
    }
}
