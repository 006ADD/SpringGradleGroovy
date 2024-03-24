package org.add.spring.databace.repository;

import jakarta.annotation.PostConstruct;
import org.add.spring.bpp.Auditing;
import org.add.spring.bpp.InjectBean;
import org.add.spring.bpp.Transaction;
import org.add.spring.databace.entity.Company;
import org.add.spring.databace.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Auditing
@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {

    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    private final Integer poolSize;

    public CompanyRepository(ConnectionPool pool1,
                             List<ConnectionPool> pools,
                             @Value("${db.pool.saze}") Integer poolSize) {
        this.pool1 = pool1;
        this.pools = pools;
        this.poolSize = poolSize;
    }

    @PostConstruct
    public void init(){
        System.out.println("Init Company repository");
    }
    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("dindById method...");
    }
}
