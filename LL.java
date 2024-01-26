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
        while(temp != null) {

            System.out.print(temp.value + " --> ");
            temp = temp.next;

        }
        System.out.print(" END\n");

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

    public void insert(int value, int index) {

        try {

            if(index == 0) {
                insertFirst(value);
                return;
            } else if (index == size - 1) {
                insertLast(value);
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = new Node(value, temp.next);
            size++;

        } catch(NullPointerException e) {
            System.out.println("Index Out of Bounds!");
        }

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
