public class Main {
    public static void main(String[] args) {
        Cuenta[] cuentas = {
            new Cuenta("Ana", 200),
            new Cuenta("Luis", 350)
        };

        for (Cuenta c : cuentas) {
            int meses = 0;

            while (c.saldo < 500) {
                c.depositar(50);
                meses++;
                System.out.printf("%s : %.2f%n", c.titular, c.saldo);
            }

            System.out.println(c.titular + " necesitó " + meses + " meses");
        }
    }
}
