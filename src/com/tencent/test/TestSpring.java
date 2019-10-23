package com.tencent.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Emp;

public class TestSpring {

	public static void main(String[] args) {

		//1.加载并且解析applicationContext.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.获取spring容器管理的EmpDao
		IEmpDao empDao = (IEmpDao)factory.getBean("empDao");
		
		//3.调用方法
		Emp emp = empDao.selectEmpByEmpno(8888);
		System.out.println(emp);
	}
}
