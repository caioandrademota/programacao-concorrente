class MiniThread extends Thread {
    int n, t;
    MiniThread(int m, int th) { n=m; t=th; }
    public void run() {
        do { 
            yield(); 
            n--; 
        } while (n>0);
    }
}

public class Death {
    public static void main(String[] argv) {
        int threads = Integer.parseInt(argv[0]);
        int times   = Integer.parseInt(argv[1]);
        for(int i=threads;i>0;i--) {
            MiniThread t = new MiniThread(times, i);
            t.start();
        }
    }
}