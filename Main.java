import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(11);
//        System.out.print(stack.peek());


        SetOfStacks<Character> setOfStacks = new SetOfStacks<>(2);
        setOfStacks.push('a');
        System.out.print(setOfStacks.peek());
//        setOfStacks.push('b');
//        setOfStacks.push('f');
        setOfStacks.pop();

    }
}
