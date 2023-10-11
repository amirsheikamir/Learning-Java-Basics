import java.util.Stack;

public class intro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5); // insert elements into the stack using push 
        st.peek();  // it show last inserted elements. only if element present else  //-> if stack is empty is throws error empty stack exception.
        System.out.println(st.peek());
        // st.pop();   // deletes the last element and return the value.  // if not present it will also give an exception.
        System.out.println(st.pop() +"  element has been removed");

        System.out.println(st.empty()); //true because stack is empty pop removed the given element.

        // iterate over stack 
         st.push(5); 
          st.push(6); 
           st.push(7); 
            st.push(8); 
             st.push(9); 
              st.push(10); 
              st.remove(3);  // element on index 3 which 8 removed.
              while(!st.isEmpty()) {  // check stack is empty or not if elements are there it remove elements one by one and print the elements in stack 
                System.out.println(st.pop());
              }
    // another method to iterate 

    // while(!st.empty()) {
    //     System.out.println(st.peek());  // it prints last element on st.
    //     st.pop();    // it removes element and return 
    // }
    }
}
