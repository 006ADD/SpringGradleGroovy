package org.add.spring.databace.repository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.add.spring.bpp.Auditing;
import org.add.spring.bpp.InjectBean;
import org.add.spring.bpp.Transaction;
import org.add.spring.databace.entity.Company;
import org.add.spring.databace.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Auditing
@RequiredArgsConstructor
@Transaction
@Slf4j
public class CompanyRepository implements CrudRepository<Integer, Company> {

    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    @Value("${db.pool.saze}")
    private final Integer poolSize;



    @PostConstruct
    public void init(){
        log.info("Init Company repository");
    }
    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id, null, Collections.emptyMap()));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("dindById method...");
    }
}
