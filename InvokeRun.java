package Thread;

public class InvokeRun extends Thread{
    private int i;
    public void run()
    {
        for (;i<100;i++)
        {
            //当线程类实现Runnable接口时
            //如果想获取当前线程，只能用currentThread()方法
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {

                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
