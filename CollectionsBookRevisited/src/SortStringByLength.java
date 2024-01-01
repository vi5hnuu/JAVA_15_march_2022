import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities={"Atlanta","Savannah","New York","Dallas"};
//        java.util.Arrays.sort(cities,new MyComparator());
        java.util.Arrays.sort(cities,(x1,x2)->{return x1.length()-x2.length();});

        for(String s:cities)
            System.out.println(s+" ");
    }

    private static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String s1,String s2){
            return s1.length()-s2.length();
        }
    }
}
