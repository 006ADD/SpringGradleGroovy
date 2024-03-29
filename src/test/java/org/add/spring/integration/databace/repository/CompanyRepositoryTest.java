package org.add.spring.integration.databace.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.add.spring.databace.entity.Company;
import org.add.spring.integration.annotation.IT;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@IT
@RequiredArgsConstructor
@Transactional
@Rollback
class CompanyRepositoryTest {
    private final EntityManager entityManager;

    @Test
    void findById() {
        Company company = entityManager.find(Company.class,1);
        assertNotNull(company);
        //Assertions.assertThat(company.getLocales().hasSize(2));
    }
}