import java.util.*;
import java.io.*;

class Node1{
	Node1 tail;
	String value;

	Node1(String value){
		this.value = value;
	}

	void add(String value){
		Node1 n = this;
		while(n.tail != null){
			n =n.tail;
		}
		n.tail = new Node1(value); 
	}

	void showNodes(){
		Node1 n1 = this;
		while(n1.tail!=null){
			System.out.println("Node Value" + n1.value+"\n");
			n1 = n1.tail;
		}
		System.out.println(n1.value);
	}

}






























