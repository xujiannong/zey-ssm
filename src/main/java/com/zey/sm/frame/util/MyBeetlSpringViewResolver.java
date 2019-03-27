package com.zey.sm.frame.util;

import org.beetl.ext.spring.BeetlSpringViewResolver;

public class MyBeetlSpringViewResolver extends org.beetl.ext.spring.BeetlSpringViewResolver {
    public MyBeetlSpringViewResolver() {
    }

    public String getPrefix() {
        return super.getPrefix();
    }
}