package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Cahrmander ah usado Placaje"); 
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Charmander a usado Araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander te modio >:v "); 
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charamander uso Lanza Llamas");
    }

    @Override
    public void atacarAzcuas() {
        System.out.println("Chcarmander a usado Azcuas y te quemo ");
    }
    
    
}
