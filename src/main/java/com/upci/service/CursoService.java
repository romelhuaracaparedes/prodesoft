package com.upci.service;

import java.util.List;

import com.upci.entity.Curso;

public interface CursoService {
	public abstract Curso registrarCurso(Curso curso);
	public abstract List<Curso> listarCursos();
}
