public class Multiplos3 extends Thread{
    static int CUATRO = 4;
    static int SUMA = 0;
    int multiplo;

    public void run(){
        for (int i = 0; i<50000; i++){
            multiplo = CUATRO * i;
            SUMA += multiplo;
//            System.out.println(SUMA);
            multiplo = CUATRO;

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
