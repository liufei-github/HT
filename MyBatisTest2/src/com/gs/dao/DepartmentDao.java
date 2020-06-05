package com.gs.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gs.bean.Department;
import com.gs.bean.Emp;
import org.apache.ibatis.annotations.Param;

public interface DepartmentDao {
	/**
	 * 查询所有数据
	 * @return
	 */
	List<Department> listAll();

	/**
	 * 根据ID查询对象
	 * @param id
	 * @return
	 */
	Department getById(Integer id);

	/**
	 * 根据名称查询
	 * @param title
	 * @return
	 */
	Department getByTitle(@Param("titleName") String title);

	Department getByIdAndTitle(@Param("id") Integer id,@Param("title")String title);

	Department getByObj(Department dept);

	Department getByObj1(@Param("dd") Department dept);

	void saveDept(Department dept);

	void saveDept2(List<Department> deptlist);

	void updDept(Department dept);

	void delDept(Integer id);

	Department testsql1(Integer id);
	void testsql2(Integer id);

	void rollbacktest();

	List<Map> testmap();

	List<Department> rm();

	Department getDeptById(Integer id);

	List<Department> getDepts();

	List<Emp> getEmpByName(Emp e);

	void saveGetKey(Department dept);
}
