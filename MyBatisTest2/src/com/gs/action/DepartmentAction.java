package com.gs.action;

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
 * Created by Administrator on 2019/2/19.
 */
public class DepartmentAction {
    public String list(){
        InputStream input = null;
        try {
            input = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sf.openSession();
        DepartmentDao dao = session.getMapper(DepartmentDao.class);
        System.out.println("dao "+dao);
        Emp es = new Emp();
        es.setEname("王");
        List<Emp> emps = dao.getEmpByName(es);
        System.out.println("size "+emps.size());
        for (Emp e:emps) {
            System.out.println(e);
        }
        return "toindex";
    }
}
