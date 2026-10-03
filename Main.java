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

        System.out.println("----------------------------------------------------");


        // 02
        // Node reference variable
        System.out.println("Node reference variable");

        Node start = new Node(15);

        start.next = new Node(25);

        start.next.next = new Node(35);


        System.out.println(start.data);
        System.out.println(start.next.data);
        System.out.println(start.next.next.data);
        System.out.println("----------------------------------------------------");




        // 03
        // create Node
        Node1 a1 = new Node1(1);
        Node1 a2 = new Node1(2);
        Node1 a3 = new Node1(3);

        // connect Node
        a1.next = a2;
        a2.next = a3;

        // print Node
        System.out.println(a1.getValueIdNode1());
        System.out.println(a1.next.getValueIdNode1());
        System.out.println(a1.next.next.getValueIdNode1());
        System.out.println("----------------------------------------------------");














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


// 03
class Node1{

    private int data;
    Node1 next;

    public Node1(int data){
        this.data = data;

    }

    public int getValueIdNode1(){
        return this.data;
    }

}
