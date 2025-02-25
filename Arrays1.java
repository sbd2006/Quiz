
package Arreglos;
public class Arrays1 {

    public static void main(String[] args) {
        int arreglo [] = new int [5]; 
        
        arreglo [0]= 3;
        arreglo [2]= 5;
        arreglo [1]= 7;
        arreglo [4]= 11;
        arreglo [3]= 13;
        
        
        
        
    //    System.out.println(arreglo [0]); //Imprimimos por posicion
    //    System.out.println(arreglo [1]);
    //    System.out.println(arreglo [2]);
    //    System.out.println(arreglo [3]);
    //    System.out.println(arreglo [4]);
    
         for (int i = 0; i < 5; i++) {
             System.out.print(" " + arreglo [i]);
        }
         System.out.println("\n----------------------------------");
         
         for (int i = 0; i < 5; i++) {
            System.out.println(arreglo [i]); 
        }
         System.out.println("************************************");
         for (int i = 0; i < arreglo.length; i++) {
             System.out.println(arreglo[i]);
             // .length devuelve el tamaño del arreglo 
        }
         
         System.out.println("^^^^^^^^^^^^ IMPRESION INVERSA ^^^^^^^^^^^^^");
         for (int i = 4; i >= 0; i--) {
             System.out.println(arreglo[i]);
        }
         
         System.out.println("^^^^^^^^^^^^ IMPRESION INVERSA2 ^^^^^^^^^^^^^");
         for (int i = arreglo.length -1; i >= 0; i--) {
             System.out.print(" " + arreglo[i]);
            
        }
    }
    
}
    

