package com.danwys.SpringBootStudy.Repository;

import com.danwys.SpringBootStudy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
