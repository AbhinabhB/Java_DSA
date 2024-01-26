public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {this.size = 0;}

    public void display() {

        if(head == null){
            System.out.println("The Linked List is Empty!!");
            return;
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {

            System.out.print(temp.value + " --> ");
            temp = temp.next;

        }

    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;

    }

    public void insertLast(int value) {

        if(tail == null){insertFirst(value);return;}

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
