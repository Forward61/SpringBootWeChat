package com.freedom.wechat.datasource;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by freedom on 2019/12/2.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonsterlanApplicationTests {

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        // 获取配置的数据源
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        // 查看配置数据源信息
        System.out.println("这" +dataSource);
        System.out.println("是" +dataSource.getClass().getName());
        System.out.println("输出 "+ dataSourceProperties);
        //执行SQL,输出查到的数据
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<?> resultList = jdbcTemplate.queryForList("select * from user");
        System.out.println("printlnprintln===>>>>>>>>>>>" + JSON.toJSONString(resultList));
    }

}
