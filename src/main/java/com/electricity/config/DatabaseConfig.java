package com.electricity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/K22CNT3_CaoVanBinh_2210900091_project3?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("root");  
        dataSource.setPassword("210103"); 

        return dataSource;
    }
}
