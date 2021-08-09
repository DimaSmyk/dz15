package selfwork15.task02;


public class WriterArray implements Runnable{

    int startIndex;
    int end;

    public WriterArray(int startIndex, int end) {
        this.startIndex = startIndex;
        this.end = end;
    }

    String[] array = new String[20_000_000];

    @Override
    public void run() {
        //long start = System.currentTimeMillis();
        for (int i = startIndex; i < end; i++) {
            if(i % 5 == 0 && i % 3 ==0){
                array[i] = "FizzBuzz";
            }
            else if (i % 3 == 0){
                array[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                array[i] = "Buzz";
            }
            else {
                array[i] = ";";
            }

        }
//        long stop = System.currentTimeMillis();
//        System.out.println("start: " + start);
//        System.out.println("stop: "+stop);
//        System.out.println(stop-start);
    }

}