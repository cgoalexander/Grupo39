/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Solucion {
    
    public static Object[] reporte(ArrayList<libroDigital> library ){
        
        String nombreLibroMasPag = "";
        int libroConMasPaginas = 0;
        String nombreLibroMenosPrest = "";
        int libroConMenosPrest = Integer.MAX_VALUE;
        String libMayorTransf= "";
        double cantDatoTransf = 0;
     
       
        for(libroDigital i: library){
            if (i.getNumeroPaginas()> libroConMasPaginas){                
                libroConMasPaginas = i.getNumeroPaginas();
                nombreLibroMasPag = i.getTitulo();
            }
            if (i.getPrestamos()< libroConMenosPrest){                
                libroConMenosPrest = i.getPrestamos();
                nombreLibroMenosPrest = i.getTitulo();
            }
            if (i.getDatosTransferidos()> cantDatoTransf){
                cantDatoTransf = i.getDatosTransferidos();
                libMayorTransf = i.getTitulo();
                              
            }
        }       
        Object [] resultado = {nombreLibroMasPag,libroConMasPaginas,nombreLibroMenosPrest,libroConMenosPrest,libMayorTransf,cantDatoTransf};
        return resultado;      
    }
    
    
}
