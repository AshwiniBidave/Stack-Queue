package Com.StackQueue;

public class QueueOperation {
	Node head = null;
	public void Enqueue(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            this.head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void Dequeue()
    {
        if (head == null)
        {
            System.out.println("Queue is Empty...");
        }
        else
        {
            head = head.next;
        }
    }

    public void Display()
    {
        Node temp = this.head;
        if (temp == null)
        {
        	System.out.println("Queue is Empty...");
            return;
        }
        while (temp != null)
        {
        	System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }


}
