package com.hrq.springcloud.common.exception;

/**
 * @Author 何润强
 * @Date 2019/9/26 10:32
 * @Description TODO
 **/
public class CustException extends Exception {
    public CustException() {
    }

    public CustException(String message) {
        super(message);
    }
}
