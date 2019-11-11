/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg1;

/**
 *
 * @author AA-LABB7PC03
 */
public class Factura {

    public static void main(String[] args) {
        int subtotal = 1293800;
        double iva = 12 * subtotal / 100;
        double descuento;
        double total;
        if (subtotal > 100) {

            descuento = subtotal * 5 / 100;

        } else {
            descuento = 0;
        }
        total = subtotal + iva - descuento;
        System.out.println("Descuento");
        System.out.println(descuento);
        System.out.println("total es:");
        System.out.println(total);
    }
}
