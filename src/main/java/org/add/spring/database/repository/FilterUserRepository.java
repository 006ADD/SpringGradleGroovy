package org.add.spring.database.repository;



import org.add.spring.database.entity.Role;
import org.add.spring.database.entity.User;
import org.add.spring.dto.PersonalInfo;
import org.add.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}