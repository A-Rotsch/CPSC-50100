import java.util.LinkedList;



public class AlphabetLinkList {
	
	LinkedList<String> alphabetList1 = new LinkedList<String>();

	public AlphabetLinkList() 
	{
		//default constructor.
	}

public void enqueue(String string) {
	// TODO Auto-generated method stub
	
	if (alphabetList1.size()>10)
		{
		throw new RuntimeException("List is over 10");
		}
	else 
		{
		alphabetList1.addFirst(string);
		}
	
}

public String dequeue() {
	// TODO Auto-generated method stub
	
	if (alphabetList1.size()>10)
		{
		throw new RuntimeException("List is over 10");
		}
	else if (alphabetList1.size()==0)
		{
		throw new RuntimeException("Queue underflow");
		}
		
		return alphabetList1.removeLast().toString();
	
}
	
	
}
