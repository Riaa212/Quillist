package com.blogwebsite.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogwebsite.admin.domain.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity,Long>
{

}
