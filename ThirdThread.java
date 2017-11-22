package Thread;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread{
    public static void main(String[] args) {
        //创建Callable对象
        ThirdThread rt = new ThirdThread();
        //先使用Lambda表达式来创建Callable<Integer>对象
        //使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
           int i =0;
           for (;i<100;i++)
           {
               System.out.println(Thread.currentThread().getName()+"的循环变量i的值 "+i);
           }
           //call()方法可以有返回值
           return i;
        });
        for(int i =0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20)
            {
                SecondThread st = new SecondThread();
                new Thread(st ,"新县城1").start();
            }

        }
        try {
            System.out.println("子线程的返回值 "+task.get());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
