public class Multiplos4 extends Thread {
    static int CUATRO = 4;
    static int SUMA = 0;
    int multiplo;
    Thread multiplos3;

    public Multiplos4(Thread multiplos3) {
        this.multiplos3 = multiplos3;
    }

    public void run(){
        for (int i = 0; i<50000; i++){
            multiplo = CUATRO * i;
            SUMA += multiplo;
            multiplo = CUATRO;
        }
        try {
            multiplos3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(SUMA);
        System.out.println("El resultado es: " + (Multiplos3.SUMA - SUMA));
    }
}
