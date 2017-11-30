package text2;

public class LNode {
    private int data;
    private LNode next;

    public LNode(int value)
    {
        data = value;
        next =null;
    }

    public static void main(String[] args) {
        LNode head = new LNode(1);
        LNode second = new LNode(2);
        LNode third = new LNode(3);
        head.next=second;
        second.next=third;
        for(LNode p =head;p!=null;p=p.next)
        {
            if(p.next==null)
                System.out.print(p.data);
            else
                System.out.print(p.data+"->");
        }

    }

}
