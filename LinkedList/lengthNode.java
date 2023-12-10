package LinkedList;

public class lengthNode {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
// using recursive call we have found the length of Linkedlist

    static int findLenofNode(Node head) {
        if (head == null) return 0;
    

       int count =  findLenofNode(head.next);
       count++;
        return count;
    }

   public static void main(String[] args) {
    
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node (6);
    Node g = new Node (7);
    a.next = b;
    b .next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;


    Node temp = a;
    int cnt = 0;
    while (temp != null) {
        cnt++;
        temp = temp.next;
    }
    // this is simple way to do 
    System.out.println(cnt);
    // this call for recursion function 
    System.out.println(findLenofNode(a));
   } 
}
