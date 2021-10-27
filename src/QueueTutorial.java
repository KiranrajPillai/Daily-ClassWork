import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorial {
    public static void main(String[] args){
//        Queue<String> bbqLine = new LinkedList<String>();
//        bbqLine.add("James");
//        bbqLine.add("Tyson");
//        bbqLine.add("Susan");
//        bbqLine.poll();
//        bbqLine.poll();
//      System.out.println(bbqLine.poll());
//      System.out.println(bbqLine.peek());
//      System.out.println(bbqLine);
        Queue<String> q = new LinkedList<String>();
    q.add("a");
    q.add("b");
    q.add("c");
 //   q.peek();
  System.out.println(q.peek());
  System.out.println(q.poll());
    }
}
