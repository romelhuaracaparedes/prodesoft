package com.upci.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upci.entity.Curso;

@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable>{

}
