package exercise.exercise4.unusual;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            //调用声明抛出checked异常的方法，要么显示捕获该异常
            //要么在main方法中再次声明抛出
            throwChecked(3);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        //调用声明抛出Runtime异常的办法既可以显示捕获该异常
        //也可不理会该异常
            throwRuntime(3);
    }
    public static void throwChecked(int a) throws Exception
    {
        if (a>0)
        {
            //自行抛出Exception异常
            //该代码必须处在try块里，或者处于throws声明的方法中
            throw new Exception("a不符合要求");
        }
    }
    public static void throwRuntime(int a)
    {
        if (a>0)
        {
            throw new RuntimeException("a的值不符合要求");
        }
    }
}
