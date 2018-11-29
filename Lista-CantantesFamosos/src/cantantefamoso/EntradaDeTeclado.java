/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantefamoso;

/**
 *
 * @author Fafa
 */

import java.util.Scanner;

public class EntradaDeTeclado {

    private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public EntradaDeTeclado() {
        entradaTeclado = "";
    }

    public String AgregarCantante() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
    public String getEntrada() {
        return entradaTeclado;
    }

}