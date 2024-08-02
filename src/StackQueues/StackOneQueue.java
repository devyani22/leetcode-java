package StackQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackOneQueue {

    Queue<Integer> queue;
    StackOneQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Inserts an element on the top of the stack - LIFO manner
     * @param element
     */
    public void push(int element) {
        queue.add(element);
        // rotate the queue
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }

    /**
     * Deletes the top element from the stack and returns it
     * @return top element
     */
    public int pop() throws IllegalStateException {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        return queue.remove();
    }

    /**
     * Method returns the top element from the stack without deleting it
     * @return top element
     */
    public int top() throws IllegalStateException{
        if (queue.isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        return queue.peek();
    }

    /**
     * Method returns a boolean value to indicate if the stack is empty or not
     * @return t/f
     */
    public boolean isEmpty() {
        if(!queue.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        StackOneQueue stackOneQueue = new StackOneQueue();
        stackOneQueue.push(1);
        stackOneQueue.push(4);
        stackOneQueue.push(30);
        stackOneQueue.push(100);
        System.out.println(stackOneQueue.queue);

        System.out.println("popped from the top: " + stackOneQueue.pop());
    }
}
