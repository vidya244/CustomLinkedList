class Node{

	Node tail;
	String val;

	Node(String val){
		this.val = val;
	}

	void setVal(String val){
		this.val = val;
	}

	String getVal(){
		return this.val;
	}

	void add(String val){
		Node node = this;
		while(node.tail != null){
			node = node.tail;
		}
		node.tail = new Node(val);
	}

	void showNodes(){
		Node n = this;
		while(n.tail != null){
			System.out.print(n.val + " --> ");
			n = n.tail;
		}
		System.out.println(n.val);
	}
}