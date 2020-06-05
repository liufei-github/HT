package com.gs.test;

import com.gs.bean.Department;
import com.gs.bean.Emp;
import com.gs.dao.DepartmentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2019/2/18.
 */
public class MyBatisTest {
    public static void main(String[] args) {
        try {
            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(input);
            SqlSession session = sf.openSession();
            DepartmentDao dao = session.getMapper(DepartmentDao.class);
//            List<Department> depts = dao.listAll();
//            for (Department dept:depts) {
//                System.out.println(dept);
//            }

            //一对一查询
//            List<Department> depts = dao.getDepts();
//            for (Department dept:depts) {
//                System.out.println(dept+" "+dept.getDetail());
//            }

            //一对多查询
//            List<Department> depts = dao.getDeptAndEmp();
//            for (Department dept:depts) {
//                System.out.println(dept+" ，部门下的员工有:");
//                List<Emp> emps = dept.getEmps();
//                for (Emp e:emps) {
//                    System.out.println("     "+e);
//                }
//            }
//            Department d = new Department();
//            d.setTitle("部");
//            d.setDes("项目");
//            List<Department> depts = dao.selDept(d);
//
//            for (Department dept:depts) {
//                System.out.println(dept);
//            }

            // 更新
//            Department d = new Department();
//            d.setTitle("项目部2");
//            d.setDes("项目部2");
//            d.setId(1);
//            dao.updDept(d);
//            session.commit();

//             dao.delDept(new Integer[]{9,10});
//             session.commit();

//            List<Emp> emps = dao.pageEmp(5,5);
//            for (Emp e:emps) {
//                System.out.println(e);
//            }

//            Emp e = new Emp("主键回填",20,1);
//            dao.addEmp(e);
//            session.commit();
//            System.out.println("刚刚保存的数据ID是 "+e.getId());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
