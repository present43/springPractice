package com.liuzheng.dao;

import java.sql.*;

/**
 连接数据库
 */

public class JDBC {
    //连接数据库的方法
    public void connect(String account) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn  = DriverManager.getConnection("","","");
            String sql = "insert  into employees(last_name) values("+account+")";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet re = pstm.executeQuery();

            re.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
