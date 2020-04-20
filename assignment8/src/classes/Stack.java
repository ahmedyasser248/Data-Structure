package classes;


	
	import classes.DLinkedList.Node;
	/**
	 * 
	 * @author Ahmed Yasser
	 * Class contain methods to use it with a stack.
	 * I used a double linkedlist to make a stack(from last assignment). 
	 */
	public class Stack implements IStack{
		public DLinkedList work=new DLinkedList();
		/**
		 * <p>
		 * This method is used to remove object from top of stack
		 * </p>
		 * @param None.
		 * @return Return object removed from top.
		 * @throws IllegalStateExceptionException if stack is empty.
		 * */
		@Override
		public Object pop() {
			if (work.isEmpty()) {
				throw new IllegalStateException("the stack is empty");
			}
		Object temp = work.head.element;
		work.remove(0);
		return temp;
		}
		/**
		 *<p>
		 *It return element at top of stack without removing it.
		 * </p>
		 * @param None
		 * @return Return element at the top of stack.
		 * @throws IllegalStateException when stack is empty
		 * */
		
		@Override
		public Object peek() {
		 if (work.isEmpty()) {
			 throw new IllegalStateException("the stack is empty");
		 }
		 	Object temp = work.head.element;
			return temp;
		}
		/**
		 * <p>
		 * This method is used to add element at top of stack
		 * </p>
		 * @param Object to be added.
		 * @return None
		 * 
		 * */
		@Override
		public void push(Object element) {
			work.add(0, element);
			
		}
		/**
		 * <p>
		 * Checks if stack is empty or not.
		 * </p>
		 * @param None
		 * @return True if stack is empty false if not.
		 * */
		@Override
		public boolean isEmpty() {
			return work.isEmpty();
		}
		/**
		 * <p>
		 * Return the size of stack.
		 * </p>
		 * @param None.
		 * @return Size of the stack.
		 * */
		@Override
		public int size() {
			return work.size();
		}
		/**
		 * <p>
		 * It is used to print stack
		 * </p>
		 * @param Stack to be printed.
		 * @return None.
		 * */
	    public  void print(Stack s) {
	    	if(work.head==null) {
	    		throw new RuntimeException("the stack is empty");
	    	}
	    	Node temp = work.head;
	    	while (temp != null) {
	    		System.out.println(temp.element);
	    		temp = temp.next;
	    	}
	    }
	   
	}
