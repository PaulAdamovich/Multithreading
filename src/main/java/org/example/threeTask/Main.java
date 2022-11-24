package org.example.threeTask;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");

        NewThread[] threads = new NewThread[]{
                new NewThread(stringBuilder),
                new NewThread(stringBuilder),
                new NewThread(stringBuilder)
        };

        for(NewThread thread : threads){
            thread.start();
        }
    }
}
