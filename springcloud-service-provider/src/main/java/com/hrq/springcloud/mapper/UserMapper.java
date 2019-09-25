package com.hrq.springcloud.mapper;

import com.hrq.springcloud.entity.UserPojo;
import org.apache.ibatis.annotations.Mapper;
 
import java.util.List;
 
/**
 * @InterfaceName UserMapper
 * @Description
 * @Author muyan
 * @Date2018/12/29 17:28
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {
 
    //获取用户中所有的信息
    public List<UserPojo> getUser();
 
    //新增一条用户信息到数据库中
    public void insertUser(UserPojo userPojo);
}