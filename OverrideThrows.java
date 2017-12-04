package exercise.exercise4.unusual;

import java.io.FileInputStream;
import java.io.IOException;

public class OverrideThrows {
    public void test() throws Exception
    {
        FileInputStream fis = new FileInputStream("a.txt");
    }

    class sub extends OverrideThrows
    {
        public void test() throws IOException
        {

        }
    }
}
