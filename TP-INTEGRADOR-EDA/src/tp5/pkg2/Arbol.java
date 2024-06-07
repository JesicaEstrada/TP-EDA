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

    public Arbol() {
        arreglo = new int[1000];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = -1;
        }
    }

    public void insertar(int valor) {

        if (pilaLlena()) {
            System.out.println("Se lleno el arbol");
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
        if(indice >= arreglo.length  ){
            System.out.println("No se encontro el valor: " + valor);
            return;
         
        }
        if(arreglo[indice] == valor){
            System.out.println("El valor se encuntra en el indice: " + indice);
            return;
            
        }
        if(arreglo[indice] > valor){
            buscar(valor, 2 * indice + 1);
        }else{
            buscar(valor, 2 * indice + 2);
        }
    }

    public void imprimirRuta(int valor,int indice,int indEnc, int[] encontrado) {
       if(indice >= arreglo.length  ){
            System.out.println("No se encontro el valor ");
            return;
        }
       if(valor==arreglo[0]){
           System.out.println("El valor " + valor + " es el elemento raiz.");
           return;
       }
        if(arreglo[indice] == valor){
            System.out.println("El valor se encuntra en el indice: " + indice);
            System.out.println("RUTA para llegar a la melodia " + valor);
            for (int i = 0; i < indEnc; i++) {
                System.out.println(encontrado[i]);
            }
            return;
        }
        encontrado[indEnc]= arreglo[indice];
        indEnc++;
      
        if(arreglo[indice] > valor){
            imprimirRuta(valor, 2 * indice + 1,indEnc,encontrado);
        }else{
            imprimirRuta(valor, 2 * indice + 2,indEnc,encontrado);
        }
    }
    public void buscarImprimirRuta(int valor){
        int[] encontrado = new int[arreglo.length];
        int indEnc=0;
        imprimirRuta(valor,0,indEnc,encontrado);
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
