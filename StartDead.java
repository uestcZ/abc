package Thread;

public class StartDead extends Thread{

    //定义后台线程的线程执行体与普通线程没有任何区别
    private int i;
    //重写run()方法，run()方法的方法体就是线程执行体
    @Override
    public void run() {
        for (;i<1000;i++)
        {
            //当线程类继承Thread类时，直接使用this即可获取当前线程
            //Thread类的getName()返回当前线程的名字
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        StartDead sd = new StartDead();
        for (int i=0;i<300;i++)
        {
            //调用Thread的currentThread()方法获取当前线程
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20)
            {
                //启动线程
                sd.start();
                //判断启动后线程的isAlive()值，输出true
                System.out.println(sd.isAlive());
            }
            //当线程处于新建，死亡两种状态时，isAlive()返回false
            if(i>20 && !sd.isAlive())
            {
                //企图再次启动该线程
                sd.start();
            }
        }
    }
}
