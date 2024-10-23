public class Solution {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.displayQueue();

		queue.enqueue(14);
		queue.displayQueue();

		queue.enqueue(22);
		queue.enqueue(-6);
		queue.dequeue();
		queue.dequeue();
		queue.displayQueue();

		queue.enqueue(9);
		queue.enqueue(20);
		queue.displayQueue();
	}
}
