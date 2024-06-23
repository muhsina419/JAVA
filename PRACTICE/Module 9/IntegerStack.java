import java.util.EmptyStackException;
import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;
    private int maxSize;

    public IntegerStack(int maxSize) {
        this.stack = new Stack<>();
        this.maxSize = maxSize;
    }

    public void push(int element) {
        if (stack.size() < maxSize) {
            stack.push(element);
        } else {
            System.out.println("Stack overflow. Cannot push more elements.");
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == maxSize;
    }
}
