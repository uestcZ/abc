package InOutPut;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException{
        //以当前路径创建一个File对象
        File file = new File(".");
        //直接获得文件名
        System.out.println(file.getName());
        //获取相对路径的父路径可能会出错
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("aaa",".txt",file);
        //指定当JVM退出时删除文件
        tmpFile.deleteOnExit();
        //以系统当前时间为新文件夹的名字
        File newFile = new File(System.currentTimeMillis()+"");
        System.out.println("对象是否存在 ： "+newFile.exists());
        //以指定newFile对象创建一个文件
        newFile.createNewFile();
        //以newFile对象创建一个目录，因为newFile已经存在
        newFile.mkdir();//return false
        //使用list()方法列出当前路径下的所有文件和路径
        String [] fileList = file.list();
        System.out.println("====当前路径下的所有文件====");
        for (String fileName : fileList)
        {
            System.out.println(fileName);
        }
        //listRoots()静态方法列出的所有磁盘根路径
        File [] roots = File.listRoots();
        System.out.println("====系统所有根路径如下====");
        for (File root : roots)
        {
            System.out.println(root);
        }
    }
}
