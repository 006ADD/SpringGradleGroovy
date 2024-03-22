package org.add.spring.databace.repository;

import org.add.spring.bpp.InjectBean;
import org.add.spring.databace.pool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;
}
