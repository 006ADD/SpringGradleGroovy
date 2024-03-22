package org.add.spring.service;

import org.add.spring.databace.repository.CompanyRepository;
import org.add.spring.databace.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
