public class Multiplos4 extends Thread {
    final int TRES = 3;
    int suma = 0;
    int multiplo;

    public void run(){
        for (int i = 0; i<100000; i++){
            multiplo = TRES * i;
            suma += multiplo;
            System.out.println(suma);
            multiplo = TRES;

            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
