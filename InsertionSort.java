//mainly pick, compare and insert
//compare the elements to ites predecessors
//if the key element us smaller than its predecessors, compare it to the elements before. 
//Move the greater element one position up to make space for the swapped element

public class InsertionSort {

    private Node head;
    Node sorted;

    public static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertionSort(Node headref) {
        sorted = null;
        Node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null) {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }

    // sorted linked list is maintained and compared and data is inserted
    public void sortedInsert(Node newnode) {
        if (sorted == null || head.data >= newnode.data) { // sorted is null or only one node
            newnode.next = sorted;
            sorted = newnode;
        } else {
            Node current = sorted;
            while (current.next != null && current.next.data <= newnode.data) { // iterate through sorted until the data
                                                                                // in sorted is less than current data
                current = current.next;
            }
            newnode.next = current.next;// break the chain and insert in the middle
            current.next = newnode;
        }
    }

    public static void main(String[] args) {

        InsertionSort sort = new InsertionSort();
        sort.head = new Node(4);
        Node first = new Node(15);
        Node second = new Node(7);
        Node third = new Node(2);

        sort.head.next = first;
        first.next = second;
        second.next = third;

        sort.display();
        sort.insertionSort(sort.head);
        sort.display();
    }
}
