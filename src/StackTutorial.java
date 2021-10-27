import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args){
//        Stack<String> games = new Stack<String>();
//        games.add("Call of Duty");
//        games.add("Guitar Hero");
//        games.add("Super Monkey Ball");
//        System.out.println(games);
//        System.out.println(games.peek());
//        System.out.println(games.pop());
//        System.out.println(games.pop());
//        System.out.println(games.pop());
    Stack<Character> tower = new Stack<Character>();
    tower.add('R');
    tower.add('B');
    tower.add('Y');
    System.out.println(tower.pop());
    System.out.println(tower.set(1,'Y'));
    System.out.println(tower.empty());
    }
}
