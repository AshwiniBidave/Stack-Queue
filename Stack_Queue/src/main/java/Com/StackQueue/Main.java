package Com.StackQueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("****welcome to stack_queue********");

		QueueOperation queue=new QueueOperation();
		System.out.println("Linked List Queue are:");
		queue.Enqueue(70);
		queue.Enqueue(30);
		queue.Enqueue(56);
		queue.Display();


	}

}
