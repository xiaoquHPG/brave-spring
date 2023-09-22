package org.springframework.beans.support;

import org.springframework.beans.config.BeanDefinition;

/**
 * @Author Lenovo
 * @Date 2023/9/22 16:38
 **/
public interface BeanDefinitionRegistry {

    /**
     * 注册bean信息
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
