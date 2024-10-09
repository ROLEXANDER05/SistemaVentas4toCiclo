package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APE_USU")
	private String apeUsu;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_USU")
	private int codUsu;

	@Column(name="DNI_USU")
	private String dniUsu;

	@Column(name="EDA_USU")
	private short edaUsu;

	@Column(name="EST_USU")
	private String estUsu;

	@Column(name="LOG_USU")
	private String logUsu;

	@Column(name="NOM_USU")
	private String nomUsu;

	@Column(name="PAS_USU")
	private String pasUsu;

	public Usuario() {
	}

	public String getApeUsu() {
		return this.apeUsu;
	}

	public void setApeUsu(String apeUsu) {
		this.apeUsu = apeUsu;
	}

	public int getCodUsu() {
		return this.codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public String getDniUsu() {
		return this.dniUsu;
	}

	public void setDniUsu(String dniUsu) {
		this.dniUsu = dniUsu;
	}

	public short getEdaUsu() {
		return this.edaUsu;
	}

	public void setEdaUsu(short edaUsu) {
		this.edaUsu = edaUsu;
	}

	public String getEstUsu() {
		return this.estUsu;
	}

	public void setEstUsu(String estUsu) {
		this.estUsu = estUsu;
	}

	public String getLogUsu() {
		return this.logUsu;
	}

	public void setLogUsu(String logUsu) {
		this.logUsu = logUsu;
	}

	public String getNomUsu() {
		return this.nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public String getPasUsu() {
		return this.pasUsu;
	}

	public void setPasUsu(String pasUsu) {
		this.pasUsu = pasUsu;
	}

}