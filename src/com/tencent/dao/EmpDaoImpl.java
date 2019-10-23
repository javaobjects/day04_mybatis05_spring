package com.tencent.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.tencent.pojo.Emp;

public class EmpDaoImpl implements IEmpDao {

	private SqlSessionFactory factory;
	
	public EmpDaoImpl(SqlSessionFactory factory)
	{
		this.factory = factory;
	}
	
	@Override
	public Emp selectEmpByEmpno(int empno) {
		
		//1.获取SqlSession接口
		SqlSession session = factory.openSession();
		
		//2.执行查询
		Emp emp = (Emp)session.selectOne("selectEmpByEmpno", empno);
		
		//3.归还连接
		session.close();
		
		return emp;
	}

}
