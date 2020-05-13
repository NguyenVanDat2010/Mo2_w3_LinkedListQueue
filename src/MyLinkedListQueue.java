public class MyLinkedListQueue {
    private Node head;      //nốt đầu
    private Node tail;      //nốt đuôi

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public class Node {
        public int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    //Chèn dữ liệu vào trong hàng đợi
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;       //Khởi tạo =null là tạo 1 ô mới =head=tail
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    //Xóa 1 phần tử trong hàng đợi
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
