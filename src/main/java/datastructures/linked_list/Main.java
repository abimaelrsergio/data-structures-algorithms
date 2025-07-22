package datastructures.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);



        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        System.out.println("--------------------");
        LinkedList.Node node = myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println("Node = " + node.value);
    }
}
