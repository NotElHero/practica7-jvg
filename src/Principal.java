import static java.lang.Thread.sleep;

public class Principal {
    public static void main(String[] args) {
        Thread multiplos3 = new Multiplos3();
        Thread multiplos4 = new Multiplos4();

        multiplos3.start();
        while (multiplos3.isAlive()){
            try {
                System.out.println("Calculando resultado...");
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            multiplos3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        multiplos4.start();

        while (multiplos4.isAlive()){
            try {
                System.out.println("Calculando resultado...");
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}