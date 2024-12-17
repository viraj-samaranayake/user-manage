package com.User.crudApp.repository;

import com.User.crudApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


