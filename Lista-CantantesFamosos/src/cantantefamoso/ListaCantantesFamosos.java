/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantefamoso;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCantantesFamosos {

    ArrayList<CantanteFamoso> cantantes;

    public ListaCantantesFamosos() {
        cantantes = new <CantanteFamoso> ArrayList();
    }

    public void AgregarCantanteFamoso(CantanteFamoso Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDiscoConMasVentas());
        }
    }

}