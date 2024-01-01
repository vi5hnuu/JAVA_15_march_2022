
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue1=new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        System.out.println("Priority queue using comparable");
        while (queue1.size()>0){
            System.out.println(queue1.remove()+" ");
        }

        PriorityQueue<String> queue2=new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");
        System.out.println("Priority queue using comparable");
        while (queue2.size()>0){
            System.out.println(queue2.remove()+" ");
        }
    }
}
