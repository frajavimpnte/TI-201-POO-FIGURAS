/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FiguraTest;

import figuras.*;
/**
 *
 * @author TICS03
 */
public class TI201POOFiguras {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado1 c1 = new Cuadrado1();
        Triangulo1 t1 = new Triangulo1();
        
        c1.setN(4);
        t1.setN(4);
        
        c1.imprimir();
        t1.imprimir();
    }
    
}
