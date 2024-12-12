package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Gardevoir extends Pokemon implements IHada{

    public Gardevoir() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Elena uso Placaje y se lastimo ");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Elena uso Araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Elena uso mordisco");
    }

    @Override
    public void atacarConfusion() {
        System.out.println("Elena uso confusion y le dio migraña");
    }

    @Override
    public void atacarDobleEquipo() {
        System.out.println("Elena uso Doble equipo ");
    }

    @Override
    public void atacarTeletransporte() {
        System.out.println("Elena uso teletransporte y se perdio");
    }
    
    
}
