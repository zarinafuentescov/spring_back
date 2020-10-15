package cl.isl.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.isl.springboot.model.Usuario;
import cl.isl.springboot.repo.IUsuarioRepo;
import cl.isl.springboot.service.IUsuarioService;
//, UserDetailsService
@Service
public class UsuarioServiceImpl implements IUsuarioService{
	@Autowired
	private IUsuarioRepo repo;

	@Override
	public Usuario registrar(Usuario obj) {
		
		return repo.save(obj);
	}

	@Override
	public Usuario modificar(Usuario obj) {
		
		return repo.save(obj);
	}

	@Override
	public List<Usuario> listar() {
		
		return repo.findAll();
	}

	@Override
	public Usuario leerPorId(Integer id) {
		Optional<Usuario> op = repo.findById(id);
		return op.isPresent() ? op.get():new Usuario();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

/*	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario= repo.findOneByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException(String.format("El usuario no se encuentra", username));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		
	
		usuario.getTipoUsuario().forEach(tipo_usuario -> {
			roles.add(new SimpleGrantedAuthority(tipo_usuario.getGlosaTipousuario()));
		});
		
		
		
		UserDetails us = new User(usuario.getUsername(), usuario.getPassword(), roles);
		
		return us;
	}*/
	
}
