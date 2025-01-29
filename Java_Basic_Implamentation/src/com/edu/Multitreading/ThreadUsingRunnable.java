package com.edu.Multitreading;

class Thread1 implements Runnable{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
    }
}
class ThreadUsingRunnable{
    public static void main(String args[]){
        Thread t = new Thread(new Thread1());
        t.start();
    }
}