package Thread;

import java.util.Date;

public class SleepTest {
    public static void main(String[] args) throws Exception{
        for (int i=0;i<100;i++)
        {
            System.out.println("当前时间： "+new Date());
            //调用sleep()方法让当前线程暂停1s
            Thread.sleep(1000);
        }
    }
}
