package org.example.twoTask;

public class Main {
    public static void main(String[] args) throws Exception {
        Thread threadOne = new Thread(new NewRunnable());
        Thread threadTwo = new Thread(new NewRunnable());
        Thread threadThree = new Thread(new NewRunnable());

        System.out.println("===== Thread - 0 =====");
        threadOne.start();
        threadOne.join();

        System.out.println("===== Thread - 1 =====");
        threadTwo.start();
        threadTwo.join();

        System.out.println("===== Thread - 2 =====");
        threadThree.start();
        threadThree.join();
    }
}
