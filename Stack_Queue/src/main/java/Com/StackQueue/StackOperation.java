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
	public void peek()
    {
        if (top == null)
        {
        	 System.out.println("Stack is Empty...");
        }
        System.out.println("\nTop Most Element in Stack : " + top.data);
    }

    public void pop()
    {
        if (top == null)
        {
        	 System.out.println("Stack is Empty... ");
        }
        System.out.println("Deleted Element : " + top.data);
        top = top.next;
    }
    public void isEmpty()
    {
        while (top != null)
        {
            peek();
            pop();
        }
        System.out.println("Stack is Empty...");
    }
	

}
