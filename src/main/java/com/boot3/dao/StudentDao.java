package com.boot3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boot3.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{
	
	List<Student> findByFaculty(String faculty);
	
	List<Student> findByIdGreaterThan(int id);
	
	@Query("from Student where faculty=?1 order by name")
	List<Student> findByFacultySorted(String faculty);
}
