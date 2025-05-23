package com.edu.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.ems.dao.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	

}
