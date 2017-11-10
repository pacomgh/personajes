
package examen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Troll extends Personaje{
    
    String [] opcionesArma = {"Espada", "Cuchillo", "Arco y Flecha", "Hacha"};
    Arma a;
    
    @Override
    public void pelear(){
        setArmaPersonaje(darArma());
        if (a instanceof CompEspada) 
            a.usarArma();
        else if (a instanceof CompCuchillo)
            a.usarArma();
        else if(a instanceof CompArcoFlecha)
            a.usarArma();
        else if(a instanceof CompHacha)
            a.usarArma();
    }      
    
    @Override
    public void setArmaPersonaje(Arma ar){
        a = ar;        
    } 
    
    public Arma darArma(){        
        switch(menuArma()){
            case "Espada":
                a = new CompEspada();
                break;
            case "Cuchillo":
                a = new CompCuchillo();
                break;
            case "Arco y Flecha":
                a = new CompArcoFlecha();
                break;
            case "Hacha":
                a = new CompHacha();
                break;        
        }                
        return a;        
    }
    
    public String menuArma(){               
        return (String)JOptionPane.showInputDialog(null,//contenedor del panel
                "Elija",//opciones de compra
                "Eleccion de Armas",//titulo panel
                -1,//opcion icono
                new ImageIcon("src/images/weapons.jpg"),//imagen
                opcionesArma,//opciones del menu
                opcionesArma[0]);//opcion mas recomendable;        
    }
    
}
