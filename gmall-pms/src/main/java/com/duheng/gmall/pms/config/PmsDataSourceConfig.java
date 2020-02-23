package com.duheng.gmall.pms.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/*************************
 Author: 杜衡
 Date: 2020/1/21
 Describe:
 *************************/
@Configuration
public class PmsDataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {

        //spring的ResourceUtils来获取资源
        //File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        //return MasterSlaveDataSourceFactory.createDataSource(file);

        return new DruidDataSource();
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
