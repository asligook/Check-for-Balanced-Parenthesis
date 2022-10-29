
package question;

public class ParanthesisChecker {
	

	public boolean isCorrect(String javaCode) { 
		
		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		// creating a new stack object to be able to use the methods of MyStack class in ParanthesisChecker class
		MyStack new_stack = new MyStack();
        int first_index = javaCode.indexOf('(');
        int sec_index = javaCode.indexOf('{');
        // the case that the one of the parenthesis type does not occur
        if ((first_index == -1) || (sec_index == -1)){
			// for loop to search for characters in the given java code string
			for (int i = 0; i < javaCode.length(); i++) {
				char my_char = javaCode.charAt(i);
			// if an opening parenthesis is encountered push it into the stack
				if ((my_char == '{') || (my_char == '(')){
					new_stack.push(my_char);
				}
				//System.out.println(new_stack);
			// if the stack is empty it means my push method did not work correctly
				if (new_stack.isEmpty()) {
					return false;
				 }
			// if a closing parenthesis is encountered use pop method and compare them if they match (according to their types '(' or '{')
				if ((my_char == '}') || (my_char == ')')) {
					char my_current = new_stack.pop();
					//System.out.println(my_current);
					if (my_char == '}'){
							if (my_current != '{'){
								return false;
							}
					}
					if (my_char == ')'){
						if (my_current != '('){
						return false;
						}
					}
				}
			}
			// if all the methods had correctly worked and the code parantheses were true the stack must be empty
			if (new_stack.isEmpty()) {
				return true;
			 }
			// else the stack is not empty at the end it means the parantheses were false
			else {
				return false;
			}
        }
            // the case that the code includes both types of parenthesis
			if((first_index != -1) && (sec_index != -1)){
				// for loop to search for characters in the given java code string
				for (int i = Math.min(first_index, sec_index); i < javaCode.length(); i++) {
					char my_char = javaCode.charAt(i);
				// if an opening parenthesis is encountered push it into the stack
					if ((my_char == '{') || (my_char == '(')){
						new_stack.push(my_char);
					}
					//System.out.println(new_stack);
				// if the stack is empty it means my push method did not work correctly
					if (new_stack.isEmpty()) {
						return false;
					 }
				// if a closing parenthesis is encountered use pop method and compare them if they match (according to their types '(' or '{')
					if ((my_char == '}') || (my_char == ')')) {
						char my_current = new_stack.pop();
						//System.out.println(my_current);
						if (my_char == '}'){
								if (my_current != '{'){
									return false;
								}
						}
						if (my_char == ')'){
							if (my_current != '('){
							return false;
							}
						}
					}
				}
			}
				// if all the methods had correctly worked and the code parantheses were true the stack must be empty
				if (new_stack.isEmpty()) {
					return true;
				 }
				// else the stack is not empty at the end it means the parantheses were false
				else {
					return false;
				}
		
		


		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
		
	}
	
}


