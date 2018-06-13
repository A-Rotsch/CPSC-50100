import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static StringTree treeObject = new StringTree();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String words;
		Scanner fileScan, wordsScan;
		fileScan = new Scanner(new File("data.inp"));
		
		while (fileScan.hasNext())
		{
			words = fileScan.nextLine();
			treeObject.add(words);
		}
		
		
	}
	

}
