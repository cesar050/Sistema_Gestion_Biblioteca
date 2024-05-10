package biblioteca;

import java.util.ArrayList;

public class Seccion {
    private int nombre;
    private int cantidadPublicaciones;
    private int cantidadLibros;
    private int cantidadRevistas;

    //relaciones
    private ArrayList<Estanteria> estanterias;

    public Seccion(int nombre, int cantidadPublicaciones, int cantidadLibros, int cantidadRevistas) {
        this.nombre = nombre;
        this.cantidadPublicaciones = cantidadPublicaciones;
        this.cantidadLibros = cantidadLibros;
        this.cantidadRevistas = cantidadRevistas;
        this.estanterias = new ArrayList<>();
    }
    //
    public int getNombre() {
        return nombre;
    }

}
