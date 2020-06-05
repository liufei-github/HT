package com.gs.test;

import com.gs.bean.Emp;
import com.gs.dao.EmpDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/16.
 */
public class MyBatisTest {
    public static void main(String[] args) {
        try {

            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(input);
            SqlSession session = sf.openSession();
             EmpDao dao = session.getMapper(EmpDao.class);

            //查询所有员工的方法
//            List<Emp> list = dao.allEmp();
//            for (Emp e:list) {
//                System.out.println(e);
//            }

            //根据ID查询对象
//            Emp emp = dao.getById(1);
//            System.out.println(emp);

            //使用注解名称
//            Emp emp = dao.getById2("张三");
//            System.out.println(emp);

//            Emp emp = dao.getByNameAndAge("张三",20);
//            System.out.println(emp);

//            Emp emp = new Emp();
//            emp.setId(1);
//            emp.setEname("张三");
//            emp.setAge(20);
////            Emp e  = dao.getByObj(emp);
////            System.out.println(e);
//            Emp e  = dao.getByObj2(emp);
//            System.out.println(e);

            //insert
//            Emp e = new Emp("王五",30,1);
//            dao.saveEmp(e);
//            session.commit();//增删改需要提交事务 才能永久保存

//            List<Emp> list = new ArrayList<>();
//            list.add(new Emp("Test1",20,1));
//            list.add(new Emp("Test2",22,2));
//            dao.saveEmp2(list);
//            session.commit();

            //修改
//            Emp e = new Emp();
//            e.setId(1);
//            e.setEname("张三三");
//            e.setAge(50);
//            dao.updEmp(e);
//            session.commit();

            //删除
//            dao.delEmp(1);
//            session.commit();

            //sql标签的重用
//            Emp e = dao.sqltest1(2);
//            System.out.println(e);
//
//            dao.sqltest2(1);
//            session.commit();
//            System.out.println("提交");



//            List<Map> list = dao.sel();
//            System.out.println(list);


            try {
            Emp e = new Emp();
            e.setId(2);
            e.setAge(20);
            dao.testException(e);
            session.commit();
                System.out.println("提交");
            }catch (Exception e){
                System.out.println("回滚");
                session.rollback();
            }finally {
                session.close();
                System.out.println("关闭");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
