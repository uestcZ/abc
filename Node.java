package text2;

import java.util.Scanner;


public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node first = head;
        int arr[] = new int[5];
        Scanner sr = new Scanner(System.in);
        System.out.print("请输入一组数字： ");

        for (int i = 0; i < 5; i++) {
            int m = sr.nextInt();
            arr[i] = m;
        }

        for (int i = 0; i < 5; i++) {
            Node k = new Node(arr[i]);
            head.next=k;
            head=head.next;
        }

        System.out.print("链表输出为: ");

        for (Node p = first.next;p!=null;p=p.next)
        {

            if(p.next==null)
                System.out.print(p.value);
            else
                System.out.print(p.value+"->");
        }
    }
}