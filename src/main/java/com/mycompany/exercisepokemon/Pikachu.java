package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    } 
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Piakchu uso Placaje ");  
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Pikachu uso Araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu uso Mordisco");
    }

    @Override
    public void atacarImpacTrueño() {
        System.out.println("Pikachu uso ImpacTrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu uso Punio Trueno");
    }
    
    
}
