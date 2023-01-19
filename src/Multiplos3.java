public class Multiplos3 extends Thread{
    public void run(){
        final int CUATRO = 4;
        int multiplo;
        int suma = 0;

        for (int i = 0; i<50000; i++){
            multiplo = CUATRO * i;
            suma += multiplo;
            System.out.println(suma);
            multiplo = CUATRO;

            try {
                System.out.println("Calculando resultado...");
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
