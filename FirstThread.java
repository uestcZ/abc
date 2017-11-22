package Thread;

public class FirstThread extends Thread{
    private int i;
    //重写run()方法，run()方法的方法体就是线程执行体
    @Override
    public void run() {
        for (;i<100;i++)
        {
            //当线程类继承Thread类时，直接使用this即可获取当前线程
            //Thread类的getName()返回当前线程的名字
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++)
        {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==20)
            {
                //创建并启动第一和第二个线程
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
