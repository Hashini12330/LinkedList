public class Main{
    public static void main(String[] args) {

        // 01
        System.out.println("Linked List Implementation");

        // Node
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        // connecting the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // start from first
        Node p = n1;

        // Traverse the linked list
        while(p != null){
            System.out.println(p.data);

            p = p.next;

        }



    }   
}


// 01 
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}