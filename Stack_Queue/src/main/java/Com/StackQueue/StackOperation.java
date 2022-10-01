package Com.StackQueue;

public class StackOperation {
	Node top = null;
	public void push(int value)
    {
        Node node = new Node(value);
        if (top == null)
        {
            node.next = null;
        }
        else
        {
            node.next = top;
        }
        top = node;

    }
	public void Display()
    {
        Node temp = top;
        while (temp != null)
        {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }
	

}
