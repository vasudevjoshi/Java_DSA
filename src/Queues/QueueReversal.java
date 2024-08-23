package Queues;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        // Add elements to the queue
        for(int i = 0; i < 5; i++) {
            q.add(i + 1);
        }
        
        // Stack to hold queue elements
        Stack<Integer> st = new Stack<>();
        
        // Move all elements from queue to stack
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        
        // Move all elements back from stack to queue
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        
        // Print queue elements
        System.out.println("Printing queue elements:");
        while(!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
