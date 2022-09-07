package com.aam134134.springflyway;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * Uses @ClassRule and @RunWith(SpringRunner.class) along with TestContainers to init Postgres. See JDBCServerContainer.start() and application.yml
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringFlywayApplicationTestsWithAnnotations {

    @ClassRule
    public static PostgreSQLContainer<DBContainer> dbContainer = DBContainer.getInstance();

    static {
        dbContainer.start();
    }

    @Test
    void contextLoads() {
    }

}
