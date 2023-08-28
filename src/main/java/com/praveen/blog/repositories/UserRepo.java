package com.praveen.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
