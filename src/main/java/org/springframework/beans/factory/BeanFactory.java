package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * bean工厂
 *
 * @Author Bill
 * @Date 2023/9/22 10:57
 **/
public class BeanFactory {

    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name,Object bean){
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }

}
