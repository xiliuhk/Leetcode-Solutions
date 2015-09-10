class MinStack {
    private Stack<Integer> stk; 
    
    public MinStack(){
        this.stk = new Stack<Integer>();     
    }
    
    public void push(int x) {
        int min = Integer.MAX_VALUE; 
        if (!this.stk.isEmpty()){
            min = Math.min(this.stk.peek(), x); 
        }
        this.stk.push(x); 
        this.stk.push(Math.min(min, x)); 
    }

    public void pop() {
        if (this.stk.isEmpty()){
            return; 
        }
        int min = this.stk.pop(); 
        int top = this.stk.pop(); 
    }

    public int top() {
        if (this.stk.isEmpty()){
            return -1; 
        }
        int min = this.stk.pop(); 
        int top = this.stk.peek(); 
        this.stk.push(min); 
        return top; 
    }

    public int getMin() {
        if (this.stk.isEmpty()){
            return Integer.MAX_VALUE; 
        }
        return this.stk.peek(); 
    }
}
