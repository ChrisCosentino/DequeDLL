public class Deque<E> implements DLLDeque<E>{
	private Node<E> header;
	private Node<E> trailer;
	private int size;
	
	public Deque() {
		this.header = new Node<>(null, null,this.trailer);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(trailer);
		this.size = 0;
	}
	
	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public void addFirst(E item) {
		Node<E> newNode = new Node<>(item, null, null);
		 
		 if(isEmpty()) { //If the list is empty
			 this.header = newNode;
			 this.trailer = newNode;
			 newNode.setNext(null); 
			 newNode.setPrev(null);
		 }else { //If the list already has nodes in it
			 Node<E> prevHead = this.header;
			 prevHead.setPrev(newNode);
			 newNode.setNext(prevHead);
			 newNode.setPrev(null);	  
			 this.header = newNode;
		 }
		 this.size++;
	}

	@Override
	public void addLast(E item) {
		Node<E> newNode = new Node<>(item, null, null);
				 
		 if(isEmpty()) { //If the list is empty
			 this.header = newNode;
			 this.trailer = newNode;
			 newNode.setNext(null);
			 newNode.setPrev(null);
		 }else { //The list already contains nodes
			 Node<E> prevTrail = this.trailer;
			 prevTrail.setNext(newNode);
			 newNode.setPrev(prevTrail);
			 newNode.setNext(null);
			 this.trailer = newNode;
		 }
		 this.size++;
	}

	@Override
	public E removeFirst(){
		if(isEmpty()) { //list is empty throw null
			throw new NullPointerException();
		}
		
		Node<E> temp = this.header;
		this.header = this.header.getNext();
		this.size--;
			
		return temp.getElement();
	}

	@Override
	public E removeLast() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		
		Node<E> temp = this.trailer;
		this.trailer = this.trailer.getPrev();
		this.size--;
		
		return temp.getElement();
	}

	@Override
	public E first() {
		return this.header.getElement();
	}

	@Override
	public E last() {
		return this.trailer.getElement();
	}

	@Override
	public void printOutContent() {
		
		StringBuilder b = new StringBuilder("[");
		if(this.size > 0) {
			Node<E> n = this.header;
			b.append(n.getElement());
			n = n.getNext();
			while(n != null) {
				b.append(", ");
				b.append(n.getElement());
				n = n.getNext();
			}
		}else {
			b.append("empty");
		}
		b.append("]");
		System.out.println(b.toString());
	}
}
