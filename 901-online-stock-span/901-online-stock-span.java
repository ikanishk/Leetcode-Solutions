class StockSpanner {
    
    Stack<Pair<Integer, Integer>> stack; 

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek().getKey()<=price) {
            span += stack.pop().getValue();
        }
        stack.push(new Pair<Integer, Integer>(price, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */