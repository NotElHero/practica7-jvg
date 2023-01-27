import static java.lang.Thread.sleep;

public class Principal {
    public static void main(String[] args) {
        Thread multiplos4 = new Multiplos4();
        multiplos4.start();

        Thread multiplos3 = new Multiplos3();
        multiplos3.start();

        while (multiplos3.isAlive() && multiplos4.isAlive()){
            try {
                System.out.println("Calculando resultado...");
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El resultado es: " + (Multiplos3.SUMA - Multiplos4.SUMA));
        multiplos3.interrupt();
        multiplos4.interrupt();
    }
}