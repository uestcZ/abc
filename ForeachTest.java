package Concurrent;

import java.util.Collection;
import java.util.HashSet;

//使用Foreach循环遍历集合元素
public class ForeachTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("java讲义");
        books.add("android讲义");
        for (Object obj : books)
        {
            //此处的book变量也不是集合元素本身
            String book = (String)obj;
            System.out.println(book);
            if (book.equals("java讲义"))
            {
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
