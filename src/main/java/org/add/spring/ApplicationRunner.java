package org.add.spring;


import org.add.spring.databace.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");

        ConnectionPool connectionPool = context.getBean("p1", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}
