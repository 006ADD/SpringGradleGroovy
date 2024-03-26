package org.add.spring.databace.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.add.spring.bpp.Auditing;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Slf4j
@Component("pool1")
@RequiredArgsConstructor
public class ConnectionPool{
    @Value("${db.username}")
    private final String username;
    @Value("${db.pool.saze}")
    private final Integer poolSize;



    @PostConstruct
    private void init() {
        log.info("Init connection pool");
    }

    @PreDestroy
    private void destroy(){
        log.info("Clean connection poll");
    }

}
