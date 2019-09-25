package com.hrq.springcloud.service.feign;

import com.hrq.springcloud.common.SystemConstant;
import com.hrq.springcloud.entity.UserPojo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 何润强
 * @Date 2019/9/17 10:41
 * @Description   针对调用远端服务，错降级处理;因为是对FeignService进行降级处理，所以必须实现目标的接口，符合面向接口变成规范
 **/
@Component
public class ProviderClientFallbackB implements ProviderServiceB {
    @Override
    public String getName(String name) {
        String message = "调用"+ SystemConstant.SPRINGCLOUD_PROVIDER_SERVICE_NAME_B +"服务失败，熔断getName方法";
        System.out.println( "调用"+ SystemConstant.SPRINGCLOUD_PROVIDER_SERVICE_NAME_B +"服务失败，熔断getName方法" );
        return message;
    }

    @Override
    public List<UserPojo> getUser() {
        System.out.println( "请求超时，熔断getUser方法" );
        UserPojo userPojo = new UserPojo();
        List<UserPojo> list = new ArrayList<UserPojo>(  );
        list.add( userPojo );
        return list;
    }

    @Override
    public String insertUser(UserPojo userPojo) {
        String message = "调用"+ SystemConstant.SPRINGCLOUD_PROVIDER_SERVICE_NAME_B +"服务失败，熔断insertUser方法";
        System.out.println( "调用"+ SystemConstant.SPRINGCLOUD_PROVIDER_SERVICE_NAME_B +"服务失败，熔断insertUser方法" );
        return message;
    }
}