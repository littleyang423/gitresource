package cn.yhf.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yhf.dao.UserDao;
import cn.yhf.dao.impl.UserDaoImpl;
import cn.yhf.domain.User;

public class procedureTest {
	@Test
	public void testSpring() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user2=(User) context.getBean("user");
		UserDao ud=context.getBean(UserDaoImpl.class);
		ud.sayhello(user2);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		User user=new User("杨海峰","12345678910");
//		UserDao usedao=new UserDaoImpl();
//		usedao.sayhello(user);
	}

}
