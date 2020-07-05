package com.liuzheng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 程序之间的耦合
 耦合：
    程序与程序之间的依赖
    类与类之间的依赖
    方法与方法之间的依赖
 解耦合
    降低程序之间的依赖
 实际开发过程中
    应该做到： 编译期不依赖，运行期依赖
 解决思路
 第一步 ：不使用 New 关键字  通过反射 加载字节码文件 获取对象
 第二步 ： 但是这样程序里的全类名是写死的 ， 将来换数据库驱动要改 源代码，这样不 OK 所有需要配置文件

 */
public class JdbcTest {
    public static void main(String[] args) {
        //加载驱动
        // 方式 一 直接创建 程序之间的 耦合性大，而且 如果没有导入对应的包 则会导致编译期报错。程序独立性能差
        //  DriverManager.registerDriver(new com.mysql.jdbc.driver());

        Connection conn  ;
        ResultSet rs;
        PreparedStatement ps;
        try {
            // 方式二 通过反射 全类名 加载对应的类
            Class.forName("com.mysql.jdbc.Driver");
            //注册连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees","root","root");
            //定义执行SQL
            String sql = " select last_name from employees ";
            //获取SQL 执行对象
            ps = conn.prepareStatement(sql);
            //执行SQL 获得结果集
            rs = ps.executeQuery();
            //遍历结果集
            while (rs.next()) {
                System.out.println(rs.getString("last_name"));
            }
            //释放资源
            conn.close();
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
