
package examen;

public abstract class Personaje{
    
    Arma armaComportamiento;
    
    abstract void pelear(Personaje p);
    
    public void setArmaPersonaje(Arma aComp){        
        armaComportamiento=aComp;    
    }
    
}
