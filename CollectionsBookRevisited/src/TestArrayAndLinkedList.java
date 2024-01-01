import java.util.*;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(4,30);
        System.out.println("A list of integers in the arrayList :");
        System.out.println(arrayList);

        LinkedList<Object> linkedList=new LinkedList<>(arrayList);
        linkedList.add(1,"red");
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward :");
        ListIterator<Object> listIterator=linkedList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println("Dsiplay linked list in backward order");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+" ");
        }
    }
}
