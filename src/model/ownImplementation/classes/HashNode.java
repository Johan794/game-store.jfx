package model.ownImplementation.classes;

public class HashNode<K,V> {
    private K key;
    private V value;
    private HashNode<K,V> next;


    public HashNode() {
        this.key = null;
        this.value = null;
    }

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }
}