package com.upci.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.upci.model.Producto;
import com.upci.service.ProductoService;

@Service("productoServiceImpl2")
public class ProductoServiceImpl2 implements ProductoService{

	@Override
	public List<Producto> listarProductos() {
List<Producto> productos = new ArrayList<>();
		
		productos.add(new Producto("Manzanilla", "Arroz organico", 3.5));
		productos.add(new Producto("Té", "Azucar rubia", 2.5));
		
		return productos;
	}

}
