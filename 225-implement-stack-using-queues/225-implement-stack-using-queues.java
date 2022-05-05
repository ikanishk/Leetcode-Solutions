import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    Queue<Integer> inputQueue;
    Queue<Integer> outputQueue;
    int top;

    public MyStack() {
        inputQueue = new ArrayDeque<>();
        outputQueue = new ArrayDeque<>();
    }

    public void push(int n) {
        inputQueue.add(n);
        top = n;
    }

    public int pop() {
        while (inputQueue.size() > 1) {
            top = inputQueue.poll();
            outputQueue.add(top);
        }
        // swap(inputQueue, outputQueue)
        Queue<Integer> temp = inputQueue;
        inputQueue = outputQueue;
        outputQueue = temp;

        return outputQueue.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return inputQueue.isEmpty();
    }
}
