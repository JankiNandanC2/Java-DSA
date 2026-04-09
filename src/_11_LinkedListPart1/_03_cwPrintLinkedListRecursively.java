package _11_LinkedListPart1;

public class _03_cwPrintLinkedListRecursively {
    public static  void print(Node Head){
        Node temp = Head ;
        while( temp != null ){
            System.out.println(temp.val);
            temp = temp.next ;
        }
        System.out.println();
    }
    public static  void printRecursive(Node Head){
        if(Head == null ) return ;
        System.out.println(Head.val);
        printRecursive(Head.next);
    }
    public static  void printReverse(Node Head){
        if(Head == null ) return ;
        printReverse(Head.next);
        System.out.println(Head.val);
    }
    static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // linking of nodes
        a.next = b ; // linking =>  a -> b
        b.next = c ; // linking =>  a -> b -> c
        c.next = d ; // linking =>  a -> b -> c -> d
        d.next = e ; // linking =>  a -> b -> c -> d -> e
    // normal print
         print(a);
    // print recursive
        printRecursive(a);
    // print reverse order
        System.out.println();
        printReverse(a);
    }
}
