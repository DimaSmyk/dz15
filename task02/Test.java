package selfwork15.task02;

import selfwork15.task01.Writer;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        String[] array = new String[20_000_000];

        WriterArray array1 = new WriterArray(array);

       WriterArray write = new WriterArray(0,5_000_000);
       WriterArray write1 = new WriterArray(5_000_000,10_000_000);
       WriterArray write2 = new WriterArray(10_000_000,15_000_000);
       WriterArray write3 = new WriterArray(15_000_000,20_000_000);

        Thread thread = new Thread(write);
        Thread thread1 = new Thread(write1);
        Thread thread2 = new Thread(write2);
        Thread tread3 = new Thread(write3);

        thread.start();
        thread1.start();
        thread2.start();
        tread3.start();
        thread.join();
    }
}
