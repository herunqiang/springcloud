package com.hrq.springcloud.controller;

import com.hrq.springcloud.entity.UserPojo;
import com.hrq.springcloud.service.ProviderService;
import com.hrq.springcloud.service.feign.ProviderServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName FeignController
 * @Description
 * @Author muyan
 * @Date2018/12/29 16:41
 * @Version 1.0
 **/
@RestController
@RequestMapping("/web")
public class FeignController {

    @Autowired
    private ProviderServiceA providerServiceA;
    @Autowired
    private ProviderService providerService;
    /**
     * 获取具体调用哪个微服务，如果后台将provider服务启动两个端口，多次调用，会打印不同的微服务端口，模拟负载均衡
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getName(@RequestParam(value = "name") String name) {
        return providerService.getName();
    }

    /**
     * 从provider服务中获取所有用户信息
     * 这里加了produces = {"application/json;charset=UTF-8"}  可以将后台查询出来的结果，从xml变成json
     *
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<UserPojo> getUser() {
        return providerServiceA.getUser();
    }

    /**
     * 向远处服务发送新增一条用户请求
     * @return
     */
    @RequestMapping(value = "insertUser", method = RequestMethod.GET)
    public String insertUser(UserPojo userPojo) {
        System.out.println("客户端===》新增用户的信息为：username=" + userPojo.getUserName() + ",password=" + userPojo.getPassword() + ",age=" + userPojo.getAge());
        return providerService.insertUser(userPojo);
    }


}