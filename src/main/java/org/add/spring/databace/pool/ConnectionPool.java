package org.add.spring.databace.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.add.spring.bpp.Auditing;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("pool1")
public class ConnectionPool{
    private final String username;
    private final Integer poolSize;

    @Autowired
    public ConnectionPool(@Value("${db.username}") String username,
                          @Value("${db.pool.saze}")Integer poolSize) {
        this.username = username;
        this.poolSize = poolSize;

    }

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Clean connection poll");
    }

}
