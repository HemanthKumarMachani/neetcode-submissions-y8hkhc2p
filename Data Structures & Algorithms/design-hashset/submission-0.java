class MyHashSet {
    private boolean [] key_storage;
    public MyHashSet() {
        key_storage = new boolean [1000001];
    }
    
    public void add(int key) {
        key_storage[key] = true;
    }
    
    public void remove(int key) {
        key_storage[key] = false;
    }
    
    public boolean contains(int key) {
        return key_storage[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */