class MyHashSet {
    List<Integer> ll;
    public MyHashSet() {
            ll=new LinkedList<>();
            
        
    }
    
    public void add(int key) {
            if(!ll.contains(key)){
            ll.add(key);
            }
        
    }
    
    public void remove(int key) {
            ll.remove(new Integer(key));
            
        
    }
    
    public boolean contains(int key) {
            // System.out.println(ll);
            boolean ans=ll.contains(key);
            return ans;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */