package com.gs.service.impl;

import com.gs.bean.Emp;
import com.gs.dao.EmpDao;
import com.gs.service.IEmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */
@Service //给类加上注解 spring容器就会自动扫描这个类
@Transactional //声明式事务
public class EmpServiceImpl implements IEmpService{
    @Resource //引用其他注入的bean
    private EmpDao mapper;


    public List<Emp> allEmp() {
        return mapper.listAll();
    }

    @Override
    public void addEmp(Emp emp) {
        mapper.addObj(emp);
    }
}
