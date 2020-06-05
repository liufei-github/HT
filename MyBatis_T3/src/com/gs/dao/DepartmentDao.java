package com.gs.dao;

import com.gs.bean.Department;
import com.gs.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/2/18.
 */
public interface DepartmentDao {
    List<Department> listAll();

    /**
     * 查询部门级联查询部门详情（一对一）
     * @return
     */
    List<Department> getDepts();

    /**
     * 查询部门级联查询部门下的员工(一对多)
     */
    List<Department> getDeptAndEmp();

    List<Department> selDept(Department dept);

    void updDept(Department dept);

    void delDept(Integer[] ids);

    /**
     * 分页查询
     */
    List<Emp> pageEmp(@Param("emp") Emp emp,@Param("beginIndex") Integer beginIndex,@Param("pageCount") Integer pageCount);

    /**
     * 主键回填
     */
    void addEmp(Emp e);
}
