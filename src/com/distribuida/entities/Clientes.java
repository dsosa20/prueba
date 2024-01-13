package com.distribuida.entities;

public class Clientes {

	//Atributos
	private int id_cliente;
	private int cedula;
	private String nombre_cliente;
	private String fecha;
	private String direccion;
	private int telefono;
	private String correo;
	private Clientes cliente;
	
	//Metodos Getter and Setter
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Clientes [id_cliente=" + id_cliente + ", cedula=" + cedula + ", nombre_cliente=" + nombre_cliente
				+ ", fecha=" + fecha + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo
				+ ", cliente=" + cliente + "]";
	}
	public Clientes buscarPorId(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
