public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            new Elevated(i).start();
        }
    }
}
