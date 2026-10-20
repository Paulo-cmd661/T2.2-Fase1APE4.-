public class Estudiante {
    String nombre;
    double nota1, nota2, nota3;
    double promedio;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = (nota1 + nota2 + nota3) / 3;
    }

    public String getEstado() {
        if (promedio >= 7) {
            return "Aprobado";
        } else if (promedio >= 5) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }
}
