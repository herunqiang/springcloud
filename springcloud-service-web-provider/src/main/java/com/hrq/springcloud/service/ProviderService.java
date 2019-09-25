package com.hrq.springcloud.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.hrq.springcloud.entity.UserPojo;
import com.hrq.springcloud.service.feign.ProviderServiceA;
import com.hrq.springcloud.service.feign.ProviderServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;

/**
 * @Author 何润强
 * @Date 2019/9/18 10:48
 * @Description TODO
 **/
@Service
public class ProviderService {
    @Autowired
    ProviderServiceB providerServiceB;
    @Autowired
    ProviderServiceA providerServiceA;
    @LcnTransaction
//    @Transactional
    public String insertUser( UserPojo userPojo){
        String msg = providerServiceA.insertUser(userPojo);

        String msg2= providerServiceB.insertUser(userPojo);


//        // 置异常标志，DTX 回滚
     /*   if (!"新增成功".equals(msg) || !"新增成功".equals(msg) ) {
            throw new IllegalStateException("by exFlag");
        }*/

        return msg+";\n"+msg2;
    }
    public String getName (){
        return providerServiceA.getName("服务A")+providerServiceB.getName("服务B");
    }
}
