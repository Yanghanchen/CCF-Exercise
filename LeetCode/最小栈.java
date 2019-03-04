class MinStack {
    Stack<Integer> stack;
    int minValue=Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        minValue=x<minValue?x:minValue;
    }

    public void pop() {
        int x = stack.pop();
        if(x==minValue){
            minValue=Integer.MAX_VALUE;
            Iterator<Integer> it = stack.iterator();
            while(it.hasNext()){
                int y = it.next();
                minValue=y<minValue?y:minValue;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue;
    }
}