//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Node nd = new Node(20);

        nd.next=null;
        System.out.println(nd.data+" "+nd.next);
        Node nd2 = new Node(30);
        nd.next=nd2;
        System.out.println(nd.data+"->"+nd.next.data);

        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.Display();
        ll.addLast(40);
        ll.Display();
        System.out.println();
        ll.addAt(50,2);
        ll.Display();
        System.out.println();
        System.out.println(ll.getFirst());
        System.out.println();
        System.out.println(ll.getLast());
        System.out.println();
        ll.RemoveFirst();
        ll.Display();
        System.out.println();
        ll.RemoveLast();
        ll.Display();

        LinkedList list = new LinkedList();

        int[] values = {141,302,164,530,474};

        for(int value : values) {
            list.insertAtTail(value);
        }

        list.printList();

        LinkedList li=new LinkedList();

       li.insertAtTail(16);
       li.insertAtTail(13);
       li.insertAtTail(7);

        System.out.println("Initial List:");
        li.printList();

        li.insertAtPosition(1,2);

        System.out.println("Updated List:");
        li.printList();*/

        LinkedList list = new LinkedList();

        int[] values = {1,2,3,4,5};

        for(int value : values) {
            list.insertAtTail(value);
        }
        System.out.println("Original List: ");
        list.printList();

        list.reverse();

        System.out.println("Reversed List: ");
        list.printList();

    }
}