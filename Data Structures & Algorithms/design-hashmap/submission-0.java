class MyHashMap {
    public static int BUCKET_SIZE = 16;
    List<Node>[] buckets;

    public static class Node<K, V> {
        int key;
        int value;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new List[BUCKET_SIZE];
        for(int i = 0; i<BUCKET_SIZE; i++){
            buckets[i] = new ArrayList<>();
        }
    }

    public int hash(int key){
        return Math.floorMod(key, BUCKET_SIZE);
    }

    public void put(int key, int value) {
        List<Node> bucket = buckets[hash(key)];
        for(Node node : bucket){
            if(node.key == key){
                node.value = value;
                return;
            }
        }
        bucket.add(new Node(key, value));
    }
    
    public int get(int key) {
        List<Node> bucket = buckets[hash(key)];
        for(Node node: bucket){
            if(node.key == key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        List<Node> bucket = buckets[hash(key)];

        for(int i = 0; i < bucket.size(); i++){
            if(bucket.get(i).key == key){
                bucket.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */