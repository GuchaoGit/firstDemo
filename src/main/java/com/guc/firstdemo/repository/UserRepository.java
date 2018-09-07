package com.guc.firstdemo.repository;

import com.guc.firstdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * user表操作接口
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select t from User t WHERE t.name = :name")
    User findByUserName(@Param("name") String name);
}
