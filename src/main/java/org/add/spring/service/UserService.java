package org.add.spring.service;

import lombok.RequiredArgsConstructor;
import org.add.spring.database.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
   // private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

}
