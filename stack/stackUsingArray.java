
import java.util.*;

import recursion.sumOfNums;
public class stackUsingArray {
   
       private int[] data;
       private int top;  // is the index of top most slement of stack
   
    public stackUsingArray() { // create a constructor of stack array
        data = new int[10];
        top = -1;       // stack is empty that's why we write -1 there a no index like -1
    }
     public stackUsingArray(int capacity) { // create a constructor of stack array
        data = new int[capacity];  // this time size is not given we give a size
        top = -1;       // stack is empty that's why we write -1 there a no index like -1
    }
   public boolean isEmpty() { // create a constructor to check stack is empty or not
      return (top == -1);
        
    }
    public int size(){
        return top+1;
    }

    public int top(){
        if(size() == 0){
            // StackEmptyExecption
            System.out.println("StackEMpty Exception");
        }
        return data[top];
    }

    public void push(int element) {
        if(size() == data.length){
            System.out.println("Stack Full Excetion Error");
        }
        top++;
        data[top] = element;
    }
    public int pop() {

        if (size() == 0) {
            System.out.println("fuckedUp");
        }
 int temp = data[top];
        top--;
        return temp;
    }
 public static void main(String[] args) { 
      stackUsingArray st = new stackUsingArray();
      for (int i = 0; i < 5; i++) {
        st.push(i);
      } 

      while(st.isEmpty()) {
        System.out.println(st.pop()); 
      }
 }
  }
