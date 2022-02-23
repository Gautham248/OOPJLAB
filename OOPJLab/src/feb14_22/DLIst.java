package feb14_22;
import java.util.*;

class DoublyLinkedList {    

    //A node class for doubly linked list

    class Node{  

        int item;  

        Node previous;  

        Node next;  

         public Node(int item) {  

            this.item = item;  

        }  

    }  

    //Initially, head and tail is set to null

    Node head, tail = null;  

   

    //add a node to the list  

    public void addNode(int item) {  

        //Create a new node  

        Node newNode = new Node(item);  

        //if list is empty, head and tail points to newNode  

        if(head == null) {  

            head = tail = newNode;  

            //head's previous will be null  

            head.previous = null;  

            //tail's next will be null  

            tail.next = null;  

        }  

        else {  

            //add newNode to the end of list. tail->next set to newNode  

            tail.next = newNode;  

            //newNode->previous set to tail  

            newNode.previous = tail;  

            //newNode becomes new tail  

            tail = newNode;  

            //tail's next point to null  

            tail.next = null;  

        }  

    }  

    public void deleteNodes() {

    	int x = head.item;

        head = head.next;

        System.out.println("Element "+x +" got deleted");

   }

//print all the nodes of doubly linked list  

    public void printNodes() {  

        //Node current will point to head  

        Node current = head;  

        if(head == null) {  

            System.out.println("Doubly linked list is empty");  

            return;  

        }  

        System.out.println("Nodes of doubly linked list: ");  

        while(current != null) {  

            //Print each node and then go to next.  

            System.out.print(current.item + " ");  

            current = current.next;  

        }  

    }  

}
public class DLIst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList dll=new DoublyLinkedList();
		int ch;
		int item;
		System.out.println("--MENU DRIVEN DOUBLY LINKED LIST--");
		System.out.println("1.Insert at Beginning\n2.Delete from beginning\n3.Display all Nodes\n4.Exit\n");
		do {
		System.out.println("\nEnter the choice :");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the element: ");
			item=sc.nextInt();
			dll.addNode(item);
			break;
		case 2:
			dll.deleteNodes();
			break;
		case 3:
			dll.printNodes();
			break;
		case 4:
			default:
				System.out.println("Invalid operation");
			
			
		}
		}while(ch!=4);
		
		
	}

}
