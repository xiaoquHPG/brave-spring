package org.springframework.beans.support;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.BeanException;
import org.springframework.beans.config.BeanDefinition;
import org.springframework.beans.factory.Beanfactory;

/**
 * @Author Bill
 * @Date 2023/9/22 16:47
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements Beanfactory {

    @Override
    public Object getBean(String name) throws BeanException {
        Object singleton = getSingleton(name);
        if (!ObjectUtil.isEmpty(singleton)){
            return singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws BeanException;

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeanException;

}
