package com.tencent.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.dao.EmpDaoImpl;
import com.tencent.dao.IEmpDao;
import com.tencent.pojo.Emp;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		//1.获取SqlSessionFactory接口
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
//		
//		//2.获取EmpDao
//		IEmpDao empDao = new EmpDaoImpl(factory);
//		
//		//3.调用查询
//		Emp emp = empDao.selectEmpByEmpno(8888);
//		System.out.println(emp);
	}

}
