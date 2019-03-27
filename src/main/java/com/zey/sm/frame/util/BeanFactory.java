package com.zey.sm.frame.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public final class BeanFactory implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public BeanFactory() {
    }

    //获取静态变量中的ApplicationContext.
    private static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static <T> T getBean(Class<T> clazz) {
        Collection<T> beans = getBeans(clazz);
        if (beans != null && !beans.isEmpty()) {
            T bean = null;

            Object t;
            for(Iterator var3 = beans.iterator(); var3.hasNext(); bean = (T) t) {
                t = var3.next();
            }

            return bean;
        } else {
            return null;
        }
    }

    public static <T> Collection<T> getBeans(Class<T> clazz) {
        try {
            Map<String, T> map = getApplicationContext().getBeansOfType(clazz);
            return map.values();
        } catch (Exception var2) {
            return null;
        }
    }
}

