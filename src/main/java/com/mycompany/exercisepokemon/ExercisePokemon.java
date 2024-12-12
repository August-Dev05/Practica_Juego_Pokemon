package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public class ExercisePokemon {

    public static void main(String[] args) {
       
    Kiogre kio = new Kiogre ();
    Charmander charmander = new Charmander ();
    Pikachu pikachu = new Pikachu();
    Gardevoir Elena= new Gardevoir ();
    
    Elena.atacarMordisco();
    Elena.atacarTeletransporte();
        System.out.println("");
    charmander.atacarAraniaso();
    charmander.atacarAzcuas();
        System.out.println("");
    pikachu.atacarMordisco();
    pikachu.atacarImpacTrueño();
        System.out.println("");
    kio.atacarAraniaso();
    kio.atacarBurbuja();
        
    }
}
