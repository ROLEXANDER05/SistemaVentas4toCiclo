package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENC")
	private Date fechaVenc;

	@Column(name="ID_CATEG")
	private int idCateg;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRODUCTO")
	private int idProducto;

	@Column(name="P_VENTA")
	private double pVenta;

	@Column(name="STOC_ACTUAL")
	private int stocActual;

	private int STOCk_ACTUAL;

	public Producto() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaVenc() {
		return this.fechaVenc;
	}

	public void setFechaVenc(Date fechaVenc) {
		this.fechaVenc = fechaVenc;
	}

	public int getIdCateg() {
		return this.idCateg;
	}

	public void setIdCateg(int idCateg) {
		this.idCateg = idCateg;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getPVenta() {
		return this.pVenta;
	}

	public void setPVenta(double pVenta) {
		this.pVenta = pVenta;
	}

	

	public int getStocActual() {
		return this.stocActual;
	}

	public void setStocActual(int stocActual) {
		this.stocActual = stocActual;
	}

	public int getSTOCk_ACTUAL() {
		return this.STOCk_ACTUAL;
	}

	public void setSTOCk_ACTUAL(int STOCk_ACTUAL) {
		this.STOCk_ACTUAL = STOCk_ACTUAL;
	}

}