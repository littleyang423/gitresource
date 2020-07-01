package cn.yhf.dao.impl;

import cn.yhf.dao.UserDao;
import cn.yhf.domain.User;

public class UserDaoImpl implements UserDao{

	@Override
	public void sayhello(User use) {
		// TODO Auto-generated method stub
		System.out.println("你好，我是"+use.getName()+"，我的电话是"+use.getPhone());
	}
	
}
