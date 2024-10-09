package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the provedor database table.
 * 
 */
@Entity
@NamedQuery(name="Provedor.findAll", query="SELECT p FROM Provedor p")
public class Provedor implements Serializable {
	private static final long serialVersionUID = 1L;

	private String apellidos;

	private String correo;

	private String direccion;

	private String dni;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PROVEDOR")
	private int idProvedor;

	private String nombres;

	private String nomempresa;

	public Provedor() {
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdProvedor() {
		return this.idProvedor;
	}

	public void setIdProvedor(int idProvedor) {
		this.idProvedor = idProvedor;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNomempresa() {
		return this.nomempresa;
	}

	public void setNomempresa(String nomempresa) {
		this.nomempresa = nomempresa;
	}

}