package Thread;

public class JoinThread extends Thread{
    //设置一个有参数的构造器，用于设置该线程的名字
    public JoinThread(String name)
    {
        super(name);
    }
    //重写run()方法，定义线程执行体

    @Override
    public void run() {
        for (int i=0;i<100;i++)
        {
            //当线程类继承Thread类时，直接使用this即可获取当前线程
            //Thread类的getName()返回当前线程的名字
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) throws Exception{
        //启动子线程
        new JoinThread("新线程").start();
        for (int i=0;i<100;i++) {
        if (i==20)
        {
            JoinThread jt = new JoinThread("被join的线程");
            jt.start();
            //main线程调用jt线程的join()方法，main线程
            //必须等到jt执行完毕才会向下执行
            jt.join();
        }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
