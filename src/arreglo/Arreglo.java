/*
 a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.
 */
package arreglo;

/**
 *
 * @author Caro_Z
 */
public class Arreglo {
    
    
    
    public void sumarLista(int A[]){
        
        int sum=0;
        double prom=0;
        
        for(int i=0; i<A.length;i++){
            
            sum+=A[i];
            prom=sum/A.length;
            
        }System.out.println(" La suma de los numeros es: "+sum);
        System.out.println(" El prommedio de los numeros es: "+prom);
    }
    
    public void buscarMayor(int B[][]){
        
        int mayor= B[0][0];
        
            for(int i=0;i<B.length;i++){
                 for(int j=0;j<B.length;j++){
                    
                    if(B[i][j]>mayor ){
                        
                        mayor=B[i][j];
                    }
                    
                }
            }
             System.out.println(" El numero mayor es: " + mayor );
                     
    }
    
    public void contarVocales(String palabra){
        int vocales=0; // contador de vocales
            for(int i=0;i<palabra.length();i++){
                
                if((palabra.charAt(i)== 'a')||( palabra.charAt(i)=='e')||( palabra.charAt(i)=='i')||(palabra.charAt(i)=='o')||(palabra.charAt(i)=='u') )

                        vocales++;
                } System.out.println(" La palabra : "+ palabra+ " tiene : "+vocales+" vocales.");          
      
    }
    
    public void contarCaracter(String caracter,char c){
            int v=0; // contador cantidad de caracteres
           
            for( int i=0;i<caracter.length();i++){
                            
                     if(caracter.charAt(i)==c){ // busca caracteres iguales al ingresado 
                        v++;            // y los cuento
                      }
            }if (v != 0) {
System.out.println(" El caracter : "+c+ " se repite : " + v + " veces");
}else{
System.out.println(" El caracter : "+ c+ " no se encuentra en este texto");
                
            
}
    
}
}