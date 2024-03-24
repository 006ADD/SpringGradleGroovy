package org.add.spring.config;

import org.add.spring.databace.pool.ConnectionPool;
import org.add.spring.databace.repository.CrudRepository;
import org.add.spring.databace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;


@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "org.add.spring",
        useDefaultFilters = false,
        includeFilters = {
            @Filter(type = FilterType.ANNOTATION, value = Component.class),
            @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
            @Filter(type = FilterType.REGEX, pattern = "org\\..+Repository")
        })
public class ApplicationConfiguration {
        @Bean
        @Scope(BeanDefinition.SCOPE_SINGLETON)
        public ConnectionPool pool2(@Value("#{db.username}") String username){
                return new ConnectionPool(username, 20);
        }

        @Bean
        public ConnectionPool pool3(){
                return new ConnectionPool("test-pool", 25);
        }
        @Bean
        @Profile("prod|web") //! | &
        public UserRepository userRepository2(ConnectionPool pool2){
                return new UserRepository(pool2);
        }
        @Bean
        public UserRepository userRepository3(){
                return new UserRepository(pool3());
        }
}
