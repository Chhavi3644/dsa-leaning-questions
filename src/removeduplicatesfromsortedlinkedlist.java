import java.util.Iterator;
import java.util.LinkedList;
public class removeduplicatesfromsortedlinkedlist {
    public static void main(String[] args) {
    LinkedList<Integer> ls=new LinkedList<>();
    ls.add(10);
    ls.add(20);
    ls.add(30);
    ls.add(30);
    ls.add(40);
    ls.add(50);
    System.out.println("original:"+ls);
    removedup(ls);
    System.out.println("After:"+ls);
    }

    private static void removedup(LinkedList<Integer> ls) {
    if(ls==null || ls.size() <2) return;
        Iterator<Integer> it= ls.iterator();
        Integer prev=it.next();
        while (it.hasNext()){
            Integer curr=it.next();
            if(prev.equals(curr)){
                it.remove();
            }else{
                prev=curr;
            }
        }

    }
}
