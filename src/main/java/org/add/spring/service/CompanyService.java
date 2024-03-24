package org.add.spring.service;

import org.add.spring.databace.entity.Company;
import org.add.spring.databace.repository.CrudRepository;
import org.add.spring.dto.CompanyReadDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;

    public CompanyService(CrudRepository<Integer, Company> companyCrudRepository, UserService userService, ApplicationEventPublisher eventPublisher) {
        this.companyCrudRepository = companyCrudRepository;
        this.userService = userService;
        this.eventPublisher = eventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id){
        return companyCrudRepository.findById(id).
                map(entity -> new CompanyReadDto(entity.id()));
    }
}
