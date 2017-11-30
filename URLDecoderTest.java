package Net;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDecoderTest {
    public static void main(String[] args) throws Exception{
        //将application/x-www-form-urlencoded字符串
        //转换成普通字符串
        String keyWord = URLDecoder.decode(
                "%E7%96%AF%E7%8B%82java","utf-8"
        );
        System.out.println(keyWord);
        //将普通字符串转化成
        //application/x-www-form-urlencoded字符串
        String urlStr = URLEncoder.encode(
                "疯狂Android讲义","GBK"
        );
        System.out.println(urlStr);
    }
}
