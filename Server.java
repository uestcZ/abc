package Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException
    {
        //建立服务端Socket
        ServerSocket ss = new ServerSocket(10000);
        //接收客户端Socket
        Socket fileLoaderSocket = ss.accept();

        //打印连接信息
        String ip = fileLoaderSocket.getInetAddress().getHostAddress();
        System.out.println(ip + "...conncected");

        //接收文件，并保存
        InputStream is = fileLoaderSocket.getInputStream();
        //实例化对象fileSave
        OutputStream fileSave = new FileOutputStream("E:\\java实验.txt");
        //建立数组buf
        byte[] buf = new byte[1024];
        int len = 0;
        //判断是否读到文件末尾
        while((len=is.read(buf)) != -1)
        {
            fileSave.write(buf, 0, len);
            //刷新
            fileSave.flush();
        }
        //返回文件复制情况信息
        BufferedWriter bw = new BufferedWriter
                (new OutputStreamWriter(fileLoaderSocket.getOutputStream()));
        bw.write("所要上传的文件上传成功");
        //刷新
        bw.flush();
        //资源关闭
        ss.close();
        fileLoaderSocket.close();
        fileSave.close();
    }
}
