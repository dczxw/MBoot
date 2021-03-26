package com.siuper.boot.message;

import com.siuper.boot.message.model.AyUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class MessageApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testMySql() {
        String sql = "select * from ay_user";
        List<AyUser> userList = jdbcTemplate.query(sql, (resultSet, i) -> {
            AyUser user = new AyUser();
            user.setId(resultSet.getString("id"));
            user.setName(resultSet.getString("name"));
            user.setPassword(resultSet.getString("password"));
            return user;
        });

        System.out.println("查询成功");
        for (AyUser user : userList) {
            System.out.println("【id】：" + user.getId() + "    【name】：" + user.getName() + "    【password】：" + user.getPassword());
        }
    }

}
