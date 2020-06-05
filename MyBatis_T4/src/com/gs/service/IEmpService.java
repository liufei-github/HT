package com.gs.service;

import com.gs.bean.Emp;

import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */
public interface IEmpService {
    public List<Emp> allEmp();

    public void addEmp(Emp emp);
}
