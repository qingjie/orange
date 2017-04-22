package com.qingjie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qingjie.model.entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>, JpaRepository<Admin, Long> {
	Admin findByUsername(String username);
}