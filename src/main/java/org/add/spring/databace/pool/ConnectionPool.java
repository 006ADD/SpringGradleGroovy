package org.add.spring.databace.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.add.spring.bpp.Auditing;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("pool1")
@RequiredArgsConstructor
public class ConnectionPool{
    @Value("${db.username}")
    private final String username;
    @Value("${db.pool.saze}")
    private final Integer poolSize;



    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Clean connection poll");
    }

}
