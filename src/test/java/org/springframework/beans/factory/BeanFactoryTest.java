package org.springframework.beans.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author Bill
 * @Date 2023/9/22 11:32
 **/
public class BeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.hello()).isEqualTo("hello");
    }


    class HelloService {
        public String hello() {
            System.out.println("hello");
            return "hello";
        }
    }

}
