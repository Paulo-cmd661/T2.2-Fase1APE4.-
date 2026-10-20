public class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public void prestar(Libro libro) {
        libro.disponible = false;
        librosPrestados++;
    }
}
