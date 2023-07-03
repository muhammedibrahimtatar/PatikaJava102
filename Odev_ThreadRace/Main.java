package Odev_ThreadRace;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Tool tool = new Tool();

        /*
        try(ExecutorService pool = Executors.newFixedThreadPool(4)) {
            for (Integer i:tenThousand) {
                pool.execute(tool);
            }
        }
         */
        Thread t1 = new Thread(tool);
        Thread t2 = new Thread(tool);
        Thread t3 = new Thread(tool);
        Thread t4 = new Thread(tool);
        t1.start();t2.start();t3.start();t4.start();

        // to guarantee that there is no any thread alive before printing the sizes
        while (t1.isAlive() || t2.isAlive() ||t3.isAlive() ||t4.isAlive()){}

        System.out.println(" size of odds => "+Tool.odds.size());
        System.out.println(" size of evens => "+Tool.odds.size());

    }
}