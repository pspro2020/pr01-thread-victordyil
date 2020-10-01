public class Elevated extends Thread {
    private final int n;
    Elevated(int n){
        this.n = n;
    }
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.printf("El hilo %s :  %d elevado a %d: %d\n",getName(),n,i,(int)Math.pow(n,i));
        }
    }
}
