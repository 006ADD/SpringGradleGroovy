package org.add.spring.database.repository;



import org.add.spring.database.entity.User;
import org.add.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);
}