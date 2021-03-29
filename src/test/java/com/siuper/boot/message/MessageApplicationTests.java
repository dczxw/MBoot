package com.siuper.boot.message;

import com.siuper.boot.message.model.AyUser;
import com.siuper.boot.message.service.AyUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MessageApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private AyUserService ayUserService;

    @Test
    void contextLoads() {
    }

    @Test
    void testMySql() {
        String sql = "select * from ay_user";
        List<AyUser> userList = jdbcTemplate.query(sql, (resultSet, i) -> {
            AyUser user = new AyUser();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setPassword(resultSet.getString("password"));
            return user;
        });

        System.out.println("查询成功");
        for (AyUser user : userList) {
            System.out.println("【id】：" + user.getId() + "    【name】：" + user.getName() + "    【password】：" + user.getPassword());
        }
    }


    @Test
    void testUser() {
        System.out.println("=================================");
        List<AyUser> list = ayUserService.findAll();
        System.out.println("用户列表数量:" + list.size());

        AyUser ayUser = ayUserService.findById(2);
        System.out.println("用户:" + ayUser.getName());

        AyUser ayUser1 = new AyUser();
        ayUser1.setId(3);
        ayUser1.setPassword("123456");
        ayUser1.setName("阿超");
        ayUserService.save(ayUser1);

        System.out.println("=================================");
    }

}
