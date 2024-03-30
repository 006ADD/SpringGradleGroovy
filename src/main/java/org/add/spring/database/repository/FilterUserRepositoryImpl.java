package org.add.spring.database.repository;


import com.querydsl.jpa.impl.JPAQuery;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.EntityManager;
import org.add.spring.database.entity.User;
import org.add.spring.database.querydsl.QPredicates;
import org.add.spring.dto.UserFilter;

import java.util.List;
import static org.add.spring.database.entity.QUser.user;
@RequiredArgsConstructor
public class FilterUserRepositoryImpl implements FilterUserRepository {

    private final EntityManager entityManager;

    @Override
    public List<User> findAllByFilter(UserFilter filter) {
        QPredicates.builder().
                add(filter.firstname(), user.firstname::containsIgnoreCase)
                .add(filter.lastname(), user.lastname::containsIgnoreCase)
                .add(filter.birthDate(), user.birthDate::before)
                .build();
        return new JPAQuery<User>(entityManager)
                .select(user)
                .from(user)
                .where(predicate)
                .fetch();
    }








}