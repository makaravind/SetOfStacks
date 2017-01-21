import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class SetOfStacks<T> {

    private ArrayList<Stack<T>> stacks = new ArrayList<>();
    private Integer threshold;


    public SetOfStacks(Integer threshold){
        this.threshold = threshold;

        stacks.add(new Stack<>());
        System.out.print("set of stacks are initialised\n");
    }

    public void push(T element){

        Stack<T> stack = getLastStack();
        if(stack.size() == threshold){
            stack = new Stack<T>();
            stacks.add(stack);
        }
        stack.push(element);
    }

    public T peek(){

        Stack<T> stack = getLastStack();
        return stack.get(stack.size() - 1);
    }

    public T pop(){

        Stack<T> stack = getLastStack();
        T popped = stack.pop();
        if(stack.size() == 0) stacks.remove(stack);
        return popped;
    }

    public Stack<T> getLastStack(){
        int last = stacks.size() - 1;
        return stacks.get(last);
    }
}
