package com.sdet.practice;

public class LinkedListDemo {

	public static void main(String[] args) {

		Node node = new Node(10);
		node.next = new Node(20);
		node.next.next = new Node(30);

		reverseLinkedList(node);
	}

	public static void traverseLinkedList(Node head) {

		if (head != null) {

			Node current = head;

			while (current != null) {
				System.out.println(current.getData());
				current = current.next;
			}
		}
	}

	public static void reverseLinkedList(Node head) {

		if (head != null) {

			Node current = head;
			Node next = null;
			Node prev = null;

			while (current != null) {

				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}

			traverseLinkedList(prev);
		}
	}
}