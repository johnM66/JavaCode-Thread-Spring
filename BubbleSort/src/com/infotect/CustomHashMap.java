package com.infotect;

public class CustomHashMap<K, V> {
	private Entry<K, V>[] table;
	private int capacity = 4;

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

	public CustomHashMap() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V newValue) {
		if (newKey == null) {
			return;
		}
		int hash = hash(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue, null);
		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(newKey)) {
					if (previous == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}

	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> entry = table[hash];
			while (entry != null) {
				if (entry.key.equals(key)) {
					return entry.value;
				}
				entry = entry.next;
			}
			return null;
		}
	}

	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode()) % capacity;
	}

}
