/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retobiblioteca;

/**
 *
 * @author hp
 */
public class libroDigital extends Libro{

    private double espacioEnDisco;
    private double datosTransferidos;
    private String formato;

    public libroDigital(double espacioEnDisco, String formato, String titulo, String nombreAutor, String apellidosAutor, String fechaPublicacion, int numeroPaginas, int prestamos) {
        super(titulo, nombreAutor, apellidosAutor, fechaPublicacion, numeroPaginas, prestamos);
        this.espacioEnDisco = espacioEnDisco;
        this.datosTransferidos = (espacioEnDisco*prestamos);
        this.formato = formato;
    }
    @Override
    public void prestar(){
        //AGREGUE LO QUE FALTA DEL MÉTODO prestar()
        //NO SE PREOCUPE POR EL RESTO DEL MÉTODO
        //prestar() DE ESTA CLASE, YA VIENE AGREGADO
        //A CONTINUACIÓN
        double datosSubidos = getDatosTransferidos();
        datosSubidos =  datosSubidos + espacioEnDisco;
        setDatosTransferidos(datosSubidos);       
    }

    public double getEspacioEnDisco() {
        return espacioEnDisco;
    }

    public void setEspacioEnDisco(double espacioEnDisco) {
        this.espacioEnDisco = espacioEnDisco;
    }

    public double getDatosTransferidos() {
        return datosTransferidos;
    }

    public void setDatosTransferidos(double datosTransferidos) {
        this.datosTransferidos = datosTransferidos;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }  
}
