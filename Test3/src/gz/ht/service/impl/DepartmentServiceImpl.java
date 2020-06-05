package gz.ht.service.impl;

import gz.ht.dao.DepartmentDao;
import gz.ht.pojo.Department;
import gz.ht.service.IDepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
@Service   //Service注解，不需要在Spring配置文件中注入，扫描器自动扫描
@Transactional //事务管理模式
public class DepartmentServiceImpl implements IDepartmentService {
    @Resource //引用其他注入的组件
    private DepartmentDao mapper;
    @Override
    public List<Department> alldept() {
        return mapper.listAll();
    }
}
