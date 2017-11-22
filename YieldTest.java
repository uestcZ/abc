package Thread;

public class YieldTest extends Thread{
    public YieldTest(String name)
    {
        super(name);
    }
    //定义run()方法作为线程执行体

    @Override
    public void run() {
        for (int i=0;i<50;i++)
        {
            System.out.println(getName()+" "+i);
            if (i==20)
            {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        //启动两个并发线程
        YieldTest yt1 = new YieldTest("高级");
        //将yt1线程设置成最高优先级
//        yt1.setPriority(Thread.MAX_PRIORITY);
        yt1.start();
        YieldTest yt2 = new YieldTest("低级");
        //将yt2线程设置成最低优先级
        yt2.setPriority(6);
        yt2.start();
    }
}
