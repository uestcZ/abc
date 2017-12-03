package Concurrent;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java讲义");
        books.add("android讲义");
        Iterator it = books.iterator();
        while (it.hasNext())
        {
            //it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("android讲义"))
            {
                //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量测量，不会改变集合元素本身
//            book = "测试字符串";
        }
        System.out.println(books);
    }
}
