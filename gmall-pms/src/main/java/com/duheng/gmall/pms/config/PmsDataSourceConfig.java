package com.duheng.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/*************************
 Author: 杜衡
 Date: 2020/1/21
 Describe:
 *************************/
@Configuration
public class PmsDataSourceConfig {
    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        //spring的ResourceUtils来获取资源
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        return MasterSlaveDataSourceFactory.createDataSource(file);
    }
}
