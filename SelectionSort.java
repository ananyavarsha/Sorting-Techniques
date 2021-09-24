//iterates through the array and finds the smallest number and swaps it with the first element if it is smaller than the first element
//Next it goes on to second element and so on until all elements are sorted.

public class SelectionSort {

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

    public void selectionsort() {
        Node current = head;
        // traverse the linked list
        while (current != null) {
            Node min = current;
            Node ref = current.next;
            // traverse the unsorted linked list and compare it to current node's element if
            // smaller set that node as min
            while (ref != null) {
                if (ref.data < min.data)
                    min = ref;
                ref = ref.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;
            current=current.next;
        }
    }

    public static void main(String[] args) {

        SelectionSort sort = new SelectionSort();
        sort.head = new Node(4);
        Node first = new Node(15);
        Node second = new Node(7);
        Node third = new Node(2);

        sort.head.next = first;
        first.next = second;
        second.next = third;

        sort.display();
        sort.selectionsort();
        sort.display();
    }
}
