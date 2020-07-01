package cn.yhf.Service.impl;

import cn.yhf.Service.Service;
import cn.yhf.dao.UserDao;
import cn.yhf.dao.impl.UserDaoImpl;
import cn.yhf.domain.User;

public class ServiceImpl implements Service {
	
	private UserDaoImpl userdaoimpl;
	
	public UserDao getUserdaoimpl() {
		return userdaoimpl;
	}

	public void setUserdaoimpl(UserDao userdaoimpl) {
		this.userdaoimpl = (UserDaoImpl) userdaoimpl;
	}

	@Override
	public void menthod(User use) {
		// TODO Auto-generated method stub

	}

}
