package org.add.spring.integration.service;


import lombok.RequiredArgsConstructor;
import org.add.spring.database.pool.ConnectionPool;
import org.add.spring.integration.annotation.IT;
import org.add.spring.service.UserService;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserServiceIT {

    private final UserService userService;
    private final ConnectionPool pool1;

    @Test
    void test() {
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println();
    }
}