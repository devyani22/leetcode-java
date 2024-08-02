package StackQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackTwoQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    StackTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /**
     * Implement push using 2 queues
     * @param x
     */
    public void push(int x) {
        queue2.add(x);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /**
     * Pops the top element
     * @return
     */
    public Integer pop() {
        return queue1.remove();
    }

    public Integer top() {
        return queue1.peek();
    }

    public static void main(String[] args) {

        StackTwoQueues stackAsQueue = new StackTwoQueues();
        stackAsQueue.push(1);
        stackAsQueue.push(4);
        stackAsQueue.push(30);
        stackAsQueue.push(100);
        System.out.println(stackAsQueue.queue1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(4);
        queue.add(30);
        queue.add(100);
        System.out.println("Fifo demo:" + queue);



    }
}
