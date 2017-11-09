
package examen;
import java.util.Scanner;
public class Caballero extends Personaje{
    
    Scanner leer = new Scanner(System.in);
    Arma a;
    
    @Override
    public void pelear(){
        System.out.println("peleando como Encantador");
        //menuArma();
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
            case 1:
                a = new CompEspada();
                break;
            case 2:
                a = new CompCuchillo();
                break;
            case 3:
                a = new CompArcoFlecha();
                break;
            case 4:
                a = new CompHacha();
                break;        
        }                
        return a;        
    }
    
    public int menuArma(){
        int arma;       
        
        System.out.println("Elige tu arma\n"
                + "1) Espada\n"
                + "2) Cuchillo\n"
                + "3) Arco & Flecha\n"
                + "4) Hacha");
        arma = leer.nextInt();        
        
        return arma;
    }
}
