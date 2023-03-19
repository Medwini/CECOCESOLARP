/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author MEDWINI
 */
public class Datos {

    
    //Tabla de productos
    
    
    public int Cod_Producto;
    public String Nombre;
    public double Precio_Unitario;
    public String Descripcion;

    
    public int getCod_Producto() {
        return Cod_Producto;
    }
    
    public void setCod_Producto(int Cod_Producto) {
        this.Cod_Producto = Cod_Producto;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public void setPrecio_Unitario(double Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }

    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    //Tabla de ventas    
    public int Cod_Venta;
    public double Peso_Total;
    public double Pago_Total;
    public Date Fecha;
    
    public int getCod_Venta() {
        return Cod_Venta;
    }

    public void setCod_Venta(int Cod_Venta) {
        this.Cod_Venta = Cod_Venta;
    }

    public double getPeso_Total() {
        return Peso_Total;
    }

    public void setPeso_Total(double Peso_Total) {
        this.Peso_Total = Peso_Total;
    }

    public double getPago_Total() {
        return Pago_Total;
    }

    public void setPago_Total(double Pago_Total) {
        this.Pago_Total = Pago_Total;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    //Tabla Usuarios
        
    public int Cod_Us;
    public String Clave;
    
    public int getCod_Us() {
        return Cod_Us;
    }

    public void setCod_Us(int Cod_Us) {
        this.Cod_Us = Cod_Us;
    }

    public String getClave() {
        return Clave;
    }

    
    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    

    // Tabla Disponibles
    public int Cod_Disponibles;    
    
    public int getCod_Disponibles() {
        return Cod_Disponibles;
    }
    
    public void setCod_Disponibles(int Cod_Disponibles) {
        this.Cod_Disponibles = Cod_Disponibles;
    }
    
    
    //Tabla Moneda
    public int Cod_Moneda;
    public String Moneda;
    public double Valor;
    
    public int getCod_Moneda() {
        return Cod_Moneda;
    }

    public void setCod_Moneda(int Cod_Moneda) {
        this.Cod_Moneda = Cod_Moneda;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }
    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    public double getValor() {
        return Valor;
    }
    
        
}
