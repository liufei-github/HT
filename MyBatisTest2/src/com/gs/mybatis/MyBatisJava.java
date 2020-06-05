package com.gs.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.gs.bean.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gs.bean.Department;
import com.gs.dao.DepartmentDao;

public class MyBatisJava {
    public static void main(String[] args) {
        try {
            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(input);
            SqlSession session = sf.openSession();
            DepartmentDao dao = session.getMapper(DepartmentDao.class);

            //查询所有数据，返回对象List
//			List<Department> list = dao.listAll();
//			for (Department department : list) {
//				System.out.println(department);
//			}

            //根据ID查询
//			Department dept = dao.getById(1);
//			System.out.print(dept);

            //根据名称查询
//			Department dept = dao.getByTitle("研发部");
//			System.out.print(dept);

//			Department dept = dao.getByIdAndTitle(1,"研发部");
//			System.out.print(dept);

//			Department dept = new Department();
//			dept.setId(2);
//			dept.setTitle("项目部");
//			Department dd = dao.getByObj(dept);
//			System.out.print(dd);

//			Department dept = new Department();
//			dept.setId(2);
//			dept.setTitle("项目部");
//			Department dd = dao.getByObj1(dept);
//			System.out.print(dd);

            System.out.println("保存开始");
//			Department dept = new Department();
//			dept.setTitle("财务部");
//			dept.setDes("发工资");
//			dao.saveDept(dept);
//			session.commit();//提交事务

//			List<Department> list = new ArrayList<>();
//			list.add(new Department("人事部","员工管理"));
//			list.add(new Department("行政部","公司管理"));
//			dao.saveDept2(list);
//			session.commit();
            System.out.println("保存结束");

//			Department dept = new Department(1,"研发部1","2222");
//			dao.updDept(dept);
//			session.commit();

//			dao.delDept(8);
//			session.commit();

//            Department dept = dao.testsql1(1);
//            System.out.print(dept);

//            try {
//                dao.rollbacktest();
//                session.commit();
//                System.out.print("提交");
//            }catch (Exception e){
//                session.rollback();
//                System.out.print("回滚");
//            }finally {
//                session.close();
//                System.out.print("关闭");
//            }
//            List<Map> list = dao.testmap();
//            System.out.print(list);

//            List<Department> list = dao.rm();
//            for (Department department : list) {
//				System.out.println(department);
//			}
//            Department dept = dao.getDeptById(1);
//            System.out.println(dept);
//            System.out.println(dept.getDetail());

//            List<Department> depts = dao.getDepts();
//            for (Department dept:depts) {
//                System.out.println(dept);
//                List<Emp> emps =dept.getEmps();
//                for (Emp e:emps) {
//                    System.out.println("           "+e);
//                }
//            }

//            List<Emp> emps = dao.getEmpByName("王");
//            for (Emp e:emps) {
//                System.out.println(e);
//            }

//            Department dept = new Department();
//            dept.setTitle("主键回填测试");
//            dept.setDes("测试一下");
//            dao.saveGetKey(dept);
//            System.out.println("保存后的ID   = "+dept.getId());
//            session.commit();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
