package org.add.spring.service;

import lombok.RequiredArgsConstructor;
import org.add.spring.databace.entity.Company;
import org.add.spring.databace.repository.CompanyRepository;
import org.add.spring.databace.repository.CrudRepository;
import org.add.spring.databace.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

}
