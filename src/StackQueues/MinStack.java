package StackQueues;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        // check to see if the top of the stack is the current min, need to remove it from both places
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        // Provide the most recently added element to the stack, regardless of its value
        return stack.peek();    // (so from stack and not minStack)
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}

/**
 * minStack keeps track of the minimum elements up to the current state of Stack
 * When pushing, if the new element is smaller than the current minimum then it needs to be pushed to minStack.
 * When popping, if the current minimum is popped, then it needs to be popped from both the places.
 */
