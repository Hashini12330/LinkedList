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



        // 04
        // practice: 01
        Node1 start1 = new Node1(100);
        start1.next = new Node1(200);
        start1.next.next = new Node1(300);

        // dis value
        System.out.println(start1.getValueIdNode1());
        System.out.println(start1.next.getValueIdNode1());
        System.out.println(start1.next.next.getValueIdNode1());
        System.out.println("----------------------------------------------------");



        // 05
        // with while loop
        // create linked list
        Node1 start2 = new Node1(1000);

        start2.next = new Node1(2000);
        start2.next.next = new Node1(3000);

        Node1 p1 = start2;

        // traverse the linked list
        while(p1 != null){
            System.out.println(p1.getValueIdNode1());

            p1 = p1.next;
        }
        System.out.println("----------------------------------------------------");
        


        // for loop
        for(Node1 p2 = start2; p2 != null; p2 = p2.next){
            System.out.println(p2.getValueIdNode1());

        }
        System.out.println("----------------------------------------------------");

        


        // 06
        // create sortedList object
        sortedList list = new sortedList();

        // check whether the list is empty
        System.out.println("Is list Empty: " + list.isEmpty());

        // insert some Nodes manually
        list.first = new Node2(30.5);
        list.first.next = new Node2(10.5);
        list.first.next.next = new Node2(20.5);

        // dis the list
        System.out.println("Linked List:");

        Node2 current = list.first;


        // using while loop
        while(current != null){
            current.dis();
            current = current.next;
        }
        System.out.println();   
        System.out.println("################################");

        // using for loop
        for (Node2 p3 = list.first; p3 != null; p3 = p3.next) {
            System.out.println(p3.dData);
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




// 06
class Node2{
    public double dData;
    public Node2 next;  // points to the next Node2

    public Node2(double dd){
        dData = dd;
    }

    public void dis(){
        System.out.println(dData + " ");
    }

}


class sortedList{
    public Node2 first;

    public sortedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }


}