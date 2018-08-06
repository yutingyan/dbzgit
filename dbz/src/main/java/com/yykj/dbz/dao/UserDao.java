package com.yykj.dbz.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yykj.dbz.vo.User;


@Mapper
public interface UserDao {

	public	List<User> getAllUser();

}
