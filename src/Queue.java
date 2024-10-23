public class Queue {
	public Node front;
	public Node rear;

	public Queue() {
		front = null;
		rear = null;
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (front == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		rear.next = front;
	}

	public void dequeue() {
		if (front == null) {
			return;
		}
		if (front == rear) {
			front = rear = null;
			return;
		}
		front = front.next;
		rear.next = front;
	}

	public void displayQueue() {
		if (front == null) {
			System.out.println("Queue is empty.");
			return;
		}
		if (front == rear) {
			System.out.println("Queue has 1 element: " + front.data);
			return;
		}
		System.out.println("Elements in the queue:");
		Node temp = front;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != front);
	}
}
