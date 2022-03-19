class FreqStack {
        List<Stack<Integer>> stlist=null;
        Map<Integer,Integer> mp=null;

    public FreqStack() {
            stlist=new ArrayList<>();
            mp=new HashMap<>();
        
    }
    
    public void push(int val) {
            mp.put(val,mp.getOrDefault(val,0)+1);
            int freq=mp.get(val);
            if(freq-1 >= stlist.size()){
                    stlist.add(new Stack<Integer>());
            }
            stlist.get(freq-1).add(val);
        
    }
    
    public int pop() {
            int size=stlist.size();
            int x=stlist.get(size-1).pop();
            if(stlist.get(size-1).isEmpty()){
                    stlist.remove(size-1);
            }
            mp.put(x,mp.get(x)-1);
            if(mp.get(x)==0){
                    mp.remove(x);
            }
            return x;
            
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */