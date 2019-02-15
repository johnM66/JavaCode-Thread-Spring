package com.infotect;

public class CustomHashMapImpl<K, V> {

	Entry<K, V>[] table;
	private int capacity = 4;
	public int size = 0;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}

	}

	public CustomHashMapImpl() {
		table = new Entry[capacity];
	}

	public void put(K key, V value) {
		if (key == null)
			return;
		int index = hash(key);
		Entry<K, V> entry = new Entry<K, V>(key, value, null);
		if (table[index] == null) {
			table[index] = entry;
			size++;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[index];
			while (current != null) {
				if (current.key.equals(key)) {
					if (previous == null) {
						entry.next = current.next;
						table[index] = entry;
						size++;

					}
					else {
						entry.next = current.next;
						previous.next = entry;
					}
				}
				previous = current;
				current = current.next;


			}
			previous.next = entry;

		}

	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

}
