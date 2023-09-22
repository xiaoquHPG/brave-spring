package org.springframework.beans.support;

import org.springframework.beans.BeanException;
import org.springframework.beans.config.BeanDefinition;

/**
 * @Author Bill
 * @Date 2023/9/22 16:53
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeanException {
        return doCreateBean(name, beanDefinition);
    }

    private Object doCreateBean(String name, BeanDefinition beanDefinition) {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (Exception e) {
            throw new BeanException("Instantiation of bean failed", e);
        }
        addSingleton(name, bean);
        return bean;
    }
}
