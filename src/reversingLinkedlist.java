import java.util.LinkedList;

public class reversingLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        LinkedList<Integer> rev=new LinkedList<>();
        System.out.println("Original list:");
        System.out.println(ls);
        while (!ls.isEmpty()){
            rev.add(ls.removeLast());
        }
        System.out.println("Reversed List: "+rev);

    }
}
