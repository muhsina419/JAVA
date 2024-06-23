public class TestIntegerStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5); // Creating a stack with maxSize 5

        for (int i = 0; i < 10; i++) {
            stack.push(i); // Pushing integers from 0 to 9 into the stack
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " "); // Popping elements until the stack is empty
        }
    }
}