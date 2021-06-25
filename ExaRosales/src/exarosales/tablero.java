
package exarosales;

import java.util.Scanner;

public class tablero {
    
    private int mcoordx;
    private int mcoordy;

public tablero (){
   mcoordx=0;
   mcoordy=0; 
} 
public void datos (){
     Scanner escaneo = new Scanner(System.in);
    System.out.println("La pocisión inicial son los puntos 0,0 ");
        mcoordx = 0; 
        mcoordy = 0; 
}

public void arriba (int n){
    mcoordy=mcoordy+n;
}

public void abajo (int n){
   mcoordy=mcoordy-n;
}

public void derecha (int n){
    mcoordx=mcoordx+ n;
}

public void izquierda (int n){
    mcoordx=mcoordx-n;
}
public int gety(){
    return(mcoordy);
}
public int getx(){
    return(mcoordx);
}
}

