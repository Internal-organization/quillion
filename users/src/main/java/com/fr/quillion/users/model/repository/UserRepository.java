package com.fr.quillion.users.model.repository;

import com.fr.quillion.users.model.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Nixial on 13/11/2016.
 */
public interface UserRepository extends JpaRepository<User, Long>, QueryDslPredicateExecutor<User> {
}
