/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.retobiblioteca;

import static com.mycompany.retobiblioteca.Solucion.reporte;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class RetoBiblioteca {

    public static void main(String[] args) {
     
        ArrayList<libroDigital> biblioteca = new ArrayList<>(); 
        biblioteca.add(new libroDigital(2.4,"DJVU","Memorias de Adriano","Margueritte","Yourcenar","1950/04/24",245,2));
        biblioteca.add(new libroDigital(4,"PDF","Java para Todos","Joseph","Whitecastle","2010/08/02", 202,5));
        biblioteca.add(new libroDigital(2.2,"HTML","La Iliada","Homero","","1970/04/24", 204,7));
        biblioteca.add(new libroDigital(8,"EPUB","1984","George","Orwell","1980/11/03",259,7));
        libroDigital libro5 = new libroDigital (2.0,"DJVU","Algebra","Aurelio","Baldor","1941/06/19",574,3);
        
        for(int i = 0; i < 26; i++){
            libro5.prestar();
        }
        biblioteca.add(libro5);
        biblioteca.add(new libroDigital(3,"PDF","Mujeres Que Corren Con Los Lobos","Clarissa","Pinkola Estés","1989/05/28", 600,8));
        Object reporteResultado[] = reporte(biblioteca);
        System.out.println(Arrays.toString(reporteResultado));
    }
}
