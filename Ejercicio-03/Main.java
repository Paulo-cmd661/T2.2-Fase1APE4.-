public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 3, 25.0);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.5);
        Mascota m3 = new Mascota("Rocky", "Perro", 5, 18.0);

        Mascota[] mascotas = {m1, m2, m3};

        for (Mascota m : mascotas) {
            String aviso = "";
            if (m.peso > 20) {
                aviso = " Revisar peso";
            }
            System.out.printf("%s : %s : %.1f%s%n", m.nombre, m.especie, m.peso, aviso);
        }

        Mascota m4 = m1;
        m4.edad = m4.edad + 1;
        System.out.println("Edad de m1: " + m1.edad);

        // La edad de m1 cambió porque m4 = m1 no crea un objeto nuevo,
        // solo copia la referencia. Así, m1 y m4 apuntan al mismo objeto
        // en memoria y al modificar uno se modifica el otro.
    }
}
