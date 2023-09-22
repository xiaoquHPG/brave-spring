package org.springframework.beans.factory;

import org.springframework.beans.BeanException;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean工厂
 *
 * @Author Bill
 * @Date 2023/9/22 11:44
 **/
public interface Beanfactory {

    /**
     * Bean获取
     * @param name
     * @return
     * @throws BeanException
     */
     Object getBean(String name) throws BeanException;

}
