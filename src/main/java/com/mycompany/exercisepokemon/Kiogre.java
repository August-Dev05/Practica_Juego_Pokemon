package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class Kiogre extends Pokemon implements IAgua{

    public Kiogre() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Kiogre uso placaje");
    }

    @Override
    protected void atacarAraniaso() {
        System.out.println("Kiogre uso Araniaso no se como si tiene aletas pero lo uso ");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Kiogre uso mordisco");
    }

    @Override
    public void atacarIdrocanion() {
        System.out.println("Kiogre uso Idrocanion");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Kiogre uso Burbuja ");
    }
    
    
    
}
