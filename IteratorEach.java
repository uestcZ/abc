package Concurrent;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java讲义");
        books.add("android讲义");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        //使用Lambda表达式(目标类型是Comsumer)来遍历整个集合元素
        it.forEachRemaining(obj ->System.out.println("迭代元素集合为："+obj));
    }
}
