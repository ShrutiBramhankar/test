package NSE;

public class ThreadExample {
    public static void main(String[] args) {
        MyThreadExample mt = new MyThreadExample();
        Runnable r = () -> {
            for (int i = 0; i < 100; i++)
                System.out.println(i);
        };
        Runnable r1 = mt::display;
        Thread t = new Thread(r1);
        t.start();
    }}

