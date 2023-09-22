package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean工厂
 *
 * @Author Bill
 * @Date 2023/9/22 11:44
 **/
public class Beanfactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }

}
