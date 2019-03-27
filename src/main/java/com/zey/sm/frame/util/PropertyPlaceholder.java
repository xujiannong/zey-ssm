package com.zey.sm.frame.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public final class PropertyPlaceholder extends PropertyPlaceholderConfigurer {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyPlaceholder.class);
    private static Map<String, String> ctxPropertiesMap;

    public PropertyPlaceholder() {
    }

    public static String getProperty(String name) {
        String value = (String)ctxPropertiesMap.get(name);
        if (StringUtils.isBlank(value)) {
            LOGGER.warn(name + " not found!");
        }

        return value;
    }

    public static String getPropertyOrDefault(String name, String defaultValue) {
        return (String)ctxPropertiesMap.getOrDefault(name, defaultValue);
    }

    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        ctxPropertiesMap = new HashMap();
        Iterator var3 = props.keySet().iterator();

        while(var3.hasNext()) {
            Object key = var3.next();
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            ctxPropertiesMap.put(keyStr, value);
        }

    }
}

