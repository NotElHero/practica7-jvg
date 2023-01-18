public class Suma extends Thread {
        public void run(){
            final int TRES = 3;
            int suma = 0;
            int multiplo;

            for (int i = 0; i<100000; i++){
                multiplo = TRES * i;
                suma += multiplo;
                System.out.println(suma);
                multiplo = TRES;

                try {
                    System.out.println("Calculando resultado...");
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
}
