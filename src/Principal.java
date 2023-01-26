import static java.lang.Thread.sleep;

public class Principal {
    public static void main(String[] args) {
        int resultadoSuma;
        Thread multiplos4 = new Multiplos4();
        multiplos4.start();

        Thread multiplos3 = new Multiplos3();
        multiplos3.start();

        while (multiplos3.isAlive() && multiplos4.isAlive()){
            try {
                System.out.println("Calculando resultado...");
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}