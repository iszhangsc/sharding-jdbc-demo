package com.sharding;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingJdbcDemoApplicationTests {

    @Autowired
    private StringEncryptor encrypt;

    @Test
    public void contextLoads() {
        String decrypt = encrypt.decrypt("wPSvHLn3Wm25SGH/f1hA7rnSrWkfnV73XrauSDy+4ZPISNq/3dJRt8fjIattv3J8MGg64dX0FAWoeT/fyKPN4+/QUGP29k23wIORiX6ncVe6Kd1UY09JQsP9Rc7Rs1ZAa8r3lm/mUMJtqp5silZIAhyVz6GwoeBc7Q4rcKbqhXLSVtrD7/bapA==");
        String encrypt = this.encrypt.encrypt("jdbc:mysql://127.0.0.1:3306/sharding-jdbc?autoReconnect=true&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        System.out.println(encrypt);
    }

}
