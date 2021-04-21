import java.util.NoSuchElementException;
class Family {
    private ListNode head;
    private ListNode tail;
    private int length;

    //Family Constructor
    public Family(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
public class ListNode {


        // List node class

            private String data;
            private ListNode next;
            private ListNode previous;

            //List node constructor
            public ListNode(String data){
                this.data = data;
            }
        }

        //Check if list is empty
        public boolean isEmpty(){
            return length == 0;
        }

        //Get list length
        public int getLength(){
            return length;
        }


        //Display from head to tail
        public void displayForward(){
            if(head == null){
                return;
            }

            ListNode temp = head;
            while (temp != null){
                System.out.print(temp.data + " ----> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        //Display from tail to head
        public void displayBackward(){
            if(tail == null){
                return;
            }
            ListNode temp = tail;

            while (temp!= null){
                System.out.print(temp.data + " ----> ");
                temp = temp.previous;
            }
            System.out.println("Null");
        }

        //Insert element at the front
        public void insertFirst(String value){
            ListNode newNode = new ListNode(value);
            if(isEmpty()){
                tail = newNode;
            }
            else {
                head.previous= newNode;
            }

            newNode.next = head;
            head = newNode;
            length++;

        }

        //Insert Element at the end
        public void insertLast(String value){
            ListNode newNode = new ListNode(value);
            if(isEmpty()){
                head = newNode;
            }
            else {
                tail.next = newNode;
            }
            newNode.previous = tail;
            tail = newNode;
            length++;
        }

        //Insert after a particular element
        public void insertAfter(String data,int position){
            if(head == null){
                return;
            }
            ListNode temp = head;
            int i  = 1;

            while(i < position){
                temp = temp.next;
                i++;
            }

            if(temp.previous == null){
//            ListNode newNode = new ListNode(data);
//            temp.previous = newNode;
//            head =newNode;
                insertFirst(data);
            }
            else{

                ListNode newNode = new ListNode(data);
                newNode.previous = temp.previous;
                newNode.next = temp;
                temp.previous.next = newNode ;

                length++;


            }



        }


        //Delete the first element
        public ListNode deleteFirst(){
            if(isEmpty()){
                throw new NoSuchElementException();
            }
            ListNode current = head;
            if(head == tail){
                tail = null;
            }else
            {
                head.next.previous = null;
            }
            head = head.next;
            current.next = null;
            length--;
            return current;

        }

        //Delete the last element
        public ListNode deleteLast(){
            if(isEmpty()){
                throw new NoSuchElementException();
            }
            ListNode current = tail;
            if(tail == head){
                head = null;
            }
            else{
                tail.previous.next = null;
            }
            tail = tail.previous;
            current.previous = null;
            length--;
            return  current;
        }

        //Delete element at a particular index
        public void deleteAt(int position){
            if(head == null){
                return;
            }

            ListNode temp = head;
            int i = 1;
            while(i < position){
                temp = temp.next;
                i++;
            }
            if(temp.next == null){
                temp.previous.next = null;
            }
            else if(temp.previous == null){
                temp = temp.next;
                temp.previous = null;
                head = temp;
            }
            else{
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
            }
            length--;
        }


        public static void main(String []args){
            Family list = new Family();
            list.insertLast("Mr.Osei Tutu");
            list.insertLast("Mr.Agya Kwame");
            list.insertFirst("Mr.Kwame Atta");
            list.insertLast("Mr.osei Owusu");
            list.insertLast("Mr.Asamoah Samuel");
            list.insertLast("Mr.Asamoah Frank");
            list.displayForward();
            list.deleteFirst();
            list.displayForward();
            list.insertAfter("Mr.Okyere Richard",3);
            list.displayForward();
            list.deleteAt(3);
            list.displayForward();
            list.displayBackward();
        }

    }

