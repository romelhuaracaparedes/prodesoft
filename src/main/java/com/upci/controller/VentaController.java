package com.upci.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.upci.model.Producto;
import com.upci.service.ProductoService;

@Controller
@RequestMapping("/home")
public class VentaController {
	
	@Autowired
	@Qualifier("productoServiceImpl2")
	private ProductoService productoServiceImpl;
	
	
	@GetMapping("/productos")
	public String verProductos() {
		return "productos";
	}
	
	@GetMapping("/productos2")
	public ModelAndView verProductos2(@RequestParam(name="nm",required=false, defaultValue="Usuario") String nombre) {
		ModelAndView mav = new ModelAndView("productos");
		mav.addObject("usuario", nombre);
		mav.addObject("productos", productoServiceImpl.listarProductos());
		return mav;
	}
	
	

}
