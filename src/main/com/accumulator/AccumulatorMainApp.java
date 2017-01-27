package main.com.accumulator;

public class AccumulatorMainApp {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
////        System.out.println(start);
//        AccumulatorOne accumulatorOne = new AccumulatorOne();
//        accumulatorOne.testIt();
//
//        AccumulatorTwo accumulatorTwo = new AccumulatorTwo();
//        accumulatorTwo.testIt();
//
//        AccumulatorThree accumulatorThree = new AccumulatorThree();
//        accumulatorThree.testIt();
//
//        System.out.println("Time: " + (System.currentTimeMillis() - start));



        Thread thread = new Thread(() -> System.out.println("---END---"));


//        work();




    }


    static void work() {
        try {
            System.out.println("---WORK");
            work();
        } catch (Exception e) {
            System.out.println("---Exception");
            e.printStackTrace();
        } finally {
            work();
            System.out.println("END---");
        }
    }
}
