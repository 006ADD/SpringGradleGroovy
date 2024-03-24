package org.add.spring.service;

import org.add.spring.databace.entity.Company;
import org.add.spring.databace.repository.CompanyRepository;
import org.add.spring.databace.repository.CrudRepository;
import org.add.spring.databace.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository, CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
