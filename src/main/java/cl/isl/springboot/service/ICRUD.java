package cl.isl.springboot.service;

import java.util.List;

import cl.isl.springboot.model.Empresa;

public interface ICRUD<T> {
	T registrar(T obj);
	T modificar(T obj);
	List<T> listar();
	T leerPorId(Integer id);
	boolean eliminar(Integer id);
	
}
