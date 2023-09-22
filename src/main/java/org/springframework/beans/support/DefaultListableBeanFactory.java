package org.springframework.beans.support;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.BeanException;
import org.springframework.beans.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lenovo
 * @Date 2023/9/22 17:01
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String name) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (ObjectUtil.isEmpty(beanDefinition)) {
            throw new BeanException("No bean named '" + name + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

}
