public class Multiplos3 extends Thread{
    static int TRES = 3;
    static int SUMA = 0;
    int multiplo;

    public void run(){
        for (int i = 0; i<100000; i++){
            multiplo = TRES * i;
            SUMA += multiplo;
            multiplo = TRES;
        }
        System.out.println(SUMA);
    }
}
