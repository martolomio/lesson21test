package com.example.magazine.dao;


import com.example.magazine.domain.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Integer> {

    @Query("select a.role from UserRole a, user b where b.userName=?1 and  a.userId=b.userId")
   public List<String> findUserRoleByUserName(String username);
}
