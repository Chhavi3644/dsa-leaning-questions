class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class linkedList {
    public static void main(String[] args) {
        int []arr={2,5,6,8};
        Node head= converArrtoLL(arr);
        Node temp=head;
        System.out.println("presentat "+searchinll(head, 6));
        System.out.println("lengthodLinkedList "+lengthofll(head));
        while(temp.next!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println(temp.data);

        head = removefromk(head, 2);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

    }

    private static Node converArrtoLL(int[] arr) {
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i =1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return  head;
    }
    private static int lengthofll(Node head) {
       int count=0;
       Node temp=head;
       while(temp !=null){
           temp=temp.next;
           count++;
       }
       return  count;

    }
    private static int searchinll(Node head,int x) {
        int count=-1;
        Node temp=head;
        while(temp !=null){
            count++;
           if(temp.data==x){

               return count;
           }
           temp=temp.next;
        }
        return  0;

    }
    private static Node removehead(Node head) {
       if(head==null){
           return head;
       }
        head=head.next;
        return  head;

    }
    private static Node removefromk(Node head,int k) {
        if(head==null){
            return null;
        }
        if (k == 1) {
            Node temp=head;
            return head.next;
        }
        int count=1;
        Node temp=head;
        Node prev=null;
        while(temp!=null){

            if(count==k){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            count++;
        }
    return  head;
    }
}
