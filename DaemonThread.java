package Thread;

public class DaemonThread extends Thread{
    //定义后台线程的线程执行体与普通线程没有任何区别
    public void run() {
        for (int i=0;i<1000;i++)
        {
            //当线程类继承Thread类时，直接使用this即可获取当前线程
            //Thread类的getName()返回当前线程的名字
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread();
        //将此线程设置成后台进程
        t.setDaemon(true);
        //启动后台线程
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
    }
    //------程序到此结束---------
        //后台程序也随之结束
    }
}
