package org.example.twoTask;

public class NewRunnable  implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            int number = i % 10;
            if(number == 0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
}
