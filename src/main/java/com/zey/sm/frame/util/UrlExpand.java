package com.zey.sm.frame.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xujiannong on 2018/1/17.
 */
public class UrlExpand {

    private static final Logger LOGGER = LoggerFactory.getLogger(UrlExpand.class);

    private static String webRoot;

    public static String getWebRoot() {
        return UrlExpand.webRoot;
    }

    public static String setWebRoot(String webRoot) {
        if(!UrlExpand.webRoot.endsWith("/")){
            UrlExpand.webRoot = UrlExpand.webRoot + "/";
        }
        return UrlExpand.webRoot + webRoot;
    }

    public static String getContextPath() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request.getContextPath();
    }

    static{
        try{
            webRoot = PropertyPlaceholder.getProperty("web.url");
        }catch(Exception e)
        {
            LOGGER.error("配置文件读取错误：{}",e.toString());
        }
    }

}
