package DataStructure_Practice.linkedlist;

public class reverse {
    static Node head;

    public static void main(String[] args) {
        reverse rv = new reverse();
        System.out.println("old array is ");
        head = new Node(50);
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);

        rv.print(head);
        head = rv.play(head);
        System.out.println();
        System.out.println("Reversed linked list ");

        rv.print(head);

    }

    Node play(Node node) {
        Node prev = null;
        Node next = null;
        Node current = node;
        while (current != null) {
            next = current.next;// take a next of current node
            current.next = prev;// breakes the link of current node and point towards the privous node
            prev = current;// now makes the privous node a itself so that next node can point to this as above
            current = next;//now the next on line is current so that can start whole process
        }
        node = prev;// make the last node as head at the end
        return node;
    }

    void print(Node pnode) {
        //Node pnode=head;

        while (pnode != null) {
            System.out.print(pnode.data + " ");
            pnode = pnode.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}