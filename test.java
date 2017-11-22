package InOutPut;

import java.io.*;
import java.util.Scanner;

public class test {


    public static void main(String[] args) throws Exception{

        System.out.print("请输入字符串 :");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file=new File("d:\\test.txt");

        //字节流输出
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);

            //定义一个数组
            //byte []bytes=new byte[1024];
            //如何把String转换成byte数组
            fos.write(str.getBytes());

        } catch (Exception e) {

            e.printStackTrace();
        }

        finally
        {
            try {
                fos.close();
            } catch (IOException e) {

                e.printStackTrace();
            }

        }

        System.out.println("用字节输入流打开文件");
        //创建字节输入流
        FileInputStream fis = new FileInputStream("d:\\test.txt");
        byte [] str1 = new byte[1024];
        //用于保存实际读取的字节数
        int hasRead = 0;
        while((hasRead=fis.read(str1))>0)
        {
            System.out.print(new String(str1,0,hasRead));
        }
        fis.close();

        System.out.println("");
        System.out.println("用RandomAccessFile打开文件");
        try (
            RandomAccessFile raf = new RandomAccessFile("d:\\test.txt","r"))
        {
            byte [] str2 = new byte[1024];
            int hasRead2 = 0;
            while((hasRead2 = raf.read(str2))>0)
            {
                System.out.print(new String(str2,0,hasRead2));
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

}