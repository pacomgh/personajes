
package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
   
    Scanner lector = new Scanner(System.in);    
    Personaje p;
    
    public int menuPersonaje(){
        int opc;        
        System.out.println("Elige un personaje\n"
                + "1) Rey\n"
                + "2) Reyna\n"
                + "3) Troll\n"
                + "4) Caballero");
        opc = lector.nextInt();        
        return opc;        
    }
    
    public Personaje elegirPersonaje(){
        
        switch(menuPersonaje()){
            case 1:  
                p=new Rey();
                //l.add(p);
                p.pelear();
                break;
            case 2:
                p=new Reyna();
                //l.add(p);
                break;
            case 3:
                p=new Troll();
                //l.add(p);
                break;
            case 4:
                p=new Caballero();
                //l.add(p);
                p.pelear();
                break;
        }       
        return p;
    }

    
    public static void main(String[] args) { 
        
        Examen e = new Examen();
        //e.menuPersonaje();
        e.elegirPersonaje();
    
    }
    
}
