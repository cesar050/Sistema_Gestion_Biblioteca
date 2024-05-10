package publicaciones;
import biblioteca.Estanteria;
import biblioteca.Seccion;

public class Ejemplar{
    private int codigo;
    private String fechaPublicacion;
    public static int contadorEjemplar = 0;
    private EjemplarCategoria estado;
    private boolean estaDisponible;
    private boolean esPrestable;

    //relaciones
    private Libro libro;
    private Seccion seccion;
    private Estanteria estanteria;

    public Ejemplar(String fechaPublicacion, EjemplarCategoria estado, boolean estaPrestado, boolean esPrestable, Libro libro, Seccion seccion, Estanteria estanteria) {
        this.codigo = contadorEjemplar++;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.estaDisponible = estaPrestado;
        this.esPrestable = esPrestable;
        this.libro = libro;
        this.seccion = seccion;
        this.estanteria = estanteria;
    }
    public int getCodigo() {
        return codigo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setEstado(EjemplarCategoria estado) {
        this.estado = estado;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setIsDisponible(boolean estaPrestado) {
        this.estaDisponible = estaPrestado;
    }

    public boolean isPrestable() {
        return esPrestable;
    }

    public void setPrestable(boolean esPrestable) {
        this.esPrestable = esPrestable;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Estanteria getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Estanteria estanteria) {
        this.estanteria = estanteria;
    }


    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", estado=" + estado +
                ", estaPrestado=" + estaDisponible +
                ", esPrestable=" + esPrestable +
                ", libro=" + libro +
                ", seccion=" + seccion +
                ", estanteria=" + estanteria +
                '}';
    }
}

