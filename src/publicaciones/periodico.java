package publicaciones;

public abstract class periodico {
    protected String titulo;
    protected String fechaPublicaion;
    protected String editorioal;

    //Relaciones
    protected Autor autor;

    public periodico(String titulo, String fechaPublicaion, String editorioal, Autor autor) {
        this.titulo = titulo;
        this.fechaPublicaion = fechaPublicaion;
        this.editorioal = editorioal;
        this.autor = autor;
    }

}
