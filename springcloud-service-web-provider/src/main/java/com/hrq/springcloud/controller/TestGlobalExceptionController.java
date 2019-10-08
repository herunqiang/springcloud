package com.hrq.springcloud.controller;

import com.hrq.springcloud.common.exception.CustException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 何润强
 * @Date 2019/9/26 9:40
 * @Description TODO
 **/

@Controller
@RequestMapping("/test")
public class TestGlobalExceptionController {
    @RequestMapping("/exceptionPage")
    public String testExceptionPage(Integer param) throws CustException {
        if (param == null) {
            CustException e = new CustException("全局异常测试");
            e.printStackTrace();
            throw e;
        }
        return "";
    }
}
