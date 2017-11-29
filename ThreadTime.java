package exercise.exercise4.unusual;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTime {

    private static String getBeijingTime(){
        return getFormatedDateString(8);
    }

     private static String getBangaloreTime(){
        return getFormatedDateString(5.5f);
    }

     private static String getNewyorkTime(){
        return getFormatedDateString(-5);
    }

    //通过输入不同时区，(时区的区间为(-12,13))将所需时区设置为系统默认时区
    //从而得到系统当前默认时区的时间，最后返回
    private static String getFormatedDateString(float timeZoneOffset){

        //newtime 获得与格林威治的时间差，timeZoneOffset提供的是毫秒数
        int newTime=(int)(timeZoneOffset * 60 * 60 * 1000);
        TimeZone timeZone;
        //getAvailableIDs可以获得目标时间与格林尼治时间相差时间推出相应的时区
         //且必须用数组保存
        String[] tim = TimeZone.getAvailableIDs(newTime);

        //得到与给定基准时区GMT相差的目标时区ID的时间
        timeZone = new SimpleTimeZone(newTime, tim[0]);

        //为表示的时间设置格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //给定目标时区
        sdf.setTimeZone(timeZone);
        //返回目标时区，即当前时区的时间
        return sdf.format(new Date());
    }


    public static void main(String[] args) {
        //创建Callable对象
        ThreadTime tt = new ThreadTime();
        //先使用Lambda表达式创建Callable<Integer>对象
        //使用FutureTask来包装Callable对象

        FutureTask<Integer> task = new FutureTask<Integer>
                ((Callable<Integer>)()->
        {

            System.out.println("北京时间："+getBeijingTime());
            return 0;
        });

        FutureTask<Integer> task2 = new FutureTask<Integer>
                ((Callable<Integer>)()->
        {
            System.out.println("班加罗尔时间："+getBangaloreTime());
            return 0;
        });

        FutureTask<Integer> task3 = new FutureTask<Integer>
                ((Callable<Integer>)()->
        {
            System.out.println("纽约时间："+getNewyorkTime());
            return 0;
        });

        //实质以Callable对象来创建并启动线程
        new Thread(task,"北京时间").start();
        new Thread(task2,"班加罗尔时间").start();
        new Thread(task3,"纽约时间").start();

    }
}
