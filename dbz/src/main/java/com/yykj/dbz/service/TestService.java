package com.yykj.dbz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yykj.dbz.dao.UserDao;
import com.yykj.dbz.vo.User;

@Service
public class TestService {
@Autowired
private UserDao userDao;
	public List<User> getAllUser() {
		List<User> list=	userDao.getAllUser();
		return list;
	}

}
