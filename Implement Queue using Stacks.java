class MyQueue {
    
    Stack<Integer> input;
    Stack<Integer> output;
    
    public MyQueue(){
        this.input = new Stack<Integer>();
        this.output = new Stack<Integer>();
    }
    
    // Push element x to the back of queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        output.pop();
    }

    // Get the front element.
    public int peek() {
        if (output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return input.empty()&&output.empty();
    }
}