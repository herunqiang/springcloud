package com.hrq.springcloud.controller;


import com.hrq.springcloud.entity.UserPojo;
import com.hrq.springcloud.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
/**
 * @Author 何润强
 * @Date 2019/9/16 16:04
 * @Param
 * @return
 * @Description 业务层测试
 **/
@RestController
public class ProviderController {
 
    @Value("${server.port}")
    private String port;
 
    @Autowired
    private ProviderService providerService;
 
    @RequestMapping(value = "getName", method = RequestMethod.GET)
    public String getName(@RequestParam(value = "name") String name){
        String result = "获取的名字是：" + name + ",端口是：" + port;
        return result;
    }
 
    /**
     * 获取所有用户信息
     * @Author muyan
     * @param
     * @return
     */
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public List<UserPojo> getUser(){
        long beginTime=System.currentTimeMillis();
        List<UserPojo> list  = providerService.getUser();
        long time=System.currentTimeMillis()-beginTime;
        System.out.println("消耗查询的时间为:" + time);
        return list;
    }
 
 
    /**
     * 新增用户
     * @Author muyan
     * @param userPojo
     * @return
     * 说明:
     * 参数传递是的是对象，所以此处必须是用@RequestBody修饰参数，否则会出现参数传递是空
     */
    @RequestMapping(value = "/insertUser")
    public String insertUser( @RequestBody UserPojo userPojo){
        String result = "新增成功";
        try {
            System.out.println( "controller===>新增用户的信息为：username=" + userPojo.getUserName() + ",password=" + userPojo.getPassword() + ",age=" + userPojo.getAge() );
            providerService.insertUser( userPojo );


        }catch (Exception e){
            result = "新增失败";
            e.printStackTrace();
        }
        return result;
    }
}