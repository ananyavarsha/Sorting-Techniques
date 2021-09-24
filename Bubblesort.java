//the value of current node is compared with every 
//value from its next node till last and if the value is smaller than the current value, 
//then the values are swapped and in this way the least 
//value comes as current index.
//Time complexity: O(n ^ 2)
//
//Space complexity: O(1)

public class Bubblesort {

    private Node head;

    public static class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
            System.out.print(current.data + " -->");
        }
        System.out.println("null");
    }

    public void bubbleSort() {
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            while (nextNode != null) {
                if (current.data > nextNode.data) {
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;

        }
    }

    public static void main(String[] args) {

        Bubblesort sort = new Bubblesort();
        sort.head = new Node(4);
        Node first = new Node(15);
        Node second = new Node(7);
        Node third = new Node(2);
        Node fourth = new Node(8);

        sort.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        sort.display();
        sort.bubbleSort();
        sort.display();
    }
}
