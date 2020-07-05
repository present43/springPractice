import com.liuzheng.pojo.Employees;
import com.liuzheng.service.impl.EmployeesServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeesTest {

    @Test
    public void testFindAll(){
        //获取数据容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 使用 注解时 从容器中取对象时 默认值 ID 首字母小写
        EmployeesServiceImpl esImpl = ac.getBean("employeesServiceImpl", EmployeesServiceImpl.class);
        List<Employees> allEmployees = esImpl.findAllEmployees();
        // 打印 从数据库查询出的数据
        for (Employees all: allEmployees) {
            System.out.println(all);
        }


    }
}
