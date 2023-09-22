package org.springframework.beans.support;

import org.springframework.beans.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Bill
 * @Date 2023/9/22 16:41
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonBean) {
        singletonObjects.put(beanName, singletonBean);
    }

}
