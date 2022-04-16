/*
 
Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
de la clase Arreglo creada por usted.
 */
package arreglo;


public class PruebaArreglo {

    public static void main(String[] args) {
       
        
        Arreglo a=new Arreglo();
        
        int numeros[]={1,5,7,6,2,10,8,9,0,4};
        int numeritos[][]={{3,4,56,8},{20,8,3,-1},{0,-4,8,23}};
        String caballo = new String();
        
        a.sumarLista(numeros);
        a.buscarMayor(numeritos);
        a.contarVocales("caballo");
        a.contarCaracter("caballo", 'a');
        
        
        
    }
    
}
