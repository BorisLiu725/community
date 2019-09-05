package com.ly.community.mapper;

import com.ly.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by BorisLiu on 2019/9/5
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (account_id,name,token,gmt_create,gmt_modified) values (#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})")
    public void insert(User user);

    @Select("select * from user where token = #{token}")
    public User findByToken(String token);
}