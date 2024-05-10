package publicaciones;

public class Libro extends  periodico{
    private String isbn;
    private int paginas;
    private int cpitulos;
    private String descripcion;

    //relaciones
    public Genero genero;

    public Libro(String titulo, String fechaPublicaion, String editorioal, Autor autor, String isbn, int paginas, int cpitulos, String descripcion, Genero genero) {
        super(titulo, fechaPublicaion, editorioal, autor);
        this.isbn = isbn;
        this.paginas = paginas;
        this.cpitulos = cpitulos;
        this.descripcion = descripcion;
        this.genero = genero;

    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCpitulos() {
        return cpitulos;
    }

    public void setCpitulos(int cpitulos) {
        this.cpitulos = cpitulos;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + titulo + '\'' +
                ", Fecha de Publicacion='" + fechaPublicaion + '\'' +
                ", Editorial='" + editorioal + '\'' +
                ", Autor=" + autor +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", cpitulos=" + cpitulos +
                ", descripcion='" + descripcion + '\'' +
                ", genero=" + genero +
                '}';
    }
}
