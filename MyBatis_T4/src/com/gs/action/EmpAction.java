package com.gs.action;

import com.gs.bean.Emp;
import com.gs.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */
public class EmpAction {
    @Resource
    private IEmpService service;
    public String list(){
        List<Emp> list = service.allEmp();
        System.out.println(list.size());
        for (Emp e:list
             ) {
            System.out.println(e);
        }
        System.out.println("进来了");
        return null;
    }

    public String add(){
        System.out.println("添加进来了");
        service.addEmp(new Emp("测试",20,1));
        return null;
    }
}
