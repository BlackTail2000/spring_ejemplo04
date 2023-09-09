package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Subject;

public interface ISubjectRepository extends JpaRepository<Subject, Integer>{

}
