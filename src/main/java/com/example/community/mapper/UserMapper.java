package com.example.community.mapper;


import com.example.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token gmt_create,gmt_modified) values (#{name),#{countId},#{token},#{gmtCreate},#{gmtModified} ")
    void insert(User user);



}
