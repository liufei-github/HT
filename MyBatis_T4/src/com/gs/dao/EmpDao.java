package com.gs.dao;

import com.gs.bean.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/2/21.
 */
@Repository
public interface EmpDao {
    List<Emp> listAll();
    void addObj(Emp emp);
}
