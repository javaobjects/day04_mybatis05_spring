package com.tencent.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tencent.pojo.Emp;

public class EmpDaoImpl extends SqlSessionDaoSupport implements IEmpDao {

//	private SqlSessionFactory factory;
//	
//	public EmpDaoImpl(SqlSessionFactory factory)
//	{
//		this.factory = factory;
//	}
	
	@Override
	public Emp selectEmpByEmpno(int empno) {
		
		//1.获取SqlSession接口
//		SqlSession session = factory.openSession();
		
		//2.执行查询
		Emp emp = (Emp)this.getSqlSession().selectOne("selectEmpByEmpno", empno);
		
		//session.commit();
		
		//3.归还连接
//		session.close();
		
		return emp;
	}

}
