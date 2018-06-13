import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;

public class StringTree {
			

	private Node tree;
	

	
	public void add(String words) 
	{
		Node tree = new Node(words);
		
		if(tree==null)
		{
			tree = words;
		}
		else
		{
			 System.out.println("didnt work");
		}
	}


}
