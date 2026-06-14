class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mins;

    public MinStack() {
        stack = new Stack<Integer>();
        mins = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (mins.isEmpty() || val <= mins.peek()) {
            mins.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.peek();
        stack.pop();
        if (top == mins.peek()) {
            mins.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return mins.peek();
    }
}
