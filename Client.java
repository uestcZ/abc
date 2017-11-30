package Net;


import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException
    {
        //建立Socket服务
        Socket fileLoaderSocket = new Socket("192.168.1.102", 10000);
        //从客户端本地读取文件,并写入socket的输出流中
        OutputStream os = fileLoaderSocket.getOutputStream();
        //实例化对象fileReader
        InputStream fileRead = new FileInputStream("D:\\java.txt");
        //建立数组
        byte[] tim = new byte[1024];
        int len = 0;
        //判断是否读到文件末尾
        while((len=fileRead.read(tim)) != -1)
        {
            os.write(tim, 0, len);
        }
        //告诉服务端，文件已传输完毕
        fileLoaderSocket.shutdownOutput();
        //获取从服务端反馈的信息
        BufferedReader br = new BufferedReader
                (new InputStreamReader(fileLoaderSocket.getInputStream()));
        String serverBack = br.readLine();
        System.out.println(serverBack);
        //资源关闭
        fileLoaderSocket.close();
        fileRead.close();
    }
}
