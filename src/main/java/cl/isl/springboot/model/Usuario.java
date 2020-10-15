package cl.isl.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="usuario", nullable=false, unique=true)
	private String  username;
	
	@Column(name="password", nullable=false)
	private String  password;
	
	@Column(name="activo")
	private Boolean userActivo;
	
	
	@Column(name="email", nullable=false)
	private String  userEmail;
	/*
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="usuarios_tipos", joinColumns = @JoinColumn(name="id_usuario"), inverseJoinColumns = @JoinColumn(name="id_tipo_usuario"))
	private List<TipoUsuario> tipoUsuario;
	*/
	@Column(name="tipo_usuario")
	private Integer tipoUsuario;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getUserActivo() {
		return userActivo;
	}

	public void setUserActivo(Boolean userActivo) {
		this.userActivo = userActivo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
/*
	public List<TipoUsuario> getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(List<TipoUsuario> tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
*/

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	

	
}
