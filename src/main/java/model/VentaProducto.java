package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the venta_producto database table.
 * 
 */
@Entity
@Table(name="venta_producto")
@NamedQuery(name="VentaProducto.findAll", query="SELECT v FROM VentaProducto v")
public class VentaProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int cantidad;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENTA")
	private Date fechaVenta;

	@Column(name="ID_CLIENTE")
	private int idCliente;

	@Column(name="ID_PRODUCTO")
	private int idProducto;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VENTA")
	private int idVenta;

	@Column(name="TOTAL_VENTA")
	private double totalVenta;

	public VentaProducto() {
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaVenta() {
		return this.fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public double getTotalVenta() {
		return this.totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

}