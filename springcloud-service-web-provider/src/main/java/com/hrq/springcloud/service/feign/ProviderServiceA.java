package com.hrq.springcloud.service.feign;


 
import com.hrq.springcloud.common.SystemConstant;
import com.hrq.springcloud.entity.UserPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
 
/**
 * @InterfaceName ProviderServiceA
 * @Description
 * @Author muyan
 * @Date2018/12/29 16:39
 * @Version 1.0
 * fallback = ProviderClientFallbackA.class，后面是你自定义的降级处理类，降级类一定要实现FeignService
 * 采用feign方法调用远程服务，必须编写一个接口，此接口声明需要调用远端服务的声明方法，
 * FeignClient中的value为调用远程服务的名称
 **/
@FeignClient(value = SystemConstant.SPRINGCLOUD_PROVIDER_SERVICE_NAME ,fallback = ProviderClientFallbackA.class)
public interface ProviderServiceA {
 
    @RequestMapping(value = "getName",method = RequestMethod.GET)
    public String getName(@RequestParam(value = "name") String name);
 
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public List<UserPojo> getUser();
 
    @RequestMapping(value = "insertUser")
    public String insertUser( @RequestBody UserPojo userPojo);
}