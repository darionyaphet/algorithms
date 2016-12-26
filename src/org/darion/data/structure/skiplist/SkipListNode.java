package org.darion.data.structure.skiplist;

public class SkipListNode<K, V> {
    private K key;
    private V val;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "SkipListNode{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }
}
