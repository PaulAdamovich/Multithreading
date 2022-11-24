package org.example.threeTask;

public class NewThread extends Thread{
    private  StringBuilder stringBuilder;
    public NewThread(StringBuilder stringBuilder){
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run(){
        synchronized (stringBuilder){
            for (int i = 0; i < 100; i++){
                System.out.println(stringBuilder);
            }
            System.out.println("=");
            char ch = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++ch);
        }
    }
}
