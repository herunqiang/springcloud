package com.hrq.springcloud.service;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.hrq.springcloud.entity.UserPojo;
import com.hrq.springcloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import java.util.List;
/**
 * @Author 何润强
 * @Date 2019/9/16 16:02
 * @Param 
 * @return 
 * @Description 测试业务层
 **/
@Service
public class ProviderService  {
 
    @Autowired
    private UserMapper userMapper;
 
    /**
     * 获取用户中所有的信息
     * @return
     */
    @Cacheable(value="allUserInfo")
//    @TccTransaction(propagation = DTXPropagation.SUPPORTS)
    @TxcTransaction
    @Transactional
    public List<UserPojo> getUser(){
//        System.out.println("开始查询.....");
//        try {
//            Thread.sleep(3 * 1000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("查询结束......");
        return userMapper.getUser();
    }
 
 
    /**
     * 新增一条用户信息到数据库中
     * @param userPojo
     * 说明：
     * 1：采用redis中的CacheEvict，新增一条数据之后，必须清除整个获取用户的redis缓存，这样保证数据每次都是最新的
     * 2：allEntries是否刷新所有的缓存，设置为false，不刷新所有，只刷新当前这一个缓存
     */
    @Transactional
    @CacheEvict(value = "allUserInfo" )
    public void insertUser(UserPojo userPojo) {
        System.out.println( "新增用户的信息为：username=" + userPojo.getUserName() + ",password=" + userPojo.getPassword() + ",age=" + userPojo.getAge() );
        userMapper.insertUser(userPojo);
    }
}