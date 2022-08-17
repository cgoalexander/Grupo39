/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retobiblioteca;

/**
 *
 * @author hp
 */
public class Libro {
    
    private String titulo;
    private String nombreAutor;
    private String apellidosAutor;
    private String fechaPublicacion;
    private int numeroPaginas;
    private int prestamos;

    public Libro(String titulo, String nombreAutor, String apellidosAutor, String fechaPublicacion, int numeroPaginas, int prestamos) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.apellidosAutor = apellidosAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.prestamos = prestamos;
    }
    
    public void prestar(){
        //NO SE PREOCUPE POR LA IMPLEMENTACIÓN DEL 
        //MÉTODO prestar() DE ESTA CLASE, YA VIENE 
        //AGREGADO A CONTINUACIÓN
        int numPrestamos = getPrestamos();
        numPrestamos ++;
        setPrestamos(numPrestamos);       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidosAutor() {
        return apellidosAutor;
    }

    public void setApellidosAutor(String apellidosAutor) {
        this.apellidosAutor = apellidosAutor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    
}
