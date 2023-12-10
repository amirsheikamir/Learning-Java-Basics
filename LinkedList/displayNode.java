package LinkedList;

public class displayNode {
    // can we do it with recursion 
    static void displayRecurive(Node head) {
        if(head == null) return;

         System.out.print(head.data+" ");
        displayRecurive(head.next);
      //  System.out.print(head.data+" ");  print in reverse
    }

    // creating a class for node 
    static class Node {
        int data;
        Node next;
            // contructor to point 
        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }
    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
            Node temp = a;  // this is not new node this just points a ;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
            System.out.println();

            // call function of recursion 
        displayRecurive(a);
    }
}
