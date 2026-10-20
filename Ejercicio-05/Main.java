public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro l4 = new Libro("Rayuela", "Julio Cortázar");

        Socio s1 = new Socio("Juan");
        Socio s2 = new Socio("Sofía");

        // Préstamos
        s1.prestar(l1);
        s1.prestar(l2);
        s2.prestar(l3);

        Libro[] libros = {l1, l2, l3, l4};
        Socio[] socios = {s1, s2};

        int disponibles = 0;

        for (Libro l : libros) {
            String estado = "Prestado";
            if (l.disponible) {
                estado = "Disponible";
                disponibles++;
            }
            System.out.println(l.titulo + " : " + estado);
        }

        for (Socio s : socios) {
            System.out.println(s.nombre + " : " + s.librosPrestados);
        }

        System.out.println("Libros disponibles: " + disponibles);
    }
}
