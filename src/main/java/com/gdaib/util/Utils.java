package com.gdaib.util;

import com.gdaib.pojo.UrlPojo;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * Created by mahanzhen on 17-5-29.
 */
public class Utils {

    //获取本地IP
    public static String getLocalADDress() throws Exception {

        Properties properties = new Properties();
        return null;
    }

    //获取验证码
    public static void outCaptcha() throws Exception {

    }

    public static String getCaptcha() throws Exception {
        return null;
    }






    //装换参数为List
    public static List<String> toList(String uids) throws Exception {
        List<String> list = new ArrayList<String>();
        String[] split = uids.split(",");
        //遍历切割的字符串，把所有id加入list中
        for (String sp : split) {
            System.out.println(sp);
            list.add(sp);
        }
        return list;
    }

}
