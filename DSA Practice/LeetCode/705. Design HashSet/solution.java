class MyHashSet {

    private ArrayList<Integer> keys = new ArrayList<Integer>();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if (!contains(key)){
            keys.add(key);
        }
    }
    
    public void remove(int key) {
        int ind = keys.indexOf(key);
        if (ind >= 0){
            keys.remove(ind);
        }
    }
    
    public boolean contains(int key) {
        //System.out.println(keys.toString());
        return keys.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */