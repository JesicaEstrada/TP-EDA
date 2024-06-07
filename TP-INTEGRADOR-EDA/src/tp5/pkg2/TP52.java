/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario1
 */
public class TP52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
//        Construir el árbol mediante inserciones
//        Buscar una melodía específico por su número de identificación
//        Mostrar el camino recorrido para encontrar la melodía

        Scanner sc= new Scanner(System.in);
        
        int tamanio= 1000;
        int opcion;
        Arbol arbol = new Arbol(tamanio);
        do{
            System.out.println("\nMENU");
            System.out.println("1- Ingresar numero de una cacion");
            System.out.println("2- Buscar cancion por número de identificación");
            System.out.println("3- Mostrar el camino recorrido para encontrar la melodía");
            System.out.println("4- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor a insertar:");
                    int valorInsertar= sc.nextInt();
                    arbol.insertar(valorInsertar);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a buscar:");
                    int valorBuscado= sc.nextInt();
                    arbol.buscar(valorBuscado,0);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a buscar:");
                    int valorBuscadoAImprimir= sc.nextInt();
                    arbol.buscarImprimirRuta(valorBuscadoAImprimir);
                    break;
                case 4:
                    System.out.println("Adios!!");
                    break;
                default:
                    System.out.println("No se encuentra en el menu");               
            }
        }while(opcion != 4);
         sc.close();
    }
}
