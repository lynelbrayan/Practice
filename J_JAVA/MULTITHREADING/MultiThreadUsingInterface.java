class Threader implements Runnable {
    int n;
    Thread t;

    Threader(int m, String name) {
        t = new Thread(name+m);
        n = m;
    }

    public void run() {
        try {
            for (int i = 0; i <= 10*n; i = i + n) {
                System.out.println(t.getName() + "\t" + i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class MultiThreadUsingInterfaceDemo {
    public static void main(String[] args) {
        Threader r1 = new Threader(3, "multiple of ");
        Threader r2 = new Threader(5, "multiple of ");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}
