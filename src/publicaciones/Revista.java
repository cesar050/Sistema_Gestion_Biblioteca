package publicaciones;

import java.util.Date;

public class Revista extends  periodico{
    private int numero;
    private int volumen;

    //relaciones
    private Categoria categoria;


    public Revista(String titulo, String fechaPublicaion, String editorioal, Autor autor, int numero, int volumen, Categoria categoria) {
        super(titulo, fechaPublicaion, editorioal, autor);
        this.numero = numero;
        this.volumen = volumen;
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "Titulo='" + titulo + '\'' +
                ", Fecha de Publicacion='" + fechaPublicaion + '\'' +
                ", Editorial='" + editorioal + '\'' +
                ", Autor=" + autor +
                ", numero=" + numero +
                ", volumen=" + volumen +
                ", categoria=" + categoria +

                '}';
    }

}
