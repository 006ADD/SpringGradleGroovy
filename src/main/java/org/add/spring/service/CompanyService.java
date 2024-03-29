package org.add.spring.service;

import lombok.RequiredArgsConstructor;
import org.add.spring.databace.entity.Company;
import org.add.spring.databace.repository.CrudRepository;
import org.add.spring.dto.CompanyReadDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserService userService;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public Optional<CompanyReadDto> findById(Integer id) {
        return companyCrudRepository.findById(id).
                map(entity -> new CompanyReadDto(entity.getId()));
    }
}
