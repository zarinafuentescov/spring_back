package cl.isl.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.isl.springboot.exception.ModeloNotFoundException;
import cl.isl.springboot.model.Comuna;
import cl.isl.springboot.service.IComunaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/comunas")
public class ComunaController {
	@Autowired
	private IComunaService service;
	
	@GetMapping
	public ResponseEntity<List<Comuna>> listar(){
		List<Comuna> lista = service.listar();
		return new ResponseEntity<List<Comuna>>(lista , HttpStatus.OK);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Comuna> listarPorId(@PathVariable("id") Integer id){
		Comuna obj = service.leerPorId(id);
		if(obj.getIdComuna()== null) {
			throw new ModeloNotFoundException("NO SE HA ENCONTRADO EL ID "+id);
		}
		
		return new ResponseEntity<Comuna>(obj , HttpStatus.OK);
	}
	
/*
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Comuna comuna){
		Comuna obj = service.registrar(comuna);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(comuna.getIdComuna()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Comuna> modificar(@Valid @RequestBody  Comuna comuna){
		Comuna obj = service.modificar(comuna);
		return new ResponseEntity<Comuna>(obj , HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Comuna obj = service.leerPorId(id);
		if(obj.getIdComuna()== null) {
			throw new ModeloNotFoundException("NO SE HA ENCONTRADO EL ID "+id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	*/
}
