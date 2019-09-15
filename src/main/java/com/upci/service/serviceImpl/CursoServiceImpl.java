package com.upci.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.upci.entity.Curso;
import com.upci.repository.CursoJpaRepository;
import com.upci.service.CursoService;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService{

	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository;
	
	@Override
	public Curso registrarCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

	@Override
	public List<Curso> listarCursos() {
		
		return cursoJpaRepository.findAll();
	}

}
