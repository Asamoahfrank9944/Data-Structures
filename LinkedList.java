 class LinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //These represent the head and tail of the linked list
    Node head = null;
    Node tail = null;


    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);



        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            // if the node is not null

            tail.next = newNode;

            //newNode
            tail = newNode;
        }
    }
    //push node at the front
    public void addAtStart(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //Node temp will point to head
            Node temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
        }
    }
    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node initial= head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of the linked list are: ");
        while(initial != null) {
            //Prints each node by incrementing pointer
            System.out.print(initial.data + " ");
            initial = initial.next;
        }
        System.out.println();
    }

    public void push(int newdata){
        Node newnode =new Node(newdata);
        newnode.next=head;
        head=newnode;
    }
    public void insertAfter(Node prevnode, int data){

        if(prevnode ==null){
            System.out.println("The given node cannot be null");
            return;
        }
        Node newnode=new Node(data);
        newnode.next=prevnode.next;
        prevnode.next=newnode;

    }

    public void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void insertAtEnd(int data){

        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;

    }
}