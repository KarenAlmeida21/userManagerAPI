package com.api.userManagerApi.repositories;


import com.api.userManagerApi.models.User;
import com.api.userManagerApi.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<UserLogin> findByLogin(String login);


}
