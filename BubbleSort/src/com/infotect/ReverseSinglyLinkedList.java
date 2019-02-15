package com.infotect;

public class ReverseSinglyLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

		void display() {
			System.out.println(" " + data);
		}

	}


}
