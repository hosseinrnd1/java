public class Main {
    public static void main(String[] args) {
        Filee file=new Filee("e:\\exercise\\hello.txt");
        Thread thread1=new Thread(file);
        Thread thread2=new Thread(file);
        thread1.start();
        thread2.start();

    }
}
