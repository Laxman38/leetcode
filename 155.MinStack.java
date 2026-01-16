class MinStack {
    Stack<Long> st;
    Long mini;
    
    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
    }
    
    public void push(long val) {
        if(st.isEmpty()){
            st.push(val);
             mini = val;
        }
        else{
            if(val >= mini){
                st.push(val);
            }
            else{
                st.push(2 * val - mini);
                mini = val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long top = st.peek();
        st.pop();
        if(top < mini){
            mini = 2 * mini - top;
        }
    }
    
    public long top() {
        if(st.isEmpty()) return -1;

        long top = st.peek();
        if(top >= mini) return top;
        return mini;
    }
    
    public long getMin() {
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */