
package exarosales;

import static java.lang.Math.sqrt;
import java.util.Scanner;
public class EjecutaTablero {
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in); 
     tablero Objtablero = new tablero();
      int op,n=0; 
        Objtablero.datos();
      do{
          
          System.out.println("El movimiento será realizado aleatoriamente, puede ser hacia arriba, abajo,izquierda o derecha");
          op = (int) (Math.random()*4); 
          if(op<=4 && op>=1 ) { 
          System.out.println("ecriba cuantas posiciones desea mover al objeto");
          n=escaneo.nextInt();
          }
           switch (op){
                case 1: Objtablero.arriba(n);
                break;
                case 2: Objtablero.abajo(n);
                break;
                case 3: Objtablero.derecha(n);
                break;
                case 4: Objtablero.izquierda(n);
                break;
        
                }
           
          System.out.println("su posición actual es:");
          System.out.println("La direccion actual");
          System.out.println("("+Objtablero.getx()+","+Objtablero.gety()+")");
          double dT;
          dT = sqrt((Math.pow(Objtablero.getx(),2))+(Math.pow(Objtablero.gety(),2)));
          System.out.println("La distancia total recorrida por el objeto es: "+dT);
        }while(op!=5);
    }       
    }

