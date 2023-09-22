package org.springframework.beans.config;

/**
 * @Author Bill
 * @Date 2023/9/22 13:38
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
