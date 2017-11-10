
package examen;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

//import java.util.ArrayList;

public class Examen<Tipo> {
    
    String [] opciones = {"Rey", "Reina", "Troll", "Caballero"};   
    
    Personaje p;
       
    public String menuPersonaje(){               
        return (String)JOptionPane.showInputDialog(null,//contenedor del panel
                "Elija",//opciones de compra
                "Eleccion de Personaje",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/shrek-wallpaper.jpg"),//imagen
                opciones,//opciones del menu
                opciones[0]);//opcion mas recomendable;        
    }
    
    public Personaje elegirPersonaje(){        
        switch(menuPersonaje()){
            case "Rey":  
                p=new Rey();
                JOptionPane.showInputDialog(null,//contenedor del panel
                null,//opciones de compra
                "El Rey",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/Rey.png"),//imagen
                null,//opciones del menu
                null);//opcion mas recomendable; 
                //l.add(p);
                p.pelear(p);
                break;
            case "Reina":
                p=new Reyna();
                JOptionPane.showInputDialog(null,//contenedor del panel
                null,//opciones de compra
                "Reina",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/Reina.jpg"),//imagen
                null,//opciones del menu
                null);//opcion mas recomendable; 
                //l.add(p);
                p.pelear(p);
                break;
            case "Troll":
                p=new Troll();
                JOptionPane.showInputDialog(null,//contenedor del panel
                null,//opciones de compra
                "Personajes",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/troll.jpg"),//imagen
                null,//opciones del menu
                null);//opcion mas recomendable; 
                //l.add(p);
                p.pelear(p);
                break;
            case "Caballero":
                p=new Caballero();
                JOptionPane.showInputDialog(null,//contenedor del panel
                null,//opciones de compra
                "Personajes",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/caballero.jpg"),//imagen
                null,//opciones del menu
                null);//opcion mas recomendable; 
                //l.add(p);
                p.pelear(p);
                break;
        }       
        return p;
    }

    
    public static void main(String[] args) { 
        
        Examen e = new Examen();
        e.elegirPersonaje();
    
    }
    
}
