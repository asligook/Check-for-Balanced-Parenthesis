
package question;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.junit.platform.commons.util.ToStringBuilder;


public class MyStack{
	
	private Character[] a; // array of items
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	int top =-1;
	// creating MyStack
	public MyStack() {
		a = new Character[4];
	}
	// checking whether the stack is empty or not
	public boolean isEmpty() {
		boolean empty = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				empty = false;
				break;
			}
		}
	    return empty;
	}
	
	// method prints the size of the stack
	public int size() {;
		return a.length;
	}
	
	// to be able to push more elements resizing(doubling) the stack
	private void resize() {
		Character[] new_arr = new Character[8];
		for(int i=0; i< size(); i++) {
			new_arr[i] = a[i];
		}
		a = new_arr;
	}
	
	//pushing a char item 
	public void push(char item) {
		if (top != a.length-1) {
			a[++top] = item;
		}
		else {
			resize();
			a[++top] = item;
		}
	}
	public char pop() {
		 char my_item = a[top];
		 a[top--] = null;
	     return my_item;
	}
	// searching for an element
	public char peek() {
		return a[top];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(a);
	}
	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

