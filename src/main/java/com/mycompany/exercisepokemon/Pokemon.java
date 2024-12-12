package com.mycompany.exercisepokemon;

/**
 *
 * @author PC-De-GOBIERNO
 */
public abstract class Pokemon {
    
    protected String nombre;
    protected int    edad;
    protected String tipo;
    protected int    temporada;
    protected String genero;
    protected float  peso;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniaso();
    protected abstract void atacarMordisco();
    
    
}
