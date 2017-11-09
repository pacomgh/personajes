
package examen;

public abstract class Personaje{
    
    Arma armaComportamiento;
    
    abstract void pelear();
    
    public void setArmaPersonaje(Arma aComp){        
        armaComportamiento=aComp;    
    }
    
}
