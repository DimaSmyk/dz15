package selfwork15.task02;

import selfwork15.task01.Writer;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> array = new ArrayList<>(20_000_000);

       WriterArray write = new WriterArray(0,10_000_000);
       WriterArray write1 = new WriterArray(10_000_000,15_000_000);
       WriterArray write2 = new WriterArray(15_000_000,20_000_000);

        Thread thread = new Thread(write);
        Thread thread1 = new Thread(write1);
        Thread thread2 = new Thread(write2);


        long start = System.currentTimeMillis();
        thread.start();
        //long stop = System.currentTimeMillis();
        System.out.println(start);

        long start1 = System.currentTimeMillis();
        thread1.start();
        thread1.join();
        System.out.println(start1);
        thread2.start();
        thread2.join();


    }
}
