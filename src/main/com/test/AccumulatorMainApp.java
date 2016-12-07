package main.com.test;

public class AccumulatorMainApp {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        System.out.println(start);
        AccumulatorOne accumulatorOne = new AccumulatorOne();
        accumulatorOne.testIt();

//        AccumulatorTwo accumulatorTwo = new AccumulatorTwo();
//        accumulatorTwo.testIt();
//
//        AccumulatorThree accumulatorThree = new AccumulatorThree();
//        accumulatorThree.testIt();

        System.out.println("Time: " + (System.currentTimeMillis() - start));
    }
}
