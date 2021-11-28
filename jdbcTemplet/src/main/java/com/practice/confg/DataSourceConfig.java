package com.practice.confg;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@PropertySource("")
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


}
