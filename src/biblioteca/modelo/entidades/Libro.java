
package biblioteca.modelo.entidades;


public class Libro {
    
    private int isbn;
    private String autor;
    private String titulo;
    private int cantidad;
    private int estado;

    public Libro(int isbn, String autor, String titulo, int cantidad, int estado) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
    
    
    
}
