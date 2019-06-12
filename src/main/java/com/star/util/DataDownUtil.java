package com.star.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 大数据文件批量检索（电影影评）数据处理核心工具类
 * @author lwg
 * @Date: 2019/6/11 20:52
 */
public class DataDownUtil {

    /**
     * 根据网址和网页的编码集获取网页的源代码
     * @param url 网址
     * @param encoding 编码集
     * @return String 返回源代码
     */
    public static String getHtmlResourceByUrl(String url,String encoding){

        try {
            //建立网络连接
            URL urlObj = new URL(url);
           //打开网络连接
            URLConnection uc = urlObj.openConnection();
            //简历文件输入流
            InputStreamReader isr = new InputStreamReader(uc.getInputStream(), encoding);

            //建立文件缓冲流
            BufferedReader reader = new BufferedReader(isr);
            //建立临时变量
           // String temp =

        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("网络连接不可用");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("网络连接失败，稍后重试");
        }

        return null;

    }

    /**
     * java入口
     * @param args
     */
    public static void main(String[] args) {

    }
}
