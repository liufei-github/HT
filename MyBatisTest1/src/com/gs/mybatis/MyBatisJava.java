package com.gs.mybatis;

import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.gs.bean.Department;
import com.gs.dao.DepartmentDao;

public class MyBatisJava {
	public static void main(String[] args) {
		//数据源工厂获取数据源
		DataSource ds = DataSourceFactory.getDataSource();
		//事务工厂
		TransactionFactory tran = new JdbcTransactionFactory();
		//创建环境对象
		Environment en = new Environment("development", tran, ds);
		//配置对象
		Configuration con = new Configuration(en);
		//映射接口添加到配置对象中，
		con.addMapper(DepartmentDao.class);
		//得到session工厂
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(con);
		//打开session
		SqlSession session = sf.openSession();
		//获取映射器接口
		DepartmentDao dao = session.getMapper(DepartmentDao.class);
		//执行指定sql
		List<Department> list = dao.listAll();
		for (Department department : list) {
			System.out.println(department);
		}
	}
}
