/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.pkg2;

/**
 *
 * @author Usuario1
 */
public class Arbol {

    private int[] arreglo;
    private int[] encontrado;
    private int numero = -1;
    private int numE = 0;

    public Arbol(int tamanio) {
        arreglo = new int[tamanio];
        encontrado = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = -1;
        }
    }

    public void insertar(int valor) {

        if (pilaLlena()) {
            System.out.println("se lleno el arbol");
        } else {
            int i = 0;
            while (arreglo[i] != -1) {
                if (valor > arreglo[i]) {
                    i = (2 * i) + 2;
                } else {
                    i = (2 * i) + 1;
                }
                if (i >= arreglo.length) {
                    System.out.println("Fuera de los limites del arreglo");
                    return;
                }
            }
            arreglo[i] = valor;
        }
    }

    public void buscar(int valor, int indice) {
//        if(indice >= arreglo.length  ){
//            System.out.println("no se encontro el valor ");
//            numero=-1;
//            return;
//        }
//        if(arreglo[indice] == valor){
//            System.out.println("El valor se encuntra en el indice: " + indice);
//            numero=valor;
//            return;
//        }
//        encontrado[numE]= arreglo[indice];
//        numE++;
//      
//        if(arreglo[indice] > valor){
//            buscar(valor, 2 * indice + 1);
//        }else{
//            buscar(valor, 2 * indice + 2);
//        }

        boolean band = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                System.out.println("La cancion " + valor + " se encuentra en la posicion " + i);
                band = true;
                break;
            }
        }
        if (!band) {
            System.out.println("No se encuentra el valor");
        }
    }

    public void imprimirRuta() {
        if (numE != 0) {
            if (numero != -1) {
                System.out.println("RUTA DEL VALOR " + numero);
                for (int j = 0; j < numE; j++) {
                    System.out.println(encontrado[j]);
                }
            } else {
                System.out.println("No se encontro la Ruta");
            }
            while (numE != 0) {
                numE--;
            }
        } else {
            System.out.println("Busque otro valor para obtener una ruta");
        }
    }

    public boolean pilaLlena() {
        boolean verdadero = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == -1) {
                verdadero = false;
                return verdadero;
            }
        }
        return verdadero;
    }
}
