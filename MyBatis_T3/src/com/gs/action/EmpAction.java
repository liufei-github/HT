package com.gs.action;

import com.gs.bean.Emp;
import com.gs.bean.Pager;
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
public class EmpAction {
    private Pager page = new Pager();

    public Pager getPage() {
        return page;
    }

    public void setPage(Pager page) {
        this.page = page;
    }

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    private List<Emp> list ;
    private Emp emp;
    public String list(){
        System.out.println("进来了");
        try {
            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(input);
            SqlSession session = sf.openSession();
            DepartmentDao dao = session.getMapper(DepartmentDao.class);
            System.out.println("姓名 "+emp.getEname()+"  年龄"+emp.getAge());
            list = dao.pageEmp(emp,(page.getCurrPage()-1)*page.getPageCount(),page.getPageCount());
            System.out.println("大小 "+list.size());
        }catch (IOException e){
            e.printStackTrace();
        }
        return "toindex";
    }
}
