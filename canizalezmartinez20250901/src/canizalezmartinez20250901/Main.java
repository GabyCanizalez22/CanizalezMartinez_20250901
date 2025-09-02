/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canizalezmartinez20250901;

/**
 *
 * @author UFG
 */
 import java.util.Scanner;
public class Main {

    
    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz ();
    }
    public static void matriz(){
         //SE INSTACIA EL SCANER PARA LA LECTURA DEL TECLADO
        Scanner scanner = new Scanner (System.in);
        
        
        // SE INSTANCIA LA MATRIZ DE TIPO INTEGER
        int[][]matriz = new int [3][3];
        int suma = 0;//VARIBALE PARA LA SUMA DE VALORES DIGITADOS
         int total_elementos = 0;//CONTADOR DE ELEMENTOS DE LA MATRIZ
        double promedio = 0;//CALCULO DEL PROMEDIO DE EDADES DIGITADAS
       
        //SALIDA AL USUARIO PARA INDICAR QUE DEBE INGRESAR DATOS
        System.out.println("ingrese los valores para una materia de 3 x 3");
        
        //SE RECORRE PRIMERO LAS FILAS CON UNA ESTRUCTURA DE CONTROL ITERATIVA
        //DE TIPO FOR
        for(int i= 0; i< matriz.length; i++){
             //EN CADA ITERACION SE DEBERA OBTENER LA CANTIDAD DE ELEMENTOS
             //QUE EXISTE EN EL ARREGLO (CANTIDAD DE COLUMNAS)
            total_elementos+= matriz[i].length;
            
            //SE RECORRE LAS COLUMNAS DE LA MATRIZ CON UNA ESTRUCTRA DE COONTROL
            // ITERATIVA DE TIPO FOR
            // DEBIDO A QUE DEBEMOS OBTENER EL VALOR DE CADA CELDA (FILA Y COLUMNA)
            for(int j = 0; j< matriz[i].length; j++){
                // SE VUELVE UN ARRAY -----
                //SE IMPRIME LAPETICION AL USUARIO PARA EL INHRESO DE DATOS
                System.out.println("Elemento [ " + i+ "] [" + j+"]");
                //SE HACE LECTURA DEL TECLADO
                matriz[i][j] = scanner.nextInt();
            }// CIERRE EL FOR PARA OBTENER COLUMNS
            
        }//CIERRRE DEL FOR PARA OBTENER FILAS
        
        //SALIDA DEL USUARIO P´´
        System.out.println("matriz ingresada");
        // SE RECORREN LAS FILAS DE LA MATRIZ
        for (int x = 0; x < matriz.length ;x++){
             
            //SE RECOREEN LAS COLUMNAS DE LA MATRIZ 
           for(int y=0; y< matriz[x].length; y++){
               //SE VUELVE UN ARRAY----
               // SE IMPRIME EL VALOR DE CADA CELDA DE LA MATRIZ (FILA,COLUMNA)
               //FILA: X COLUMNA:Y
               System.out.print(matriz[x][y]+ " ");
               //SE SUMAN LOS VALORES DIGITADOS DE CADA CELDA
                suma += matriz[x][y];
           }
           //SE IMPRIME UN SALTO DE LINEA
            System.out.println();
            
        }
        
        //CALCULO DE VALORES 
        promedio = (double) suma/total_elementos;
        System.out.println(suma+ " es la suma total de elementos, la cantida de elemtos digitados es de : "+total_elementos);
        System.out.println("el promedio de edade es:" + promedio);
        
        //SE CIERRA EL USO DEL Scanner
        scanner.close();
    }
    
    
}
