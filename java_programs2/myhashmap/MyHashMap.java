package myhashmap;

import java.util.Objects;

public class MyHashMap<K, V> {
	
	private static final int DEFAULT_CAPACITY = 16; // power of two
	private static final float LOAT_FACTOR = 0.75f;
	
	private static class Node<K, V>{
		final int hash;
		final K key;
		V value;
		Node<K, V> next;
		
		Node(int hash, K key, V value, Node<K, V> next){
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private Node<K, V>[] newTable(int capacity){
		return (Node<K,V>[]) new Node[capacity]; 
	}
	
	private Node<K, V>[] table;
	private int size;
	private int threshold;
	
	public MyHashMap() {
		this(DEFAULT_CAPACITY);
	}
	
	public MyHashMap(int initialCapacity) {
		int cap = 1;
		while (cap < initialCapacity) cap <<= 1;
		table = newTable(cap);
		threshold = (int)(cap * LOAT_FACTOR);
	}
	
	public int hash(Object key) {
		int h = (key == null) ? 0 : key.hashCode();
		 // spread higher bits to lower to reduce collisions
		h ^= (h >>> 16);
		return h;
	}
	
	private int indexFor(int hash, int length) {
		return (length - 1 ) & hash;
	}
	
	public int size() { return size;}
	public boolean isEmpty() { return size == 0;}
	
	public V put(K key, V value) {
		return putVal(hash(key), key, value);
	}
	
	public V putVal(int hash, K key, V value) {
		int i = indexFor(hash, table.length);
		for(Node<K, V> e = table[i]; e != null; e =e.next) {
			if(e.hash == hash && Objects.equals(e.key, key)) {
				V old = e.value;
				e.value = value;
				return old;
			}
		}
		
		//insert new node
		table[i] = new Node<>(hash, key, value, table[i]);
		++size;
	//	if(++size > threshold) resize();
		return null;
	}
	
	public V get (Object key) {
		int h = hash(key);
		int i = indexFor(h, table.length);
		for (Node<K, V> e = table[i]; e != null; e = e.next) {
			if(e.hash == h && Objects.equals(e.key, key)) {
				return e.value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key) {
		int h = hash(key);
		int i = indexFor(h, table.length);
		for(Node<K, V> e = table[i]; e != null; e = e.next) {
			if(e.hash == h && Objects.equals(e.key, key)) return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
		
		myHashMap.put(3, "Vaibhav");
		myHashMap.put(1, "Sarang");
		myHashMap.put(2, "Shailesh");
		myHashMap.put(4, null);
		
		System.out.println(myHashMap.containsKey(5));
	}

}
