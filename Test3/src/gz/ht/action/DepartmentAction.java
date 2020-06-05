package gz.ht.action;

import gz.ht.pojo.Department;
import gz.ht.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Administrator on 2019/2/20.
 */
//@Scope("prototype")
//@Controller("dept")
public class DepartmentAction {
    @Autowired //引用注入的bean
    private IDepartmentService service;

    public String list(){
        List<Department> list = service.alldept();
        System.out.println(list.size());
        return null;
    }
}
