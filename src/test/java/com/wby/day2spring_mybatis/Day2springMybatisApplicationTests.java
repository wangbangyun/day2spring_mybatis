package com.wby.day2spring_mybatis;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Day2springMybatisApplicationTests {
    Logger logger =LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.info("这是info");
        logger.error("这是error");
    }

}
