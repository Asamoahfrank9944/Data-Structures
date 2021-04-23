public class Mainclass {
    public static void main(String[] args) {

        // create instance of linked list
        LinkedList List = new LinkedList();


        //Add nodes to the list
        List.addNode(8);
        List.addNode(10);
        List.addNode(12);
        List.addNode(16);
        List.addNode(9);
        List.addNode(14);

        //Displays the nodes present in the list
        List.display();

        //begin node with 15
        List.addAtStart(15);

        List.display();

        //Displays the nodes present after 9 has been removed
        List.deleteNode(9);
        System.out.println("\nList After node 9 has been deleted");
        List.display();

        //Displays the list after inserting 30 after node 10
        List.insertAfter( lList.head.next.next, 30);
        System.out.println("\nList after inserting 30 after node 10");

        List.display();

        //append 45 at the end
        List.insertAtEnd(45);
        System.out.println("\nList after inserting 30 after node 10");
        List.display();


    }
}