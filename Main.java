package misClases;
import java.util.HashSet;
import java.util.Set
public static void mostrarLista(Node head){
        Node ptr = head;
        while (ptr != null){
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
     public static Node borrarRepetidos(Node head)
    {
        Node previous = null;
        Node current = head;
 
       
        Set<Integer> set = new HashSet<>();
         while (current != null) {
            // if the current node is seen before, ignore it
            if (set.contains(current.data)) {
                previous.next = current.next;
            }
            else {
                // insert the current node into the set and proceed to the next node
                set.add(current.data);
                previous = current;
            }
            current = previous.next;
        }
 
        return head;
    }
 public static void main(String[] args)
    {
        // input keys
        int[] keys = {5, 3, 4, 2, 5, 4, 1, 3};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        BorrarRepetidos(head);
 
        // print linked list
        mostrarLista(head);
    }
}
