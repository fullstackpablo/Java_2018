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
import java.util.List;
import java.util.Scanner;

public class EjerciciosCu00667B  {

    public static void main(String[] args) {

        String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        EntradaDeTeclado entrada = new EntradaDeTeclado();

        CantanteFamoso cantante1 = new CantanteFamoso("fafa Antonio", "gym sin ti");//los datos no son reales
        CantanteFamoso cantante2 = new CantanteFamoso("Enrique fafa", "Si tu te vas yo me voy en mi bici");
        listacantate.AgregarCantanteFamoso(cantante1);
        listacantate.AgregarCantanteFamoso(cantante2);

        System.out.println("La lista contiene los siguientes datos: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            List.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }

}
