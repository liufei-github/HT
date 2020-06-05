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

            //��ѯ�������ݣ����ض���List
//			List<Department> list = dao.listAll();
//			for (Department department : list) {
//				System.out.println(department);
//			}

            //����ID��ѯ
//			Department dept = dao.getById(1);
//			System.out.print(dept);

            //�������Ʋ�ѯ
//			Department dept = dao.getByTitle("�з���");
//			System.out.print(dept);

//			Department dept = dao.getByIdAndTitle(1,"�з���");
//			System.out.print(dept);

//			Department dept = new Department();
//			dept.setId(2);
//			dept.setTitle("��Ŀ��");
//			Department dd = dao.getByObj(dept);
//			System.out.print(dd);

//			Department dept = new Department();
//			dept.setId(2);
//			dept.setTitle("��Ŀ��");
//			Department dd = dao.getByObj1(dept);
//			System.out.print(dd);

            System.out.println("���濪ʼ");
//			Department dept = new Department();
//			dept.setTitle("����");
//			dept.setDes("������");
//			dao.saveDept(dept);
//			session.commit();//�ύ����

//			List<Department> list = new ArrayList<>();
//			list.add(new Department("���²�","Ա������"));
//			list.add(new Department("������","��˾����"));
//			dao.saveDept2(list);
//			session.commit();
            System.out.println("�������");

//			Department dept = new Department(1,"�з���1","2222");
//			dao.updDept(dept);
//			session.commit();

//			dao.delDept(8);
//			session.commit();

//            Department dept = dao.testsql1(1);
//            System.out.print(dept);

//            try {
//                dao.rollbacktest();
//                session.commit();
//                System.out.print("�ύ");
//            }catch (Exception e){
//                session.rollback();
//                System.out.print("�ع�");
//            }finally {
//                session.close();
//                System.out.print("�ر�");
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

//            List<Emp> emps = dao.getEmpByName("��");
//            for (Emp e:emps) {
//                System.out.println(e);
//            }

//            Department dept = new Department();
//            dept.setTitle("�����������");
//            dept.setDes("����һ��");
//            dao.saveGetKey(dept);
//            System.out.println("������ID   = "+dept.getId());
//            session.commit();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
