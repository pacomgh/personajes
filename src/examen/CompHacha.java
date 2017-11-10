
package examen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CompHacha implements Arma {
    
    String perso;
    
    @Override
    public void usarArma(Personaje p){
        System.out.println("Estoy usando arco y flecha");
        if (p instanceof Rey) 
            perso="Rey";
        else if (p instanceof Reyna)
            perso="Reina";
        else if(p instanceof Caballero)
            perso="Caballero";
        else if(p instanceof Troll)
            perso="Troll";
        
        JOptionPane.showInputDialog(null,//contenedor del panel
        null,//opciones de compra
        "El Rey",//titulo panel
        -1,//opcion icono
        new ImageIcon("src/images/"+perso+"ConHacha.jpg"),//imagen
        null,//opciones del menu
        null);//opcion mas recomendable;             
    }
   
    
}
