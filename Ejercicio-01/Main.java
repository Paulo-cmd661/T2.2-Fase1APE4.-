public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Carlos", 8.0, 9.0, 8.5),
            new Estudiante("Ana", 6.0, 5.5, 6.5),
            new Estudiante("Luis", 4.0, 3.5, 5.0),
            new Estudiante("María", 9.5, 10.0, 9.0),
            new Estudiante("Pedro", 7.0, 6.5, 7.5)
        };

        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            System.out.printf("%s : %.2f (%s)%n", e.nombre, e.promedio, e.getEstado());
            if (e.getEstado().equals("Aprobado")) {
                aprobados++;
            }
        }

        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}
