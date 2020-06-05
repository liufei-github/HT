package com.gs.dao;

import com.gs.bean.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/16.
 */
public interface EmpDao {
    List<Emp> allEmp();
//    List<Emp> allEmp(Integer id); mubatis映射接口不允许有重载的方法

    /**
     * 根据ID查找单个对象
     *
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * param注解
     *
     * @param ename
     * @return
     */
    Emp getById2(@Param("ygxm") String ename);

    /**
     * 两个及以上参数查询一定要加参数注解
     * @param ename
     * @param age
     * @return
     */
    Emp getByNameAndAge(@Param("ename") String ename, @Param("age") Integer age);

    /**
     * 根据对象参数查询
     * @param emp
     * @return
     */
    Emp getByObj(Emp emp);

    /**
     * 对象注解参数查询
     * @param emp
     * @return
     */
    Emp getByObj2(@Param("query") Emp emp);

    /**
     * 插入数据
     * @param emp
     */
    void saveEmp(Emp emp);

    /**
     * 批量插入数据
     * @param emps
     */
    void saveEmp2(List<Emp> emps);

    /**
     * 修改
     * @param emp
     */
    void updEmp(Emp emp);

    /**
     * 删除
     * @param id
     */
    void delEmp(Integer id);

    Emp sqltest1(Integer id);

    void sqltest2(Integer id);

    /**
     * 取多个表的多个字段
     * @return
     */
    List<Map> sel();

    void testException(Emp e);
}
