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
		//����Դ������ȡ����Դ
		DataSource ds = DataSourceFactory.getDataSource();
		//���񹤳�
		TransactionFactory tran = new JdbcTransactionFactory();
		//������������
		Environment en = new Environment("development", tran, ds);
		//���ö���
		Configuration con = new Configuration(en);
		//ӳ��ӿ���ӵ����ö����У�
		con.addMapper(DepartmentDao.class);
		//�õ�session����
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(con);
		//��session
		SqlSession session = sf.openSession();
		//��ȡӳ�����ӿ�
		DepartmentDao dao = session.getMapper(DepartmentDao.class);
		//ִ��ָ��sql
		List<Department> list = dao.listAll();
		for (Department department : list) {
			System.out.println(department);
		}
	}
}
