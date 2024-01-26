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

    public Node find(int value) {

        Node temp = head;
        while(temp != null) {

            if(temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public Node get(int index) {

        if(size < index &&  index < 0) {
            System.out.println("Index out of bounds!");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public int deleteFirst() {

        if(head == null) {
            System.out.println("The Linked List is Empty!");
            return -1;
        }

        int removed_value = head.value;
        head = head.next;
        if(head == null) { tail = null; }
        size--;
        return removed_value;

    }

//    public int deleteLast() {
//
//        if(size <= 1) {
//            return deleteFirst();
//        } else {
//            Node
//            int removed_value = tail.value;
//
//            return removed_value;
//        }
//
//    }

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
