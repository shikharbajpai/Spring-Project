import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// lambda Expression
@FunctionalInterface
interface LambdaExp {
    void method1();
}

// Extending Thread class (inheritance)
class counterThread extends Thread {
    int counter;

    // Constructor with parameters as name and counter
    public counterThread(String name, int counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ": Counter = " + counter);
    }
}

// Implements Runnable Interface
//class counterThreadRunnable implements Runnable {
//    int counter;
//    String threadName;
//
//    public counterThreadRunnable(int counter, String threadName) {
//        this.counter = counter;
//        this.threadName = threadName;
//    }
//
//    @Override
//    public void run() {
//        System.out.println(threadName + ": Counter = " + counter);
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Questions 1 : Write a Java program to count the frequency of each element in an array and store the result in a Map");
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 5};
        HashMap<Integer, Integer> result = new HashMap<>(); // create a group of objects result
        System.out.println("Object result" + result);
        for (int j : array) {
//            System.out.println("Key used in result HashMap: " + j);
            if (result.containsKey(j)) {
//                System.out.println(result.get(j)); returns value of result Map.
                int repeatedValue = result.get(j) + 1;
                result.put(j, repeatedValue);
                System.out.println(result);
            } else {
                result.put(j, 1);
                System.out.println(result);
            }
        }
//        System.out.println(result);
        System.out.println("Original Array:" + Arrays.toString(array));
        System.out.println("Frequency of Elements:");
//        System.out.println("forEach(BiConsumer<? super K, super V> action)");
//                Interface Map.Entry return a set
//         Interface Set :  create an unordered collection or list, where duplicate values are not allowed
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Question 2: Write a Java program to create and start three threads. Each thread should print its name and the current value of a shared counter. Ensure that the counter is updated safely using synchronization.");
//        1. By extending Thread class

        counterThread t1 = new counterThread("Thread 1", 1);
        System.out.println("The id of thread 1 is: " + t1.getId());
        System.out.println("The name of thread 1 is: " + t1.getName());
        counterThread t2 = new counterThread("Thread 2", 2);
        counterThread t3 = new counterThread("Thread 3", 3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception is :" + e);
        }
        t2.start();
        t3.start();

/*
        2. By implementing Runnable interface
        counterThreadRunnable ct1 = new counterThreadRunnable(1, "Thread 1");
        Thread th1 = new Thread(ct1);
        counterThreadRunnable ct2 = new counterThreadRunnable(2, "Thread 2");
        Thread th2 = new Thread(ct2);
        counterThreadRunnable ct3 = new counterThreadRunnable(3, "Thread 3");
        Thread th3 = new Thread(ct3);

        System.out.println("Threads implementing Runnable interface");
        th1.start();
        th2.start();
        th3.start();
*/

        System.out.println("Question 3: Write a Java program to find the sum of all even numbers from 1 to 20 using lambda expressions and streams.");
        List<Integer> arrayOfEvenNumbers;
        int sumOfEvenNumbers = 0;
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            num.add(i);
        }
        System.out.println("ArrayList from 1 to 20: " + num);
        Stream<Integer> data = num.stream();
        Stream<Integer> newArray = data.filter(number -> number % 2 == 0);
        System.out.println(newArray);
        arrayOfEvenNumbers = newArray.collect(Collectors.toList());
        System.out.println("ArrayList of even numbers: " + arrayOfEvenNumbers);
        for (int n: arrayOfEvenNumbers) {
            sumOfEvenNumbers += n;
        }
        System.out.println("Sum of even numbers from 1 to 20: " + sumOfEvenNumbers);

        LambdaExp obj = () -> System.out.println("This is method 1 calling");
        obj.method1();
    }
}