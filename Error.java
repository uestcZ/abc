package exercise.exercise4.unusual;

class Point {
    public int x, y;
    public int getX() {
        return x;
    }
}

public class Error extends Point{
    public void err1()
    throws NullPointerException
    {
        Point p1 = null;
        try
        {
            p1.x=1;
        }
        catch (NullPointerException ne)
        {
                System.out.println("错误一");
                System.out.println("出现了调用指针的错误");
                System.out.println("错误的原因是指针地址为："+ne.getMessage());
                Point p2 = new Point();
                p2.x=3;
                System.out.println("修改之后指针所指向的值为："+p2.getX());
                System.out.println("");
                ne.printStackTrace();
        }

    }

    public void err2(int k)
        throws ArithmeticException
    {
        try
        {
            int h = k/0;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("错误二");
            System.out.println("出现了算数异常");
            System.out.println("错误的原因是："+ae.getMessage());
            ae.printStackTrace();
            int h = k+1;
            System.out.println("改错之后的值为："+h);
            System.out.println("");

        }
    }

    public void err3()
        throws IndexOutOfBoundsException
    {
        try
        {
            int [] i = new int[5];
            i[5] = 100;
        }
        catch (IndexOutOfBoundsException ie)
        {
            System.out.println("错误三");
            System.out.println("出现了数组越界的异常情况");
            System.out.println("错误的原因是："+ie.getMessage()+"已经超出了数组的大小范围");
            ie.printStackTrace();
            int [] i = new int[6];
            i[5]=100;
            System.out.println("将数组扩大之后可以打印出相应的值为："+i[5]);

        }
    }

    public static void main(String[] args) {
        Error e = new Error();
        e.err1();
        e.err2(5);
        e.err3();
    }
}
