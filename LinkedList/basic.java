package LinkedList;

class Node {  // blueprint of node object
    int data;
    Node next;
    // this is the constructor.
     Node(int data) {
        this.data = data;
        next = null;
     }

    public static int nodeLength(Node head) {

        if (head == null) {
            return 0;
        }
            int count = 0;
            Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
     }

}
public class basic {
    public static void main(String[] args) {
     
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
         a.next = b;
         b.next = c;
       
        System.out.println(a.next.data);
        System.out.println(a.nodeLength(a));

    }
}
