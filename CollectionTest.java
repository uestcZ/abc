package Concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里不能放基本类型的值，但java支持自动装箱
        c.add(6);
        System.out.println("c集合的元素个数为："+c.size());
        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为："+c.size());
        //判断是否包含指定字符串
        System.out.println("c集合是否包含“孙悟空” : " +c.contains("孙悟空"));
        c.add("java讲义");
        System.out.println("c的元素为："+c);

        Collection books = new HashSet();
        books.add("java讲义");
        books.add("android讲义");
        //使用forEach()方法遍历集合
        books.forEach(obj ->System.out.println("元素集合： "+obj));
        System.out.println("c集合是否包含books集合"+c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合的元素"+c);
        //删除c集合里所有的元素
        c.clear();
        System.out.println("c集合的元素"+c);
        //控制books集合只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素"+books);
    }
}
