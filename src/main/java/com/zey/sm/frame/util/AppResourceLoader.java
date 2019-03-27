package com.zey.sm.frame.util;
import java.net.URL;

import org.beetl.core.Resource;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.core.resource.WebAppResourceLoader;

public class AppResourceLoader extends WebAppResourceLoader {
    private final ClasspathResourceLoader classpathResourceLoader = new ClasspathResourceLoader();
    private String classpathPrefix;
    private Class clazz = this.getClass();

    public AppResourceLoader() {
        super((String)null);
    }

    private static String getPrefix() {
        MyBeetlSpringViewResolver resolver = BeanFactory.getBean(MyBeetlSpringViewResolver.class);
        return resolver.getPrefix();
    }

    public String getClasspathPrefix() {
        return this.classpathPrefix;
    }

    public void setClasspathPrefix(String classpathPrefix) {
        this.classpathPrefix = classpathPrefix;
    }

    public ClasspathResourceLoader getClasspathResourceLoader() {
        return this.classpathResourceLoader;
    }

    private String getClasspathResourceKey(String key) {
        key = key.replace("classpath:*", "");
        if (this.classpathPrefix.endsWith("/") && key.startsWith("/")) {
            return this.classpathPrefix + key.substring(1);
        } else {
            return !this.classpathPrefix.endsWith("/") && !key.startsWith("/") ? this.classpathPrefix + "/" + key : this.classpathPrefix + key;
        }
    }

    public Resource getResource(String key) {
        String key0 = key.replace(getPrefix(), "");
        String classpathResourcePath = this.getClasspathResourceKey(key0);
        if (key0.startsWith("classpath:*")) {
            return this.classpathResourceLoader.getResource(classpathResourcePath);
        } else {
            URL url = this.clazz.getResource(classpathResourcePath);
            return url != null ? this.classpathResourceLoader.getResource(classpathResourcePath) : super.getResource(key);
        }
    }
}

