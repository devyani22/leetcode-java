package StackQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDequeImpl {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Stack<Integer> stack = new Stack<>();  // legacy and sync don't use

        stack.push(1);
        stack.push(4);
        stack.push(30);
        stack.push(100);

        System.out.println("Complete stack: " + stack);

        System.out.println("Item at the top of the stack: "+ stack.peek());

        stack.pop();
        System.out.println("After deleting element on top: " + stack);

    }
}
