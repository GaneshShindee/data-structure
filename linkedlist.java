import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Linked List is empty. Nothing to delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println(data + " deleted.");
        } else {
            System.out.println(data + " not found in the linked list.");
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Create");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Linked List created.");
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    myList.insert(data);
                    System.out.println(data + " inserted.");
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    int dataToDelete = scanner.nextInt();
                    myList.delete(dataToDelete);
                    break;
                case 4:
                    myList.display();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}