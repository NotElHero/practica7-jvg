public class Multiplos4 extends Thread {
    static int CUATRO = 4;
    static int SUMA = 0;
    int multiplo;

    public void run(){
        for (int i = 0; i<50000; i++){
            multiplo = CUATRO * i;
            SUMA += multiplo;
            multiplo = CUATRO;
        }
        System.out.println(SUMA);
        System.out.println("El resultado es: " + (Multiplos3.SUMA - SUMA));
    }
}
