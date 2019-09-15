package com.upci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.upci.entity.Curso;
import com.upci.service.CursoService;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	@Qualifier("cursoServiceImpl")
	private CursoService cursoServiceImpl;
	
	@GetMapping("/formularioCurso")
	public ModelAndView verFormularioCurso() {
		ModelAndView mav = new ModelAndView("formulariocurso");
		mav.addObject("cursoModel", new Curso());
		mav.addObject("cursos", cursoServiceImpl.listarCursos());
	System.out.println("hola");
		return mav;
		

	}
	
	
	@PostMapping("/agregarCurso")
	public String agregarCurso(@ModelAttribute(name="cursoModel") Curso curso) {
		cursoServiceImpl.registrarCurso(curso);
		return "redirect:/curso/formularioCurso";
	}

}
