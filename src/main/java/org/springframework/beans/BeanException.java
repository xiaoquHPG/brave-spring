package org.springframework.beans;

/**
 * Bean异常
 * @Author Bill
 * @Date 2023/9/22 13:27
 **/
public class BeanException extends RuntimeException{

    public BeanException(String msg) {
        super(msg);
    }

    public BeanException(String msg, Throwable throwable){
        super(msg, throwable);
    }

}
