package problems.hashmap;

public class MyHashMap<K, V> {
    private final int DEFAULT_SIZE = 16;
    private final int MAX_SIZE = 1 << 30;
    private int size = DEFAULT_SIZE;
    private Node[] nodes;

    public MyHashMap() {
        this.nodes = new Node[DEFAULT_SIZE];
    }

    public MyHashMap(int size) {
        this.size = size;
        this.nodes = new Node[size];
    }

    public void put(K key, V value) {
        int ind = key.hashCode() % size;
        Node<K, V> kvNode = new Node<>(key, value);
        Node node = nodes[ind];
        if (node == null) {
            nodes[ind] = kvNode;
        } else {
            while (node.next != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            if (node.key == key) node.value = value;
            else node.next = kvNode;
        }
    }

    public V get(K key) {
        int ind = key.hashCode() % size;
        Node node = nodes[ind];
        while (node != null) {
            if (node.key == key) return (V) node.value;
            node = node.next;
        }
        return null;
    }
}
