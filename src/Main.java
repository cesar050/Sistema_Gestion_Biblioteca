import biblioteca.Seccion;
import publicaciones.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la biblioteca de la UNI");
        Autor autor = new Autor("Cesar", "Ramos", "Ecuatoriano");
        Revista revista = new Revista("Programacion paralela", "03/09/2005", "UNI", autor, 12, 1, Categoria.TECHOLOGIA);
        System.out.println(revista);
        Libro libro = new Libro("Python", "12/06/2012", "UNI", autor,
                "01010111001", 689, 25, " Fudamentos de python", Genero.ACADEMICO);
        System.out.println(libro);
        Seccion seccion = new Seccion(1, 10, 35, 0);

        Ejemplar ejemplar = new Ejemplar("12/12/2020", EjemplarCategoria.NUEVO,
                false, true, libro, seccion, null);
        System.out.println(ejemplar);
        System.out.println("Gracias por visitar la biblioteca de la UNI");

    }

}