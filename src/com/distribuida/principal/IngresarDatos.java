package com.distribuida.principal;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Productos;
import com.distribuida.entities.Facturas;
import com.distribuida.entities.DetalleFactura;

public class IngresarDatos {

	 public static void main(String[] args) {

		    // Ingreso-de-cliente
		    Clientes cl = new Clientes();
		    cl.setId_cliente(1);
		    cl.setCedula(1755462650);
		    cl.setNombre_cliente("Darwin Sosa");    
		    cl.setFecha("09-07-2002");
		    cl.setTelefono(990562860);
		    cl.setCorreo("sosadarwin2002@gmail.com");
	    
		    // Ingreso-de-Productos
		    Productos pr1 = new Productos();
		    pr1.setId_producto(1);
		    pr1.setNombre_producto("Laptop Dell");
		    pr1.setPrecio(850.99);
		    
		    Productos pr2 = new Productos();
		    pr2.setId_producto(2);
		    pr2.setNombre_producto("iPhone 12");
		    pr2.setPrecio(999.99);

		    // Crear_factura
		    Facturas fa = new Facturas();
		    fa.setId_factura(1);
		    fa.setCliente(cl); 
		    fa.setFecha_factura("14/11/2023");

		    // Detalles_de_factura
		    DetalleFactura df1 = new DetalleFactura();
		    df1.setProductos(pr1);
		    df1.setCantidad(1);
		    
		    DetalleFactura df2 = new DetalleFactura();
		    df2.setProductos(pr2); 
		    df2.setCantidad(2);

		    double subtotal = pr1.getPrecio() + (pr2.getPrecio() * 2);
		    double total = subtotal * 1.12; 

		    fa.setTotalneto(subtotal);
		    fa.setTotal(total);

		    System.out.println(fa);
		  }

}

