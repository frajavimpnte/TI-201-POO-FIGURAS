/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author TICS03
 */
public class Cuadrado2 extends Figura {
    @Override
    public void imprimir() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == n-1) 
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}
