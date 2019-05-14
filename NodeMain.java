import java.util.*;
import java.io.*;

class NodeMain{
	public static void main(String[] args) {
		// System.out.println("Please enter value to the list");
		// Scanner read = new Scanner();
		// String val = read.nextLine();

		Node1 obj = new Node1("3");

		// obj.add(val);
		obj.add("7");
		obj.add("9");

		obj.showNodes();
	}
}