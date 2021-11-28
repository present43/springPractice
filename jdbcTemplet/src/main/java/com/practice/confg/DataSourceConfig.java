package com.practice.confg;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/* 声明为配置类 */
@Configuration
/* 引入入 property 文件  */
@PropertySource("")
/* 开启 事务注解*/
@EnableTransactionManagement
/* 包扫描 */
@ComponentScan(basePackages = {"com.practice"})
public class DataSourceConfig {

    String url;

    String userName;

    String PassWord;

    String driverClass;

    @Autowired
    DruidDataSource dataSource;

    @Bean
    public DruidDataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(PassWord);
        dataSource.setDriverClassName(driverClass);
        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJDBCTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    /*创建事务管理器 使用 jdbc 模板的事务管理器 */
    @Bean
    public DataSourceTransactionManager TransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
